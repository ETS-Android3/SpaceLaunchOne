/*
 * Launch Library
 * The Launch Library API is a product by The Space Devs with an up-to-date database of Spaceflight events.   While this API is free to use it is subject to rate limiting for non-authenticated requests.  Please use https://lldev.thespacedevs.com for development testing - this endpoint has stale data but is not subject to any rate limits.  If you are interested in a higher rate limit please consider supporting the project on Patreon for access to an API Key.
 *
 * OpenAPI spec version: 2.2.0
 * Contact: support@thespacedevs.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package models;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * LaunchStatus
 */

public class LaunchStatus {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("abbrev")
  private String abbrev = null;

  @SerializedName("description")
  private String description = null;

  public LaunchStatus id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * minimum: -2147483648
   * maximum: 2147483647
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public LaunchStatus abbrev(String abbrev) {
    this.abbrev = abbrev;
    return this;
  }

   /**
   * Get abbrev
   * @return abbrev
  **/
  @ApiModelProperty(value = "")
  public String getAbbrev() {
    return abbrev;
  }

  public void setAbbrev(String abbrev) {
    this.abbrev = abbrev;
  }

  public LaunchStatus description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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
    return Objects.equals(this.id, launchStatus.id) &&
        Objects.equals(this.name, launchStatus.name) &&
        Objects.equals(this.abbrev, launchStatus.abbrev) &&
        Objects.equals(this.description, launchStatus.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, abbrev, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LaunchStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    abbrev: ").append(toIndentedString(abbrev)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

