import java.io.*;
import java.net.*;
import com.docraptor.*;

public class PrinceOptionsTest {
  public static void main(String[] args) throws Exception {
    DocApi docraptor = new DocApi();
    ApiClient client = docraptor.getApiClient();
    client.setUsername("YOUR_API_KEY_HERE");
    // client.setDebugging(true);


    // Verify the test works as expected by confirming that this url will fail
    // without prince_options[insecure]=true.
    Doc doc = new Doc();
    doc.setName("java-sync.pdf");
    doc.setDocumentType(Doc.DocumentTypeEnum.PDF);
    doc.setDocumentUrl("https://expired.badssl.com/");
    doc.setTest(true);

    try {
      docraptor.createDoc(doc);
    } catch (com.docraptor.ApiException ex) {
      String expected_message = "SSL Error downloading document content from supplied url.";
      if (!ex.getMessage().contains(expected_message)) {
        System.out.println("Wrong exception, expected: " + expected_message + ", got: " + ex.getMessage());
        System.exit(1);
      }
    }


    // Verify prince_options works by testing a url that will fail without
    // prince_options[insecure]=true.
    doc = new Doc();
    doc.setName("java-sync.pdf");
    doc.setDocumentType(Doc.DocumentTypeEnum.PDF);
    doc.setDocumentUrl("https://expired.badssl.com/");
    doc.setTest(true);
    PrinceOptions prince_options = new PrinceOptions();
    prince_options.setInsecure(true);
    doc.setPrinceOptions(prince_options);

    byte data[] = docraptor.createDoc(doc);

    String output_file = System.getenv("TEST_OUTPUT_DIR") +
      "/" + System.getenv("TEST_NAME") + "_csharp_" +
      System.getenv("RUNTIME_ENV") + ".pdf";

    FileOutputStream out = new FileOutputStream(output_file);
    out.write(data);
    out.close();

    BufferedReader br = new BufferedReader(new FileReader(output_file));
    String line = br.readLine();
    if (!line.contains("%PDF-1.5")) {
      throw new IllegalArgumentException("unexpected file header: " + line);
    }
  }
}
