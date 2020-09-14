import java.io.*;
import java.net.*;
import com.docraptor.*;

public class Async {
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

    AsyncDoc response = docraptor.createAsyncDoc(doc);

    DocStatus statusResponse = null;
    while(true) {
      statusResponse = docraptor.getAsyncDocStatus(response.getStatusId());
      if (statusResponse.getStatus().equals("completed")) {
        break;
      }
      Thread.sleep(1000);
    }

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
