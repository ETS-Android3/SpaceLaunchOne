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
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * SpacecraftConfigurationDetail
 */

public class SpacecraftConfigurationDetail {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private SpacecraftConfigType type = null;

  @SerializedName("agency")
  private Agency agency = null;

  @SerializedName("in_use")
  private Boolean inUse = null;

  @SerializedName("capability")
  private String capability = null;

  @SerializedName("history")
  private String history = null;

  @SerializedName("details")
  private String details = null;

  @SerializedName("maiden_flight")
  private LocalDate maidenFlight = null;

  @SerializedName("height")
  private BigDecimal height = null;

  @SerializedName("diameter")
  private BigDecimal diameter = null;

  @SerializedName("human_rated")
  private Boolean humanRated = null;

  @SerializedName("crew_capacity")
  private Integer crewCapacity = null;

  @SerializedName("payload_capacity")
  private Integer payloadCapacity = null;

  @SerializedName("flight_life")
  private String flightLife = null;

  @SerializedName("image_url")
  private String imageUrl = null;

  @SerializedName("nation_url")
  private String nationUrl = null;

  @SerializedName("wiki_link")
  private String wikiLink = null;

  @SerializedName("info_link")
  private String infoLink = null;

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

  public SpacecraftConfigurationDetail name(String name) {
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

  public SpacecraftConfigurationDetail type(SpacecraftConfigType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public SpacecraftConfigType getType() {
    return type;
  }

  public void setType(SpacecraftConfigType type) {
    this.type = type;
  }

  public SpacecraftConfigurationDetail agency(Agency agency) {
    this.agency = agency;
    return this;
  }

   /**
   * Get agency
   * @return agency
  **/
  @ApiModelProperty(value = "")
  public Agency getAgency() {
    return agency;
  }

  public void setAgency(Agency agency) {
    this.agency = agency;
  }

  public SpacecraftConfigurationDetail inUse(Boolean inUse) {
    this.inUse = inUse;
    return this;
  }

   /**
   * Get inUse
   * @return inUse
  **/
  @ApiModelProperty(value = "")
  public Boolean isInUse() {
    return inUse;
  }

  public void setInUse(Boolean inUse) {
    this.inUse = inUse;
  }

  public SpacecraftConfigurationDetail capability(String capability) {
    this.capability = capability;
    return this;
  }

   /**
   * Get capability
   * @return capability
  **/
  @ApiModelProperty(value = "")
  public String getCapability() {
    return capability;
  }

  public void setCapability(String capability) {
    this.capability = capability;
  }

  public SpacecraftConfigurationDetail history(String history) {
    this.history = history;
    return this;
  }

   /**
   * Get history
   * @return history
  **/
  @ApiModelProperty(value = "")
  public String getHistory() {
    return history;
  }

  public void setHistory(String history) {
    this.history = history;
  }

  public SpacecraftConfigurationDetail details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(value = "")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public SpacecraftConfigurationDetail maidenFlight(LocalDate maidenFlight) {
    this.maidenFlight = maidenFlight;
    return this;
  }

   /**
   * Get maidenFlight
   * @return maidenFlight
  **/
  @ApiModelProperty(value = "")
  public LocalDate getMaidenFlight() {
    return maidenFlight;
  }

  public void setMaidenFlight(LocalDate maidenFlight) {
    this.maidenFlight = maidenFlight;
  }

  public SpacecraftConfigurationDetail height(BigDecimal height) {
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

  public SpacecraftConfigurationDetail diameter(BigDecimal diameter) {
    this.diameter = diameter;
    return this;
  }

   /**
   * Get diameter
   * @return diameter
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDiameter() {
    return diameter;
  }

  public void setDiameter(BigDecimal diameter) {
    this.diameter = diameter;
  }

  public SpacecraftConfigurationDetail humanRated(Boolean humanRated) {
    this.humanRated = humanRated;
    return this;
  }

   /**
   * Get humanRated
   * @return humanRated
  **/
  @ApiModelProperty(value = "")
  public Boolean isHumanRated() {
    return humanRated;
  }

  public void setHumanRated(Boolean humanRated) {
    this.humanRated = humanRated;
  }

  public SpacecraftConfigurationDetail crewCapacity(Integer crewCapacity) {
    this.crewCapacity = crewCapacity;
    return this;
  }

   /**
   * Get crewCapacity
   * minimum: -2147483648
   * maximum: 2147483647
   * @return crewCapacity
  **/
  @ApiModelProperty(value = "")
  public Integer getCrewCapacity() {
    return crewCapacity;
  }

  public void setCrewCapacity(Integer crewCapacity) {
    this.crewCapacity = crewCapacity;
  }

  public SpacecraftConfigurationDetail payloadCapacity(Integer payloadCapacity) {
    this.payloadCapacity = payloadCapacity;
    return this;
  }

   /**
   * Get payloadCapacity
   * minimum: -2147483648
   * maximum: 2147483647
   * @return payloadCapacity
  **/
  @ApiModelProperty(value = "")
  public Integer getPayloadCapacity() {
    return payloadCapacity;
  }

  public void setPayloadCapacity(Integer payloadCapacity) {
    this.payloadCapacity = payloadCapacity;
  }

  public SpacecraftConfigurationDetail flightLife(String flightLife) {
    this.flightLife = flightLife;
    return this;
  }

   /**
   * Get flightLife
   * @return flightLife
  **/
  @ApiModelProperty(value = "")
  public String getFlightLife() {
    return flightLife;
  }

  public void setFlightLife(String flightLife) {
    this.flightLife = flightLife;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @ApiModelProperty(value = "")
  public String getImageUrl() {
    return imageUrl;
  }

   /**
   * Get nationUrl
   * @return nationUrl
  **/
  @ApiModelProperty(value = "")
  public String getNationUrl() {
    return nationUrl;
  }

  public SpacecraftConfigurationDetail wikiLink(String wikiLink) {
    this.wikiLink = wikiLink;
    return this;
  }

   /**
   * Get wikiLink
   * @return wikiLink
  **/
  @ApiModelProperty(value = "")
  public String getWikiLink() {
    return wikiLink;
  }

  public void setWikiLink(String wikiLink) {
    this.wikiLink = wikiLink;
  }

  public SpacecraftConfigurationDetail infoLink(String infoLink) {
    this.infoLink = infoLink;
    return this;
  }

   /**
   * Get infoLink
   * @return infoLink
  **/
  @ApiModelProperty(value = "")
  public String getInfoLink() {
    return infoLink;
  }

  public void setInfoLink(String infoLink) {
    this.infoLink = infoLink;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpacecraftConfigurationDetail spacecraftConfigurationDetail = (SpacecraftConfigurationDetail) o;
    return Objects.equals(this.id, spacecraftConfigurationDetail.id) &&
        Objects.equals(this.url, spacecraftConfigurationDetail.url) &&
        Objects.equals(this.name, spacecraftConfigurationDetail.name) &&
        Objects.equals(this.type, spacecraftConfigurationDetail.type) &&
        Objects.equals(this.agency, spacecraftConfigurationDetail.agency) &&
        Objects.equals(this.inUse, spacecraftConfigurationDetail.inUse) &&
        Objects.equals(this.capability, spacecraftConfigurationDetail.capability) &&
        Objects.equals(this.history, spacecraftConfigurationDetail.history) &&
        Objects.equals(this.details, spacecraftConfigurationDetail.details) &&
        Objects.equals(this.maidenFlight, spacecraftConfigurationDetail.maidenFlight) &&
        Objects.equals(this.height, spacecraftConfigurationDetail.height) &&
        Objects.equals(this.diameter, spacecraftConfigurationDetail.diameter) &&
        Objects.equals(this.humanRated, spacecraftConfigurationDetail.humanRated) &&
        Objects.equals(this.crewCapacity, spacecraftConfigurationDetail.crewCapacity) &&
        Objects.equals(this.payloadCapacity, spacecraftConfigurationDetail.payloadCapacity) &&
        Objects.equals(this.flightLife, spacecraftConfigurationDetail.flightLife) &&
        Objects.equals(this.imageUrl, spacecraftConfigurationDetail.imageUrl) &&
        Objects.equals(this.nationUrl, spacecraftConfigurationDetail.nationUrl) &&
        Objects.equals(this.wikiLink, spacecraftConfigurationDetail.wikiLink) &&
        Objects.equals(this.infoLink, spacecraftConfigurationDetail.infoLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, name, type, agency, inUse, capability, history, details, maidenFlight, height, diameter, humanRated, crewCapacity, payloadCapacity, flightLife, imageUrl, nationUrl, wikiLink, infoLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpacecraftConfigurationDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
    sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
    sb.append("    capability: ").append(toIndentedString(capability)).append("\n");
    sb.append("    history: ").append(toIndentedString(history)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    maidenFlight: ").append(toIndentedString(maidenFlight)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    diameter: ").append(toIndentedString(diameter)).append("\n");
    sb.append("    humanRated: ").append(toIndentedString(humanRated)).append("\n");
    sb.append("    crewCapacity: ").append(toIndentedString(crewCapacity)).append("\n");
    sb.append("    payloadCapacity: ").append(toIndentedString(payloadCapacity)).append("\n");
    sb.append("    flightLife: ").append(toIndentedString(flightLife)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    nationUrl: ").append(toIndentedString(nationUrl)).append("\n");
    sb.append("    wikiLink: ").append(toIndentedString(wikiLink)).append("\n");
    sb.append("    infoLink: ").append(toIndentedString(infoLink)).append("\n");
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

