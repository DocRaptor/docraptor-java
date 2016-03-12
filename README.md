# DocRaptor Java Native Client Library

This is a maven package for using [DocRaptor API](https://docraptor.com/documentation) to convert [HTML to PDF and XLSX](https://docraptor.com).


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
  <version>0.3.0</version>
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
    ApiClient client = docraptor.getApiClient();
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
* Protect content with [HTTP authentication](https://docraptor.com/documentation/api#api_http_user) or [proxies](https://docraptor.com/documentation/api#api_http_proxy) so only DocRaptor can access them


## More Help

DocRaptor has a lot of more [styling](https://docraptor.com/documentation/style) and [implementation options](https://docraptor.com/documentation/api).

Stuck? We're experts at using DocRaptor so please [email us](mailto:support@docraptor.com) if you run into trouble.


## Development

The majority of the code in this repo is generated using swagger-codegen on [docraptor.yaml](docraptor.yaml). You can modify this file and regenerate the client using `script/generate_language java`.


## Release Process

1. Pull latest master
2. Merge feature branch(es) into master
3. `script/test`
4. Increment version in code:
  - `swagger-config.json`
  - `build.gradle`
  - `pom.xml`
  - `README.md`
5. Update [CHANGELOG.md](CHANGELOG.md)
6. Commit "Release version vX.Y.Z"
7. Push to GitHub
8. Tag version: `git tag 'vX.Y.Z' && git push --tags`
9. `eval $(gpg-agent --daemon)`
10. `echo | gpg --use-agent --armor --detach-sign`
11. `mvn clean deploy`
12. Use the git tag and make a new release with `target/docraptor-*` attached, https://github.com/DocRaptor/docraptor-java/tags
13. Refresh documentation on docraptor.com


## Version Policy

This library follows [Semantic Versioning 2.0.0](http://semver.org).
