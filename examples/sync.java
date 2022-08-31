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

      // doc.setDocumentUrl("http://docraptor.com/examples/invoice.html");
      // doc.setJavascript(false);
      // PrinceOptions princeOptions = new PrinceOptions();
      //     princeOptions.setMedia("print"); // @media 'screen' or 'print' CSS
      //     princeOptions.setBaseurl("https://yoursite.com"); // the base URL for any relative URLs
      // doc.setPrinceOptions(princeOptions);

      byte[] pdf = docraptor.createDoc(doc);

      // createDoc() returns a binary string
      FileOutputStream file = new FileOutputStream("docraptor-hello.pdf");
      file.write(pdf);
      file.close();
      System.out.println("Successfully created docraptor-hello.pdf!");
    } catch (ApiException error) {
      System.err.println(error);
      System.err.println(error.getCode());
      System.err.println(error.getMessage());
      System.err.println(error.getResponseBody());
    }
  }
}
