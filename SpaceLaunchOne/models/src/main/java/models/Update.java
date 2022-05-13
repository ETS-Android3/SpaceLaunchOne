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

import org.threeten.bp.OffsetDateTime;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * Update
 */

public class Update {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("profile_image")
  private String profileImage = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("info_url")
  private String infoUrl = null;

  @SerializedName("created_by")
  private String createdBy = null;

  @SerializedName("created_on")
  private OffsetDateTime createdOn = null;

  public Update id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
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
   * Get profileImage
   * @return profileImage
  **/
  @ApiModelProperty(value = "")
  public String getProfileImage() {
    return profileImage;
  }

  public Update comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Get comment
   * @return comment
  **/
  @ApiModelProperty(value = "")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Update infoUrl(String infoUrl) {
    this.infoUrl = infoUrl;
    return this;
  }

   /**
   * Get infoUrl
   * @return infoUrl
  **/
  @ApiModelProperty(value = "")
  public String getInfoUrl() {
    return infoUrl;
  }

  public void setInfoUrl(String infoUrl) {
    this.infoUrl = infoUrl;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

   /**
   * Get createdOn
   * @return createdOn
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Update update = (Update) o;
    return Objects.equals(this.id, update.id) &&
        Objects.equals(this.profileImage, update.profileImage) &&
        Objects.equals(this.comment, update.comment) &&
        Objects.equals(this.infoUrl, update.infoUrl) &&
        Objects.equals(this.createdBy, update.createdBy) &&
        Objects.equals(this.createdOn, update.createdOn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, profileImage, comment, infoUrl, createdBy, createdOn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Update {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    profileImage: ").append(toIndentedString(profileImage)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    infoUrl: ").append(toIndentedString(infoUrl)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdOn: ").append(toIndentedString(createdOn)).append("\n");
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

