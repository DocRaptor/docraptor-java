import java.io.*;
import java.net.*;
import com.docraptor.*;

public class Xlsx {
  public static void main(String[] args) throws Exception {
    DocApi docraptor = new DocApi();
    ApiClient client = docraptor.getApiClient();
    client.setUsername("YOUR_API_KEY_HERE");
    // client.setDebugging(true);

    Doc doc = new Doc();
    doc.setName("java-xlsx.xlsx");
    doc.setDocumentType(Doc.DocumentTypeEnum.XLSX);
    doc.setDocumentContent("<html><body><table><tr><td>Hello from Java</td></tr></table></body></html>");
    doc.setTest(true);

    byte data[] = docraptor.createDoc(doc);

    String output_file = System.getenv("TEST_OUTPUT_DIR") +
      "/" + System.getenv("TEST_NAME") + "_csharp_" +
      System.getenv("RUNTIME_ENV") + ".xlsx";

    FileOutputStream out = new FileOutputStream(output_file);
    out.write(data);
    out.close();

  }
}
