import java.io.*;
import java.lang.*;
import java.net.*;
import java.text.*;
import java.util.*;
import com.docraptor.*;

public class HostedExpire {
  public static void main(String[] args) throws Exception {
    DocApi docraptor = new DocApi();
    ApiClient client = docraptor.getApiClient();
    client.setUsername("YOUR_API_KEY_HERE");
    // client.setDebugging(true);

    Doc doc = new Doc();
    doc.setName("java-async.pdf");
    doc.setDocumentType(Doc.DocumentTypeEnum.PDF);
    doc.setDocumentContent("<html><body>Hello from Java</body></html>");
    doc.setTest(true);

    Date tomorrow = new Date(new Date().getTime() + 24 * 60 * 60 * 1000);
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
    df.setTimeZone(TimeZone.getTimeZone("UTC"));
    String tomorrowStr = df.format(tomorrow);
    doc.setHostedExpiresAt(tomorrowStr);

    DocStatus statusResponse = docraptor.createHostedDoc(doc);
    if (!statusResponse.getStatus().equals("completed")) {
      throw new RuntimeException("Failed creating hosted document");
    }

    String output_file = System.getenv("TEST_OUTPUT_DIR") +
      "/" + System.getenv("TEST_NAME") + "_csharp_" +
      System.getenv("RUNTIME_ENV") + ".pdf";

    try {
      BufferedInputStream in = new BufferedInputStream(new URL(statusResponse.getDownloadUrl()).openStream());
      FileOutputStream fileOutputStream = new FileOutputStream(output_file);

      byte dataBuffer[] = new byte[1024];
      int bytesRead;
      while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
          fileOutputStream.write(dataBuffer, 0, bytesRead);
      }
    } catch (IOException e) {
      throw new IOException("Error downloading hosted document from " + statusResponse.getDownloadUrl(), e);
    }

    BufferedReader br = new BufferedReader(new FileReader(output_file));
    String line = br.readLine();
    if (!line.contains("%PDF-1.5")) {
      throw new IllegalArgumentException("unexpected file header: " + line);
    }

    docraptor.expire(statusResponse.getDownloadId());
    try {
      BufferedInputStream in = new BufferedInputStream(new URL(statusResponse.getDownloadUrl()).openStream());
      FileOutputStream fileOutputStream = new FileOutputStream(output_file);

      byte dataBuffer[] = new byte[1024];
      int bytesRead;
      while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
          fileOutputStream.write(dataBuffer, 0, bytesRead);
      }

      throw new RuntimeException("Document should not exist");
    } catch (IOException e) {
      // success
    }
  }
}
