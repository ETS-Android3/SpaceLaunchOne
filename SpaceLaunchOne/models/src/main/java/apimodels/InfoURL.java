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

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel()
public class InfoURL {
  
  @SerializedName("priority")
  private Integer priority = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("feature_image")
  private String featureImage = null;
  @SerializedName("url")
  private String url = null;

  /**
   * minimum: -2147483648
   * maximum: 2147483647
   **/
  @ApiModelProperty()
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  /**
   **/
  @ApiModelProperty()
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   **/
  @ApiModelProperty()
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty()
  public String getFeatureImage() {
    return featureImage;
  }
  public void setFeatureImage(String featureImage) {
    this.featureImage = featureImage;
  }

  /**
   **/
  @ApiModelProperty(required = true)
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoURL infoURL = (InfoURL) o;
    return (Objects.equals(this.priority, infoURL.priority)) &&
        (Objects.equals(this.title, infoURL.title)) &&
        (Objects.equals(this.description, infoURL.description)) &&
        (Objects.equals(this.featureImage, infoURL.featureImage)) &&
        (Objects.equals(this.url, infoURL.url));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.priority == null ? 0: this.priority.hashCode());
    result = 31 * result + (this.title == null ? 0: this.title.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.featureImage == null ? 0: this.featureImage.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    return result;
  }

  @Override
  public String toString()  {

      String sb = "class InfoURL {\n" +
              "  priority: " + priority + "\n" +
              "  title: " + title + "\n" +
              "  description: " + description + "\n" +
              "  featureImage: " + featureImage + "\n" +
              "  url: " + url + "\n" +
              "}\n";
      return sb;
  }
}
