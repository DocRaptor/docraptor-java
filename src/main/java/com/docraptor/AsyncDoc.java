package com.docraptor;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;






public class AsyncDoc   {
  
  private String statusId = null;

  
  /**
   * The identifier used to get the status of the document using the status api.
   **/
  
  @ApiModelProperty(value = "The identifier used to get the status of the document using the status api.")
  @JsonProperty("status_id")
  public String getStatusId() {
    return statusId;
  }
  public void setStatusId(String statusId) {
    this.statusId = statusId;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncDoc asyncDoc = (AsyncDoc) o;
    return Objects.equals(statusId, asyncDoc.statusId);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

