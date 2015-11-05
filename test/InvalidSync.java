import java.io.*;
import java.net.*;
import docraptor.*;

public class InvalidSync {
  public static void main(String[] args) throws Exception{
    ClientApi docraptor = new ClientApi();
    ApiClient foo = docraptor.getApiClient();
    foo.setUsername("YOUR_API_KEY_HERE");
    foo.setDebugging(true);

    Doc doc = new Doc();
    doc.setName(new String(new char[201]).replace("\0", "s"));
    doc.setDocumentType(Doc.DocumentTypeEnum.PDF);
    doc.setDocumentContent("<html><body>Swagger Java</body></html>");
    doc.setTest(true);

    try {
      docraptor.docsPost(doc);
    } catch (docraptor.ApiException error) {
      System.exit(0);
    }
    System.err.println("Exception expected, but not raised");
    System.exit(1);
  }
}
