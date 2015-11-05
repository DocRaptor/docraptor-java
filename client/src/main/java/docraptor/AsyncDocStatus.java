package docraptor;

import docraptor.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-05T11:45:34.151-05:00")
public class AsyncDocStatus   {
  
  private String status = null;
  private String downloadUrl = null;
  private String downloadId = null;
  private String message = null;
  private Integer numberOfPages = null;
  private String validationErrors = null;

  
  /**
   * The present status of the document. Can be queued, working, completed, and failed.
   **/
  @ApiModelProperty(value = "The present status of the document. Can be queued, working, completed, and failed.")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * The URL where the document can be retrieved. This URL may only be used a few times.
   **/
  @ApiModelProperty(value = "The URL where the document can be retrieved. This URL may only be used a few times.")
  @JsonProperty("download_url")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  
  /**
   * The identifier for downloading the document with the download api.
   **/
  @ApiModelProperty(value = "The identifier for downloading the document with the download api.")
  @JsonProperty("download_id")
  public String getDownloadId() {
    return downloadId;
  }
  public void setDownloadId(String downloadId) {
    this.downloadId = downloadId;
  }

  
  /**
   * Additional information.
   **/
  @ApiModelProperty(value = "Additional information.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   * Number of PDF pages in document.
   **/
  @ApiModelProperty(value = "Number of PDF pages in document.")
  @JsonProperty("number_of_pages")
  public Integer getNumberOfPages() {
    return numberOfPages;
  }
  public void setNumberOfPages(Integer numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  
  /**
   * Error information.
   **/
  @ApiModelProperty(value = "Error information.")
  @JsonProperty("validation_errors")
  public String getValidationErrors() {
    return validationErrors;
  }
  public void setValidationErrors(String validationErrors) {
    this.validationErrors = validationErrors;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncDocStatus {\n");
    
    sb.append("    status: ").append(StringUtil.toIndentedString(status)).append("\n");
    sb.append("    downloadUrl: ").append(StringUtil.toIndentedString(downloadUrl)).append("\n");
    sb.append("    downloadId: ").append(StringUtil.toIndentedString(downloadId)).append("\n");
    sb.append("    message: ").append(StringUtil.toIndentedString(message)).append("\n");
    sb.append("    numberOfPages: ").append(StringUtil.toIndentedString(numberOfPages)).append("\n");
    sb.append("    validationErrors: ").append(StringUtil.toIndentedString(validationErrors)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
