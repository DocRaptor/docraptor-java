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
    doc.setType(Doc.TypeEnum.XLSX);
    doc.setDocumentContent("<html><body><table><tr><td>Hello from Java</td></tr></table></body></html>");
    doc.setTest(true);

    docraptor.createDoc(doc);
  }
}
