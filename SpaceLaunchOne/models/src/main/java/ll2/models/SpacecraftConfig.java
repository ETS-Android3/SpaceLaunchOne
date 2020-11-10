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
public class SpacecraftConfig {
  
  @SerializedName("id")
  private Integer id = null;
  @SerializedName("url")
  private String url = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("type")
  private SpacecraftConfigType type = null;
  @SerializedName("agency")
  private AgencySerializerMini agency = null;
  @SerializedName("in_use")
  private Boolean inUse = null;
  @SerializedName("image_url")
  private String imageUrl = null;

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
  @ApiModelProperty(value = "")
  public SpacecraftConfigType getType() {
    return type;
  }
  public void setType(SpacecraftConfigType type) {
    this.type = type;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public AgencySerializerMini getAgency() {
    return agency;
  }
  public void setAgency(AgencySerializerMini agency) {
    this.agency = agency;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Boolean getInUse() {
    return inUse;
  }
  public void setInUse(Boolean inUse) {
    this.inUse = inUse;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpacecraftConfig spacecraftConfig = (SpacecraftConfig) o;
    return (this.id == null ? spacecraftConfig.id == null : this.id.equals(spacecraftConfig.id)) &&
        (this.url == null ? spacecraftConfig.url == null : this.url.equals(spacecraftConfig.url)) &&
        (this.name == null ? spacecraftConfig.name == null : this.name.equals(spacecraftConfig.name)) &&
        (this.type == null ? spacecraftConfig.type == null : this.type.equals(spacecraftConfig.type)) &&
        (this.agency == null ? spacecraftConfig.agency == null : this.agency.equals(spacecraftConfig.agency)) &&
        (this.inUse == null ? spacecraftConfig.inUse == null : this.inUse.equals(spacecraftConfig.inUse)) &&
        (this.imageUrl == null ? spacecraftConfig.imageUrl == null : this.imageUrl.equals(spacecraftConfig.imageUrl));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.type == null ? 0: this.type.hashCode());
    result = 31 * result + (this.agency == null ? 0: this.agency.hashCode());
    result = 31 * result + (this.inUse == null ? 0: this.inUse.hashCode());
    result = 31 * result + (this.imageUrl == null ? 0: this.imageUrl.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpacecraftConfig {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  agency: ").append(agency).append("\n");
    sb.append("  inUse: ").append(inUse).append("\n");
    sb.append("  imageUrl: ").append(imageUrl).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
