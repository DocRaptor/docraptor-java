package docraptor;

import docraptor.StringUtil;
import docraptor.PrinceOptions;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-05T11:45:34.151-05:00")
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
  public String toString() {
    return value;
  }
}

  private DocumentTypeEnum documentType = null;
  private String documentContent = null;
  private String documentUrl = null;
  private Boolean test = null;

public enum StrictEnum {
  NONE("none");

  private String value;

  StrictEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private StrictEnum strict = null;
  private String tag = null;
  private Boolean help = null;
  private Boolean javascript = null;
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
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Doc {\n");
    
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    documentType: ").append(StringUtil.toIndentedString(documentType)).append("\n");
    sb.append("    documentContent: ").append(StringUtil.toIndentedString(documentContent)).append("\n");
    sb.append("    documentUrl: ").append(StringUtil.toIndentedString(documentUrl)).append("\n");
    sb.append("    test: ").append(StringUtil.toIndentedString(test)).append("\n");
    sb.append("    strict: ").append(StringUtil.toIndentedString(strict)).append("\n");
    sb.append("    tag: ").append(StringUtil.toIndentedString(tag)).append("\n");
    sb.append("    help: ").append(StringUtil.toIndentedString(help)).append("\n");
    sb.append("    javascript: ").append(StringUtil.toIndentedString(javascript)).append("\n");
    sb.append("    referrer: ").append(StringUtil.toIndentedString(referrer)).append("\n");
    sb.append("    callbackUrl: ").append(StringUtil.toIndentedString(callbackUrl)).append("\n");
    sb.append("    princeOptions: ").append(StringUtil.toIndentedString(princeOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
