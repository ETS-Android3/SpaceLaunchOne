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

package ll2.models;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
public class ExpeditionDetailedSerializerForSpacestation {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("start")
  private Date start = null;
  @SerializedName("end")
  private Date end = null;
  @SerializedName("crew")
  private List<AstronautFlightForExpedition> crew = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public Date getStart() {
    return start;
  }
  public void setStart(Date start) {
    this.start = start;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Date getEnd() {
    return end;
  }
  public void setEnd(Date end) {
    this.end = end;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<AstronautFlightForExpedition> getCrew() {
    return crew;
  }
  public void setCrew(List<AstronautFlightForExpedition> crew) {
    this.crew = crew;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExpeditionDetailedSerializerForSpacestation expeditionDetailedSerializerForSpacestation = (ExpeditionDetailedSerializerForSpacestation) o;
    return (this.id == null ? expeditionDetailedSerializerForSpacestation.id == null : this.id.equals(expeditionDetailedSerializerForSpacestation.id)) &&
        (this.url == null ? expeditionDetailedSerializerForSpacestation.url == null : this.url.equals(expeditionDetailedSerializerForSpacestation.url)) &&
        (this.name == null ? expeditionDetailedSerializerForSpacestation.name == null : this.name.equals(expeditionDetailedSerializerForSpacestation.name)) &&
        (this.start == null ? expeditionDetailedSerializerForSpacestation.start == null : this.start.equals(expeditionDetailedSerializerForSpacestation.start)) &&
        (this.end == null ? expeditionDetailedSerializerForSpacestation.end == null : this.end.equals(expeditionDetailedSerializerForSpacestation.end)) &&
        (this.crew == null ? expeditionDetailedSerializerForSpacestation.crew == null : this.crew.equals(expeditionDetailedSerializerForSpacestation.crew));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.start == null ? 0: this.start.hashCode());
    result = 31 * result + (this.end == null ? 0: this.end.hashCode());
    result = 31 * result + (this.crew == null ? 0: this.crew.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExpeditionDetailedSerializerForSpacestation {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  start: ").append(start).append("\n");
    sb.append("  end: ").append(end).append("\n");
    sb.append("  crew: ").append(crew).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
