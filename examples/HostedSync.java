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
// DocRaptor supports many CSS and API options for output customization. Visit
// https://docraptor.com/documentation/ for full details.
//
// You can run this example with: ./script/run_java_file examples/HostedSync.java

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

      // different method than the non-hosted documents
      DocStatus statusResponse = docraptor.createHostedDoc(doc);
      System.out.println("The PDF is hosted at " + statusResponse.getDownloadUrl());
    } catch (ApiException error) {
      System.err.println(error);
      System.err.println(error.getCode());
      System.err.println(error.getMessage());
      System.err.println(error.getResponseBody());
    }
  }
}
