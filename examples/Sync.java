// This example demonstrates creating a PDF using common options and saving it
// to a place on the filesystem.
//
// It is created synchronously, which means DocRaptor will render it for up to
// 60 seconds. It is slightly simpler than making documents using the async
// interface but making many documents in parallel or very large documents with
// lots of assets will require the async api.
//
// DocRaptor supports many options for output customization, the full list is
// https://docraptor.com/documentation/api#api_general
//
// You can run this example with: ./script/run_java_file examples/Sync.java

import java.io.*;
import java.net.*;
import com.docraptor.*;

public class Sync {
  public static void main(String[] args) throws Exception {
    ClientApi docraptor = new ClientApi();
    ApiClient client = docraptor.getApiClient();
    client.setUsername("YOUR_API_KEY_HERE"); // this key works for test documents
    // client.setDebugging(true);

    try {
      Doc doc = new Doc();
      doc.setTest(true);                                                   // test documents are free but watermarked
      doc.setDocumentContent("<html><body>Hello World</body></html>");     // supply content directly
      // doc.setDocumentUrl("http://docraptor.com/examples/invoice.html"); // or use a url
      doc.setDocumentType(Doc.DocumentTypeEnum.PDF);                       // PDF or XLS or XLSX
      doc.setName("docraptor-java.pdf");                                   // help you find a document later
      doc.setJavascript(true);                                             // enable JavaScript processing
      // prince_options = new PrinceOptions();
      // doc.setPrinceOptions(prince_options);
      // prince_options.setMedia("screen");                                // use screen styles instead of print styles
      // prince_options.setBaseurl("http://hello.com")                     // pretend URL when using document_content

      File create_response = docraptor.createDoc(doc);
      create_response.renameTo(new File("/tmp/docraptor-java.pdf"));
      System.err.println("Wrote PDF to /tmp/docraptor-java.pdf");
    } catch (com.docraptor.ApiException error) {
      System.err.println(error);
      System.err.println(error.getCode());
      System.err.println(error.getMessage());
      System.err.println(error.getResponseBody());
    }
  }
}
