/*
 * DocRaptor
 * A native client library for the DocRaptor HTML to PDF/XLS service.
 *
 * OpenAPI spec version: 2.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.docraptor;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DocStatus
 */

public class DocStatus {
  @JsonProperty("status")
  private String status = null;

  @JsonProperty("download_url")
  private String downloadUrl = null;

  @JsonProperty("download_id")
  private String downloadId = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("number_of_pages")
  private Integer numberOfPages = null;

  @JsonProperty("validation_errors")
  private String validationErrors = null;

  public DocStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The present status of the document. Can be queued, working, completed, and failed.
   * @return status
  **/
  @ApiModelProperty(value = "The present status of the document. Can be queued, working, completed, and failed.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public DocStatus downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * The URL where the document can be retrieved. This URL may only be used a few times.
   * @return downloadUrl
  **/
  @ApiModelProperty(value = "The URL where the document can be retrieved. This URL may only be used a few times.")
  public String getDownloadUrl() {
    return downloadUrl;
  }

  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }

  public DocStatus downloadId(String downloadId) {
    this.downloadId = downloadId;
    return this;
  }

   /**
   * The identifier for downloading the document with the download API.
   * @return downloadId
  **/
  @ApiModelProperty(value = "The identifier for downloading the document with the download API.")
  public String getDownloadId() {
    return downloadId;
  }

  public void setDownloadId(String downloadId) {
    this.downloadId = downloadId;
  }

  public DocStatus message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Additional information.
   * @return message
  **/
  @ApiModelProperty(value = "Additional information.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public DocStatus numberOfPages(Integer numberOfPages) {
    this.numberOfPages = numberOfPages;
    return this;
  }

   /**
   * Number of PDF pages in document.
   * @return numberOfPages
  **/
  @ApiModelProperty(value = "Number of PDF pages in document.")
  public Integer getNumberOfPages() {
    return numberOfPages;
  }

  public void setNumberOfPages(Integer numberOfPages) {
    this.numberOfPages = numberOfPages;
  }

  public DocStatus validationErrors(String validationErrors) {
    this.validationErrors = validationErrors;
    return this;
  }

   /**
   * Error information.
   * @return validationErrors
  **/
  @ApiModelProperty(value = "Error information.")
  public String getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(String validationErrors) {
    this.validationErrors = validationErrors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocStatus docStatus = (DocStatus) o;
    return Objects.equals(this.status, docStatus.status) &&
        Objects.equals(this.downloadUrl, docStatus.downloadUrl) &&
        Objects.equals(this.downloadId, docStatus.downloadId) &&
        Objects.equals(this.message, docStatus.message) &&
        Objects.equals(this.numberOfPages, docStatus.numberOfPages) &&
        Objects.equals(this.validationErrors, docStatus.validationErrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, downloadUrl, downloadId, message, numberOfPages, validationErrors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocStatus {\n");

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
