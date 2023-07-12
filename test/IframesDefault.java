import java.io.*;
import java.net.*;
import com.docraptor.*;

public class IframesDefault {
  public static void main(String[] args) throws Exception {
    DocApi docraptor = new DocApi();
    ApiClient client = docraptor.getApiClient();
    client.setUsername("YOUR_API_KEY_HERE");
    // client.setDebugging(true);

    Doc doc = new Doc();
    doc.setName("java-sync.pdf");
    doc.setDocumentType(Doc.DocumentTypeEnum.PDF);
    doc.setDocumentContent(
      "<html><body>" +
        "<p>Baseline text</p>" +
        "<iframe src=\"https://docraptor-test-harness.herokuapp.com/public/index.html\"></iframe>" +
      "</body></html>"
    );
    doc.setTest(true);
    // PrinceOptions prince_options = new PrinceOptions();
    // prince_options.setIframes(true);
    // doc.setPrinceOptions(prince_options);

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

    String command = "pdftotext " + output_file + " -";

    String[] commands = {"bash", "-c", command};
    Process p = Runtime.getRuntime().exec(commands);
    p.waitFor();
    BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
    String output = "";
    while ((line = b.readLine()) != null) {
      output += line;
    }
    b.close();

    if(!output.contains("Test")) {
      throw new IllegalArgumentException("output should have contained iframe content: " + output);
    }

  }
}
