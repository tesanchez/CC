/*
 * Gets users
 * Gets users from DB
 *
 * OpenAPI spec version: 1.0
 * Contact: t.s@sb.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * InlineResponse200
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-02-11T16:49:32.789Z")
public class InlineResponse200   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("start_date")
  private String startDate = null;

  public InlineResponse200 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * user name
   * @return name
   **/
  @JsonProperty("name")
  @ApiModelProperty(example = "Temil Sanchez", value = "user name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse200 startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * start date
   * @return startDate
   **/
  @JsonProperty("start_date")
  @ApiModelProperty(example = "10/10/10", value = "start date")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200 inlineResponse200 = (InlineResponse200) o;
    return Objects.equals(this.name, inlineResponse200.name) &&
        Objects.equals(this.startDate, inlineResponse200.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, startDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

