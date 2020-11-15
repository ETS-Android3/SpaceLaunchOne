/**
 * Launch Library
 * The Launch Library API is a product by The Space Devs with an up-to-date database of Spaceflight events.
 *
 * OpenAPI spec version: v2.0.0
 * Contact: support@thespacedevs.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package apimodels;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
public class LaunchListDetailed {
  
  @SerializedName("count")
  private Integer count = null;
  @SerializedName("next")
  private String next = null;
  @SerializedName("previous")
  private String previous = null;
  @SerializedName("results")
  private List<LaunchDetailed> results = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getNext() {
    return next;
  }
  public void setNext(String next) {
    this.next = next;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPrevious() {
    return previous;
  }
  public void setPrevious(String previous) {
    this.previous = previous;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public List<LaunchDetailed> getResults() {
    return results;
  }
  public void setResults(List<LaunchDetailed> results) {
    this.results = results;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaunchListDetailed inlineResponse2007 = (LaunchListDetailed) o;
    return (this.count == null ? inlineResponse2007.count == null : this.count.equals(inlineResponse2007.count)) &&
        (this.next == null ? inlineResponse2007.next == null : this.next.equals(inlineResponse2007.next)) &&
        (this.previous == null ? inlineResponse2007.previous == null : this.previous.equals(inlineResponse2007.previous)) &&
        (this.results == null ? inlineResponse2007.results == null : this.results.equals(inlineResponse2007.results));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.count == null ? 0: this.count.hashCode());
    result = 31 * result + (this.next == null ? 0: this.next.hashCode());
    result = 31 * result + (this.previous == null ? 0: this.previous.hashCode());
    result = 31 * result + (this.results == null ? 0: this.results.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2007 {\n");
    
    sb.append("  count: ").append(count).append("\n");
    sb.append("  next: ").append(next).append("\n");
    sb.append("  previous: ").append(previous).append("\n");
    sb.append("  results: ").append(results).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
