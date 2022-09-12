// This example demonstrates creating a PDF using common options and saving it
// to a place on the filesystem.
//
// It is created synchronously, which means DocRaptor will render it for up to
// 60 seconds. It is slightly simpler than making documents using the async
// interface but making many documents in parallel or very large documents with
// lots of assets will require the async api.
//
// DocRaptor supports many CSS and API options for output customization. Visit
// https://docraptor.com/documentation/ for full details.
//
// You can run this example with: ./script/run_java_file examples/Sync.java

import com.docraptor.*;
import java.io.*;
import java.net.*;
import java.nio.file.*;

public class Sync {

  public static void main(String[] args) throws Exception {
    DocApi docraptor = new DocApi();
    ApiClient client = docraptor.getApiClient();
    client.setUsername("YOUR_API_KEY_HERE"); // this key works in test mode!

    try {
      Doc doc = new Doc();
      doc.setTest(true); // test documents are free but watermarked
      doc.setDocumentType(Doc.DocumentTypeEnum.PDF);

      doc.setDocumentContent("<html><body>Hello World!</body></html>");

      // doc.setDocumentUrl("https://docraptor.com/examples/invoice.html");
      // doc.setJavascript(true);
      // PrinceOptions princeOptions = new PrinceOptions();
      // princeOptions.setMedia("print"); // @media 'screen' or 'print' CSS
      // princeOptions.setBaseurl("https://yoursite.com"); // the base URL for any relative URLs
      // doc.setPrinceOptions(princeOptions);

      byte[] document = docraptor.createDoc(doc);

      // createDoc() returns a binary string
      FileOutputStream file = new FileOutputStream("github-sync.pdf");
      file.write(document);
      file.close();
      System.out.println("Successfully created github-sync.pdf!");
    } catch (ApiException error) {
      System.err.println(error);
      System.err.println(error.getCode());
      System.err.println(error.getMessage());
      System.err.println(error.getResponseBody());
    }
  }
}
