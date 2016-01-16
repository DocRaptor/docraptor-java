import java.io.*;
import java.net.*;
import docraptor.*;

public class Sync {
  public static void main(String[] args) throws Exception {
    ClientApi docraptor = new ClientApi();
    ApiClient client = docraptor.getApiClient();
    client.setUsername("YOUR_API_KEY_HERE");
    // client.setDebugging(true);

    Doc doc = new Doc();
    doc.setName("java-sync.pdf");
    doc.setDocumentType(Doc.DocumentTypeEnum.PDF);
    doc.setDocumentContent("<html><body>Hello from Java</body></html>");
    doc.setTest(true);

    docraptor.createDoc(doc);
  }
}
