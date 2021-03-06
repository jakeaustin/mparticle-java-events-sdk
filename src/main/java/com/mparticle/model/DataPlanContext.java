package com.mparticle.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * DataPlanContext
 */

public class DataPlanContext {
  public static final String SERIALIZED_NAME_PLAN_ID = "plan_id";
  @SerializedName(SERIALIZED_NAME_PLAN_ID)
  private String planId;

  public static final String SERIALIZED_NAME_PLAN_VERSION = "plan_version";
  @SerializedName(SERIALIZED_NAME_PLAN_VERSION)
  private Integer planVersion;


  public DataPlanContext planId(String planId) {
    
    this.planId = planId;
    return this;
  }

   /**
   * Get planId
   * @return planId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getPlanId() {
    return planId;
  }


  public void setPlanId(String planId) {
    this.planId = planId;
  }


  public DataPlanContext planVersion(Integer planVersion) {
    
    this.planVersion = planVersion;
    return this;
  }

   /**
   * Get planVersion
   * @return planVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPlanVersion() {
    return planVersion;
  }


  public void setPlanVersion(Integer planVersion) {
    this.planVersion = planVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataPlanContext dataPlanContext = (DataPlanContext) o;
    return Objects.equals(this.planId, dataPlanContext.planId) &&
        Objects.equals(this.planVersion, dataPlanContext.planVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planId, planVersion);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataPlanContext {\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    planVersion: ").append(toIndentedString(planVersion)).append("\n");
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

