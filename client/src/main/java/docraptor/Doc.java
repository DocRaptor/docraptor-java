package docraptor;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import docraptor.PrinceOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;





@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-01-13T21:30:07.177-05:00")
public class Doc   {
  
  private String name = null;


  public enum DocumentTypeEnum {
    PDF("pdf"),
    XLS("xls"),
    XLSX("xlsx");

    private String value;

    DocumentTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private DocumentTypeEnum documentType = null;
  private String documentContent = null;
  private String documentUrl = null;
  private Boolean test = true;


  public enum StrictEnum {
    NONE("none");

    private String value;

    StrictEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private StrictEnum strict = StrictEnum.NONE;
  private Boolean ignoreResourceErrors = true;
  private String tag = null;
  private Boolean help = false;
  private Boolean javascript = false;
  private String referrer = null;
  private String callbackUrl = null;
  private PrinceOptions princeOptions = null;

  
  /**
   * A name for identifying your document.
   **/
  
  @ApiModelProperty(required = true, value = "A name for identifying your document.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The type of document being created.
   **/
  
  @ApiModelProperty(required = true, value = "The type of document being created.")
  @JsonProperty("document_type")
  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }
  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }

  
  /**
   * The HTML data to be transformed into a document.\nYou must supply content using document_content or document_url.
   **/
  
  @ApiModelProperty(required = true, value = "The HTML data to be transformed into a document.\nYou must supply content using document_content or document_url.")
  @JsonProperty("document_content")
  public String getDocumentContent() {
    return documentContent;
  }
  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }

  
  /**
   * The URL to fetch the HTML data to be transformed into a document.\nYou must supply content using document_content or document_url.
   **/
  
  @ApiModelProperty(value = "The URL to fetch the HTML data to be transformed into a document.\nYou must supply content using document_content or document_url.")
  @JsonProperty("document_url")
  public String getDocumentUrl() {
    return documentUrl;
  }
  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }

  
  /**
   * Enable test mode for this document. Test documents are not charged for but include a watermark.
   **/
  
  @ApiModelProperty(value = "Enable test mode for this document. Test documents are not charged for but include a watermark.")
  @JsonProperty("test")
  public Boolean getTest() {
    return test;
  }
  public void setTest(Boolean test) {
    this.test = test;
  }

  
  /**
   * Force strict HTML validation.
   **/
  
  @ApiModelProperty(value = "Force strict HTML validation.")
  @JsonProperty("strict")
  public StrictEnum getStrict() {
    return strict;
  }
  public void setStrict(StrictEnum strict) {
    this.strict = strict;
  }

  
  /**
   * Failed loading of images/javascripts/stylesheets/etc. will not cause the rendering to stop.
   **/
  
  @ApiModelProperty(value = "Failed loading of images/javascripts/stylesheets/etc. will not cause the rendering to stop.")
  @JsonProperty("ignore_resource_errors")
  public Boolean getIgnoreResourceErrors() {
    return ignoreResourceErrors;
  }
  public void setIgnoreResourceErrors(Boolean ignoreResourceErrors) {
    this.ignoreResourceErrors = ignoreResourceErrors;
  }

  
  /**
   * A field for storing a small amount of metadata with this document.
   **/
  
  @ApiModelProperty(value = "A field for storing a small amount of metadata with this document.")
  @JsonProperty("tag")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }

  
  /**
   * Request support help with this request if it succeeds.
   **/
  
  @ApiModelProperty(value = "Request support help with this request if it succeeds.")
  @JsonProperty("help")
  public Boolean getHelp() {
    return help;
  }
  public void setHelp(Boolean help) {
    this.help = help;
  }

  
  /**
   * Enable DocRaptor JavaScript parsing. PrinceXML JavaScript parsing is also available elsewhere.
   **/
  
  @ApiModelProperty(value = "Enable DocRaptor JavaScript parsing. PrinceXML JavaScript parsing is also available elsewhere.")
  @JsonProperty("javascript")
  public Boolean getJavascript() {
    return javascript;
  }
  public void setJavascript(Boolean javascript) {
    this.javascript = javascript;
  }

  
  /**
   * Set HTTP referrer when generating this document.
   **/
  
  @ApiModelProperty(value = "Set HTTP referrer when generating this document.")
  @JsonProperty("referrer")
  public String getReferrer() {
    return referrer;
  }
  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }

  
  /**
   * A URL that will receive a POST request after successfully completing an asynchronous document.\nThe POST data will include download_url and download_id similar to status api responses.\nWARNING: this only works on asynchronous documents.
   **/
  
  @ApiModelProperty(value = "A URL that will receive a POST request after successfully completing an asynchronous document.\nThe POST data will include download_url and download_id similar to status api responses.\nWARNING: this only works on asynchronous documents.")
  @JsonProperty("callback_url")
  public String getCallbackUrl() {
    return callbackUrl;
  }
  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  
  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prince_options")
  public PrinceOptions getPrinceOptions() {
    return princeOptions;
  }
  public void setPrinceOptions(PrinceOptions princeOptions) {
    this.princeOptions = princeOptions;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Doc doc = (Doc) o;
    return Objects.equals(name, doc.name) &&
        Objects.equals(documentType, doc.documentType) &&
        Objects.equals(documentContent, doc.documentContent) &&
        Objects.equals(documentUrl, doc.documentUrl) &&
        Objects.equals(test, doc.test) &&
        Objects.equals(strict, doc.strict) &&
        Objects.equals(ignoreResourceErrors, doc.ignoreResourceErrors) &&
        Objects.equals(tag, doc.tag) &&
        Objects.equals(help, doc.help) &&
        Objects.equals(javascript, doc.javascript) &&
        Objects.equals(referrer, doc.referrer) &&
        Objects.equals(callbackUrl, doc.callbackUrl) &&
        Objects.equals(princeOptions, doc.princeOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, documentType, documentContent, documentUrl, test, strict, ignoreResourceErrors, tag, help, javascript, referrer, callbackUrl, princeOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Doc {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    documentContent: ").append(toIndentedString(documentContent)).append("\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    strict: ").append(toIndentedString(strict)).append("\n");
    sb.append("    ignoreResourceErrors: ").append(toIndentedString(ignoreResourceErrors)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    help: ").append(toIndentedString(help)).append("\n");
    sb.append("    javascript: ").append(toIndentedString(javascript)).append("\n");
    sb.append("    referrer: ").append(toIndentedString(referrer)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    princeOptions: ").append(toIndentedString(princeOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

