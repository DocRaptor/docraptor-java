import java.io.*;
import java.lang.*;
import java.net.*;
import java.text.*;
import java.util.*;
import com.docraptor.*;

public class HostedExpire {
  public static void main(String[] args) throws Exception {
    String api_key = "YOUR_API_KEY_HERE";
    try (BufferedReader br = new BufferedReader(new FileReader("../.docraptor_key"))) {
      api_key = br.readLine().trim();
    } catch (IOException e) {
      throw new RuntimeException("Please put a valid (paid plan) api key in the .docraptor_key file when testing this feature.", e);
    }

    DocApi docraptor = new DocApi();
    ApiClient client = docraptor.getApiClient();
    client.setUsername(api_key);
    // client.setDebugging(true);

    Doc doc = new Doc();
    doc.setName("java-async.pdf");
    doc.setDocumentType(Doc.DocumentTypeEnum.PDF);
    doc.setDocumentContent("<html><body>Hello from Java</body></html>");
    doc.setTest(true);

    Date tomorrow = new Date(new Date().getTime() + 24 * 60 * 60 * 1000);
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    df.setTimeZone(TimeZone.getTimeZone("UTC"));
    String tomorrow_str = df.format(tomorrow);
    doc.setHostedExpiresAt(tomorrow_str);

    DocStatus status_response = docraptor.createHostedDoc(doc);
    if (!status_response.getStatus().equals("completed")) {
      throw new RuntimeException("Failed creating hosted document");
    }

    byte data[] = docraptor.getAsyncDoc(status_response.getDownloadId());
    FileOutputStream out = new FileOutputStream("/tmp/the-file-name.pdf");
    out.write(data);
    out.close();

    BufferedReader br = new BufferedReader(new FileReader("/tmp/the-file-name.pdf"));
    String line = br.readLine();
    if (!line.contains("%PDF-1.5")) {
      throw new IllegalArgumentException("unexpected file header: " + line);
    }

    docraptor.expire(status_response.getDownloadId());
    try {
      data = docraptor.getAsyncDoc(status_response.getDownloadId());
      throw new RuntimeException("Document should not exist");
    } catch (ApiException e) {
      // success
    }
  }
}
