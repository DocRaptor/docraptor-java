package com.docraptor;

import java.util.Objects;
import com.docraptor.PrinceOptions;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class Doc   {

  private String pipeline = null;
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
   * Specify a specific verison of the DocRaptor Pipeline to use.
   **/
  public Doc pipeline(String pipeline) {
    this.pipeline = pipeline;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Specify a specific verison of the DocRaptor Pipeline to use.")
  @JsonProperty("pipeline")
  public String getPipeline() {
    return pipeline;
  }
  public void setPipeline(String pipeline) {
    this.pipeline = pipeline;
  }


  /**
   * A name for identifying your document.
   **/
  public Doc name(String name) {
    this.name = name;
    return this;
  }

  @ApiModelProperty(example = "null", value = "A name for identifying your document.")
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
  public Doc documentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
    return this;
  }

  @ApiModelProperty(example = "null", required = true, value = "The type of document being created.")
  @JsonProperty("document_type")
  public DocumentTypeEnum getDocumentType() {
    return documentType;
  }
  public void setDocumentType(DocumentTypeEnum documentType) {
    this.documentType = documentType;
  }


  /**
   * The HTML data to be transformed into a document. You must supply content using document_content or document_url.
   **/
  public Doc documentContent(String documentContent) {
    this.documentContent = documentContent;
    return this;
  }

  @ApiModelProperty(example = "null", required = true, value = "The HTML data to be transformed into a document. You must supply content using document_content or document_url.")
  @JsonProperty("document_content")
  public String getDocumentContent() {
    return documentContent;
  }
  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


  /**
   * The URL to fetch the HTML data to be transformed into a document. You must supply content using document_content or document_url.
   **/
  public Doc documentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
    return this;
  }

  @ApiModelProperty(example = "null", value = "The URL to fetch the HTML data to be transformed into a document. You must supply content using document_content or document_url.")
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
  public Doc test(Boolean test) {
    this.test = test;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Enable test mode for this document. Test documents are not charged for but include a watermark.")
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
  public Doc strict(StrictEnum strict) {
    this.strict = strict;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Force strict HTML validation.")
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
  public Doc ignoreResourceErrors(Boolean ignoreResourceErrors) {
    this.ignoreResourceErrors = ignoreResourceErrors;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Failed loading of images/javascripts/stylesheets/etc. will not cause the rendering to stop.")
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
  public Doc tag(String tag) {
    this.tag = tag;
    return this;
  }

  @ApiModelProperty(example = "null", value = "A field for storing a small amount of metadata with this document.")
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
  public Doc help(Boolean help) {
    this.help = help;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Request support help with this request if it succeeds.")
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
  public Doc javascript(Boolean javascript) {
    this.javascript = javascript;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Enable DocRaptor JavaScript parsing. PrinceXML JavaScript parsing is also available elsewhere.")
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
  public Doc referrer(String referrer) {
    this.referrer = referrer;
    return this;
  }

  @ApiModelProperty(example = "null", value = "Set HTTP referrer when generating this document.")
  @JsonProperty("referrer")
  public String getReferrer() {
    return referrer;
  }
  public void setReferrer(String referrer) {
    this.referrer = referrer;
  }


  /**
   * A URL that will receive a POST request after successfully completing an asynchronous document. The POST data will include download_url and download_id similar to status api responses. WARNING: this only works on asynchronous documents.
   **/
  public Doc callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

  @ApiModelProperty(example = "null", value = "A URL that will receive a POST request after successfully completing an asynchronous document. The POST data will include download_url and download_id similar to status api responses. WARNING: this only works on asynchronous documents.")
  @JsonProperty("callback_url")
  public String getCallbackUrl() {
    return callbackUrl;
  }
  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }


  /**
   **/
  public Doc princeOptions(PrinceOptions princeOptions) {
    this.princeOptions = princeOptions;
    return this;
  }

  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("prince_options")
  public PrinceOptions getPrinceOptions() {
    return princeOptions;
  }
  public void setPrinceOptions(PrinceOptions princeOptions) {
    this.princeOptions = princeOptions;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Doc doc = (Doc) o;
    return Objects.equals(this.pipeline, doc.pipeline) &&
        Objects.equals(this.name, doc.name) &&
        Objects.equals(this.documentType, doc.documentType) &&
        Objects.equals(this.documentContent, doc.documentContent) &&
        Objects.equals(this.documentUrl, doc.documentUrl) &&
        Objects.equals(this.test, doc.test) &&
        Objects.equals(this.strict, doc.strict) &&
        Objects.equals(this.ignoreResourceErrors, doc.ignoreResourceErrors) &&
        Objects.equals(this.tag, doc.tag) &&
        Objects.equals(this.help, doc.help) &&
        Objects.equals(this.javascript, doc.javascript) &&
        Objects.equals(this.referrer, doc.referrer) &&
        Objects.equals(this.callbackUrl, doc.callbackUrl) &&
        Objects.equals(this.princeOptions, doc.princeOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pipeline, name, documentType, documentContent, documentUrl, test, strict, ignoreResourceErrors, tag, help, javascript, referrer, callbackUrl, princeOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Doc {\n");

    sb.append("    pipeline: ").append(toIndentedString(pipeline)).append("\n");
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

