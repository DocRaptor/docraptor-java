package docraptor;

import docraptor.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-11-05T11:45:34.151-05:00")
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
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncDoc {\n");
    
    sb.append("    statusId: ").append(StringUtil.toIndentedString(statusId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
