import java.io.*;
import java.net.*;
import com.docraptor.*;

public class InvalidAsync {
  public static void main(String[] args) throws Exception {
    DocApi docraptor = new DocApi();
    ApiClient client = docraptor.getApiClient();
    client.setUsername("YOUR_API_KEY_HERE");
    // client.setDebugging(true);

    Doc doc = new Doc();
    doc.setName(new String(new char[201]).replace("\0", "s")); // limit is 200 characters
    doc.setType(Doc.TypeEnum.PDF);
    doc.setDocumentContent("<html><body>Hello from Java</body></html>");
    doc.setTest(true);

    AsyncDoc response = docraptor.createAsyncDoc(doc);

    AsyncDocStatus status_response = null;
    for(int i=0; i<30; i++) {
      status_response = docraptor.getAsyncDocStatus(response.getStatusId());
      if (status_response.getStatus().equals("failed")) {
        System.exit(0);
      }
      Thread.sleep(1000);
    }
    System.err.println("Did not receive failed validation within 30 seconds.");
    System.exit(1);
  }
}
