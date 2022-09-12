// This example demonstrates creating a PDF using common options and saving it
// to a place on the filesystem.
//
// It is created asynchronously, which means DocRaptor will render it for up to
// 10 minutes. This is useful when creating many documents in parallel, or very
// large documents with lots of assets.
//
// DocRaptor supports many CSS and API options for output customization. Visit
// https://docraptor.com/documentation/ for full details.
//
// You can run this example with: ./script/run_java_file examples/Async.java

import com.docraptor.*;
import java.io.*;
import java.net.*;
import java.nio.file.*;

public class DocRaptorExample {

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

      // different method than the synchronous documents
      AsyncDoc response = docraptor.createAsyncDoc(doc);

      while (true) {
        DocStatus statusResponse = docraptor.getAsyncDocStatus(response.getStatusId());
        System.out.println("status: " + statusResponse.getStatus());
        if (statusResponse.getStatus().equals("completed")) {
          // createAsyncDoc() returns a binary string
          byte[] docResponse = docraptor.getAsyncDoc(statusResponse.getDownloadId());
          FileOutputStream file = new FileOutputStream("github-async.pdf");
          file.write(docResponse);
          file.close();
          System.out.println("Successfully created github-async.pdf!");
          return;
        } else if (statusResponse.getStatus().equals("failed")) {
          System.err.println("FAILED");
          System.err.println(statusResponse);
          return;
        } else {
          Thread.sleep(1000);
        }
      }
    } catch (ApiException error) {
      System.err.println(error);
      System.err.println(error.getCode());
      System.err.println(error.getMessage());
      System.err.println(error.getResponseBody());
    }
  }
}
