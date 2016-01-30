# DocRaptor Java Native Client Library

This is a maven package for using [DocRaptor API](http://docraptor.com/documentation) to convert HTML to PDF and XLSX.


## Installation

To install the API client library to your local Maven repository, simply execute:

```bash
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```bash
mvn deploy
```

After the client libarary is installed/deployed, you can use it in your Maven project by adding the following to your *pom.xml*:

```xml
<dependency>
  <groupId>com.docraptor</groupId>
  <artifactId>docraptor</artifactId>
  <version>0.2.0</version>
</dependency>
```


## Usage

See [examples](examples/) for runnable examples with file output, error handling, etc.

```java
import java.io.*;
import java.net.*;
import com.docraptor.*;

public class Sync {
  public static void main(String[] args) throws Exception {
    DocApi docraptor = new DocApi();
    ApiClientclient = docraptor.getApiClient();
   client.setUsername("YOUR_API_KEY_HERE"); // this key works for test documents
    //client.setDebugging(true);

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
    docraptor.createDoc(doc);
  }
}
```

Docs created like this are limited to 60 seconds to render, check out the [async example](examples/Async.java) which allows 10 minutes.

We have guides for doing some of the common things:

* [Headers and Footers](https://docraptor.com/documentation/style#pdf-headers-footers) including page skipping
* [CSS Media Selector](https://docraptor.com/documentation/api#api_basic_pdf) to make the page look exactly as it does in your browser
* [Protected Content](https://docraptor.com/documentation/api#api_advanced_pdf) to secure your URLs so only DocRaptor can access them


## More Help

DocRaptor has a lot of more [styling](https://docraptor.com/documentation/style) and [implementation options](https://docraptor.com/documentation/api).

Stuck? We're experts at using DocRaptor so please [email us](mailto:support@docraptor.com) if you run into trouble.


## Development

The majority of the code in this repo is generated using swagger-codegen on [docraptor.yaml](docraptor.yaml). You can modify this file and regenerate the client using `script/generate_language java`.


## Release Process

1. `script/test`
2. Increment version in code:
  - `swagger-config.json`
  - `build.gradle`
  - `pom.xml`
  - `README.md`
3. Update [CHANGELOG.md](CHANGELOG.md)
4. Tag version: `git tag 'v0.0.x' && git push --tags`
5. Push to GitHub
6. `eval $(gpg-agent --daemon)`
7. `gpg --use-agent --armor --detach-sign`
8. `mvn clean deploy`
9. Use the git tag and make a new release with `target/*` attached, https://github.com/DocRaptor/docraptor-java/tags
10. Update documentation on docraptor.com


## Version Policy

This library follows [Semantic Versioning 2.0.0](http://semver.org).
