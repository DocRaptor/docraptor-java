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
 * AsyncDoc
 */

public class AsyncDoc {
  @JsonProperty("status_id")
  private String statusId = null;

  public AsyncDoc statusId(String statusId) {
    this.statusId = statusId;
    return this;
  }

   /**
   * The identifier used to get the status of the document using the status API.
   * @return statusId
  **/
  @ApiModelProperty(value = "The identifier used to get the status of the document using the status API.")
  public String getStatusId() {
    return statusId;
  }

  public void setStatusId(String statusId) {
    this.statusId = statusId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncDoc asyncDoc = (AsyncDoc) o;
    return Objects.equals(this.statusId, asyncDoc.statusId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncDoc {\n");

    sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
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

