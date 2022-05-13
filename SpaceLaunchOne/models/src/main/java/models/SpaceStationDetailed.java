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

import org.threeten.bp.LocalDate;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * SpaceStationDetailed
 */

public class SpaceStationDetailed {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("status")
  private SpaceStationStatus status = null;

  @SerializedName("type")
  private SpaceStationType type = null;

  @SerializedName("founded")
  private LocalDate founded = null;

  @SerializedName("deorbited")
  private LocalDate deorbited = null;

  @SerializedName("height")
  private BigDecimal height = null;

  @SerializedName("width")
  private BigDecimal width = null;

  @SerializedName("mass")
  private BigDecimal mass = null;

  @SerializedName("volume")
  private Integer volume = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("orbit")
  private String orbit = null;

  @SerializedName("onboard_crew")
  private String onboardCrew = null;

  @SerializedName("owners")
  private List<Agency> owners = null;

  @SerializedName("active_expeditions")
  private List<ExpeditionDetailedSerializerForSpacestation> activeExpeditions = null;

  @SerializedName("docking_location")
  private List<DockingLocationSerializerForSpacestation> dockingLocation = null;

  @SerializedName("image_url")
  private String imageUrl = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }

  public SpaceStationDetailed name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SpaceStationDetailed status(SpaceStationStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public SpaceStationStatus getStatus() {
    return status;
  }

  public void setStatus(SpaceStationStatus status) {
    this.status = status;
  }

  public SpaceStationDetailed type(SpaceStationType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public SpaceStationType getType() {
    return type;
  }

  public void setType(SpaceStationType type) {
    this.type = type;
  }

  public SpaceStationDetailed founded(LocalDate founded) {
    this.founded = founded;
    return this;
  }

   /**
   * Get founded
   * @return founded
  **/
  @ApiModelProperty(required = true, value = "")
  public LocalDate getFounded() {
    return founded;
  }

  public void setFounded(LocalDate founded) {
    this.founded = founded;
  }

  public SpaceStationDetailed deorbited(LocalDate deorbited) {
    this.deorbited = deorbited;
    return this;
  }

   /**
   * Get deorbited
   * @return deorbited
  **/
  @ApiModelProperty(value = "")
  public LocalDate getDeorbited() {
    return deorbited;
  }

  public void setDeorbited(LocalDate deorbited) {
    this.deorbited = deorbited;
  }

  public SpaceStationDetailed height(BigDecimal height) {
    this.height = height;
    return this;
  }

   /**
   * Get height
   * @return height
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getHeight() {
    return height;
  }

  public void setHeight(BigDecimal height) {
    this.height = height;
  }

  public SpaceStationDetailed width(BigDecimal width) {
    this.width = width;
    return this;
  }

   /**
   * Get width
   * @return width
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public SpaceStationDetailed mass(BigDecimal mass) {
    this.mass = mass;
    return this;
  }

   /**
   * Get mass
   * @return mass
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getMass() {
    return mass;
  }

  public void setMass(BigDecimal mass) {
    this.mass = mass;
  }

  public SpaceStationDetailed volume(Integer volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Get volume
   * minimum: -2147483648
   * maximum: 2147483647
   * @return volume
  **/
  @ApiModelProperty(value = "")
  public Integer getVolume() {
    return volume;
  }

  public void setVolume(Integer volume) {
    this.volume = volume;
  }

  public SpaceStationDetailed description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * Get orbit
   * @return orbit
  **/
  @ApiModelProperty(value = "")
  public String getOrbit() {
    return orbit;
  }

   /**
   * Get onboardCrew
   * @return onboardCrew
  **/
  @ApiModelProperty(value = "")
  public String getOnboardCrew() {
    return onboardCrew;
  }

   /**
   * Get owners
   * @return owners
  **/
  @ApiModelProperty(value = "")
  public List<Agency> getOwners() {
    return owners;
  }

   /**
   * Get activeExpeditions
   * @return activeExpeditions
  **/
  @ApiModelProperty(value = "")
  public List<ExpeditionDetailedSerializerForSpacestation> getActiveExpeditions() {
    return activeExpeditions;
  }

   /**
   * Get dockingLocation
   * @return dockingLocation
  **/
  @ApiModelProperty(value = "")
  public List<DockingLocationSerializerForSpacestation> getDockingLocation() {
    return dockingLocation;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @ApiModelProperty(value = "")
  public String getImageUrl() {
    return imageUrl;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpaceStationDetailed spaceStationDetailed = (SpaceStationDetailed) o;
    return Objects.equals(this.id, spaceStationDetailed.id) &&
        Objects.equals(this.url, spaceStationDetailed.url) &&
        Objects.equals(this.name, spaceStationDetailed.name) &&
        Objects.equals(this.status, spaceStationDetailed.status) &&
        Objects.equals(this.type, spaceStationDetailed.type) &&
        Objects.equals(this.founded, spaceStationDetailed.founded) &&
        Objects.equals(this.deorbited, spaceStationDetailed.deorbited) &&
        Objects.equals(this.height, spaceStationDetailed.height) &&
        Objects.equals(this.width, spaceStationDetailed.width) &&
        Objects.equals(this.mass, spaceStationDetailed.mass) &&
        Objects.equals(this.volume, spaceStationDetailed.volume) &&
        Objects.equals(this.description, spaceStationDetailed.description) &&
        Objects.equals(this.orbit, spaceStationDetailed.orbit) &&
        Objects.equals(this.onboardCrew, spaceStationDetailed.onboardCrew) &&
        Objects.equals(this.owners, spaceStationDetailed.owners) &&
        Objects.equals(this.activeExpeditions, spaceStationDetailed.activeExpeditions) &&
        Objects.equals(this.dockingLocation, spaceStationDetailed.dockingLocation) &&
        Objects.equals(this.imageUrl, spaceStationDetailed.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, name, status, type, founded, deorbited, height, width, mass, volume, description, orbit, onboardCrew, owners, activeExpeditions, dockingLocation, imageUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpaceStationDetailed {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    founded: ").append(toIndentedString(founded)).append("\n");
    sb.append("    deorbited: ").append(toIndentedString(deorbited)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    mass: ").append(toIndentedString(mass)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    orbit: ").append(toIndentedString(orbit)).append("\n");
    sb.append("    onboardCrew: ").append(toIndentedString(onboardCrew)).append("\n");
    sb.append("    owners: ").append(toIndentedString(owners)).append("\n");
    sb.append("    activeExpeditions: ").append(toIndentedString(activeExpeditions)).append("\n");
    sb.append("    dockingLocation: ").append(toIndentedString(dockingLocation)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

