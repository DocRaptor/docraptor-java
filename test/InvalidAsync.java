import java.io.*;
import java.net.*;
import docraptor.*;

public class InvalidAsync {
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

    AsyncDoc response = docraptor.asyncDocsPost(doc);

    AsyncDocStatus status_response = null;
    for(int i=0; i<30; i++) {
      status_response = docraptor.statusIdGet(response.getStatusId());
      if (status_response.getStatus().equals("failed")) {
        System.exit(0);
      }
      Thread.sleep(1000);
    }
    System.err.println("Did not receive failed validation within 30 seconds.");
    System.exit(1);


  }
}
