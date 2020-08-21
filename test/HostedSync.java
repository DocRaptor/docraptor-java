import java.io.*;
import java.lang.*;
import java.net.*;
import java.text.*;
import java.util.*;
import com.docraptor.*;

public class HostedSync {
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
    doc.setName("java-sync.pdf");
    doc.setDocumentType(Doc.DocumentTypeEnum.PDF);
    doc.setDocumentContent("<html><body>Hello from Java</body></html>");
    doc.setTest(true);

    Date tomorrow = new Date(new Date().getTime() + 24 * 60 * 60 * 1000);
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    df.setTimeZone(TimeZone.getTimeZone("UTC"));
    String tomorrowStr = df.format(tomorrow);
    doc.setHostedExpiresAt(tomorrowStr);

    DocStatus statusResponse = docraptor.createHostedDoc(doc);
    byte data[] = docraptor.getAsyncDoc(statusResponse.getDownloadId());
    FileOutputStream out = new FileOutputStream("/tmp/the-file-name.pdf");
    out.write(data);
    out.close();

    BufferedReader br = new BufferedReader(new FileReader("/tmp/the-file-name.pdf"));
    String line = br.readLine();
    if (!line.contains("%PDF-1.5")) {
      throw new IllegalArgumentException("unexpected file header: " + line);
    }
  }
}
