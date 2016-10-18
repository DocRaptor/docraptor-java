// This example demonstrates creating a PDF using common options and saving it
// to a place on the filesystem.
//
// It is created asynchronously, which means DocRaptor will render it for up to
// 10 minutes. This is useful when creating many documents in parallel, or very
// large documents with lots of assets.
//
// DocRaptor supports many options for output customization, the full list is
// https://docraptor.com/documentation/api#api_general
//
// You can run this example with: ./script/run_java_file examples/Async.java

import java.io.*;
import java.net.*;
import com.docraptor.*;

public class Async {
  public static void main(String[] args) throws Exception {
    try {
      DocApi docraptor = new DocApi();
      ApiClient client = docraptor.getApiClient();
      client.setUsername("YOUR_API_KEY_HERE"); // this key works for test documents
      // client.setDebugging(true);

      Doc doc = new Doc();
      doc.setTest(true);                                                   // test documents are free but watermarked
      doc.setDocumentContent("<html><body>Hello World</body></html>");     // supply content directly
      // doc.setDocumentUrl("http://docraptor.com/examples/invoice.html"); // or use a url
      doc.setDocumentType(Doc.DocumentTypeEnum.PDF);                       // PDF or XLS or XLSX
      doc.setJavascript(true);                                             // enable JavaScript processing
      // prince_options = new PrinceOptions();
      // doc.setPrinceOptions(prince_options);
      // prince_options.setMedia("screen");                                // use screen styles instead of print styles
      // prince_options.setBaseurl("http://hello.com")                     // pretend URL when using document_content

      AsyncDoc response = docraptor.createAsyncDoc(doc);

      while(true) {
        AsyncDocStatus status_response = docraptor.getAsyncDocStatus(response.getStatusId());
        System.err.println("status: " + status_response.getStatus());
        switch (status_response.getStatus()) {
        case "completed":
          byte[] doc_response = docraptor.getAsyncDoc(status_response.getDownloadId());
          FileOutputStream file = new FileOutputStream("/tmp/docraptor-java.pdf");
          file.write(doc_response);
          file.close();
          System.err.println("Wrote PDF to /tmp/docraptor-java.pdf");
          return;
        case "failed":
          System.err.println("FAILED");
          System.err.println(status_response);
          return;
        default:
          Thread.sleep(1000);
          break;
        }
      }
    } catch (com.docraptor.ApiException error) {
      System.err.println(error);
      System.err.println(error.getCode());
      System.err.println(error.getMessage());
      System.err.println(error.getResponseBody());
    }
  }
}
