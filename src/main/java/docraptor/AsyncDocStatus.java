package docraptor;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncDocStatus asyncDocStatus = (AsyncDocStatus) o;
    return Objects.equals(status, asyncDocStatus.status) &&
        Objects.equals(downloadUrl, asyncDocStatus.downloadUrl) &&
        Objects.equals(downloadId, asyncDocStatus.downloadId) &&
        Objects.equals(message, asyncDocStatus.message) &&
        Objects.equals(numberOfPages, asyncDocStatus.numberOfPages) &&
        Objects.equals(validationErrors, asyncDocStatus.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, downloadUrl, downloadId, message, numberOfPages, validationErrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncDocStatus {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    downloadId: ").append(toIndentedString(downloadId)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    numberOfPages: ").append(toIndentedString(numberOfPages)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
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

