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

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "")
public class LaunchStatus {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("name")
  private String name = null;

  /**
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LaunchStatus launchStatus = (LaunchStatus) o;
    return (this.id == null ? launchStatus.id == null : this.id.equals(launchStatus.id)) &&
        (this.name == null ? launchStatus.name == null : this.name.equals(launchStatus.name));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaunchStatus {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
