import java.io.*;
import java.net.*;
import com.docraptor.*;

public class InvalidSync {
  public static void main(String[] args) throws Exception {
    DocApi docraptor = new DocApi();
    ApiClient client = docraptor.getApiClient();
    client.setUsername("YOUR_API_KEY_HERE");
    // client.setDebugging(true);

    Doc doc = new Doc();
    doc.setName(new String(new char[201]).replace("\0", "s")); // limit is 200 characters
    doc.setDocumentType(Doc.DocumentTypeEnum.PDF);
    doc.setDocumentContent("<html><body>Hello from Java</body></html>");
    doc.setTest(true);

    try {
      docraptor.createDoc(doc);
    } catch (com.docraptor.ApiException error) {
      System.exit(0);
    }
    System.err.println("Exception expected, but not raised");
    System.exit(1);
  }
}
