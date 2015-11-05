import java.io.*;
import java.net.*;
import docraptor.*;

public class Async {
  public static void main(String[] args) throws Exception{
    ClientApi docraptor = new ClientApi();
    ApiClient foo = docraptor.getApiClient();
    foo.setUsername("YOUR_API_KEY_HERE");
    foo.setDebugging(true);

    Doc doc = new Doc();
    doc.setName("swagger-java.pdf");
    doc.setDocumentType(Doc.DocumentTypeEnum.PDF);
    doc.setDocumentContent("<html><body>Swagger Java</body></html>");
    doc.setTest(true);

    AsyncDoc response = docraptor.asyncDocsPost(doc);

    AsyncDocStatus status_response = null;
    while(true) {
      status_response = docraptor.statusIdGet(response.getStatusId());
      if (status_response.getStatus().equals("completed")) {
        break;
      }
      Thread.sleep(1000);
    }

    docraptor.downloadIdGet(status_response.getDownloadId());

  }
}
