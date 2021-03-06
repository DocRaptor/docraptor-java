// As a paid add-on, DocRaptor can provide long-term, publicly-accessible hosting for your documents.
// This allows you to provide a URL to your end users, third party tools like Zapier and Salesforce,
// or anyone else. We'll host the document on your behalf at a completely unbranded URL for as long
// as you want, or within the limits you specify.
//
// This example demonstrates creating a PDF that DocRaptor will host for you using common options.
// By default, hosted documents do not have limits on downloads or hosting time, though you may
// pass additional parameters to the document generation call to set your own limits. Learn more
// about the specific options in the hosted API documentation.
// https://docraptor.com/documentation/api#api_hosted
//
// It is created synchronously, which means DocRaptor will allow it to generate for up to 60 seconds.
// Since this document will be hosted by DocRaptor the response from this request will return a JSON
// formatted object containing public URL where the document can be downloaded from.
//
// DocRaptor supports many options for output customization, the full list is
// https://docraptor.com/documentation/api#api_general
//
// You can run this example with: ./script/run_java_file examples/HostedSync.java

import java.io.*;
import java.net.*;
import com.docraptor.*;

public class HostedSync {
  public static void main(String[] args) throws Exception {
    DocApi docraptor = new DocApi();
    ApiClient client = docraptor.getApiClient();
    client.setUsername("YOUR_API_KEY_HERE");
    // client.setDebugging(true);

    try {
      Doc doc = new Doc();
      doc.setTest(true);                                                   // test documents are free but watermarked
      doc.setDocumentContent("<html><body>Hello World</body></html>");     // supply content directly
      // doc.setDocumentUrl("http://docraptor.com/examples/invoice.html"); // or use a url
      doc.setDocumentType(Doc.DocumentTypeEnum.PDF);                       // PDF or XLS or XLSX
      doc.setName("docraptor-java.pdf");                                   // help you find a document later
      doc.setJavascript(true);                                             // enable JavaScript processing
      // princeOptions = new PrinceOptions();
      // doc.setPrinceOptions(princeOptions);
      // princeOptions.setMedia("screen");                                // use screen styles instead of print styles
      // princeOptions.setBaseurl("http://hello.com")                     // pretend URL when using document_content

      DocStatus statusResponse = docraptor.createHostedDoc(doc);
      System.err.println("Hosted Async Download URL: " + statusResponse.getDownloadUrl());
    } catch (com.docraptor.ApiException error) {
      System.err.println(error);
      System.err.println(error.getCode());
      System.err.println(error.getMessage());
      System.err.println(error.getResponseBody());
    }
  }
}
