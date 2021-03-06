/*
 * finAPI RESTful Services
 * finAPI RESTful Services
 *
 * OpenAPI spec version: v1.64.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Container for bank connection edit params
 */
@ApiModel(description = "Container for bank connection edit params")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-05T12:19:21.458Z")
public class EditBankConnectionParams {
  @SerializedName("bankingUserId")
  private String bankingUserId = null;

  @SerializedName("bankingCustomerId")
  private String bankingCustomerId = null;

  @SerializedName("bankingPin")
  private String bankingPin = null;

  @SerializedName("defaultTwoStepProcedureId")
  private String defaultTwoStepProcedureId = null;

  @SerializedName("name")
  private String name = null;

  public EditBankConnectionParams bankingUserId(String bankingUserId) {
    this.bankingUserId = bankingUserId;
    return this;
  }

   /**
   * New online banking user ID. If you do not want to change the current user ID let this field remain unset. In case you need to use finAPI&#39;s web form to let the user update the field, just set the field to any value, so that the service recognizes that you wish to use the web form flow. Note that you cannot clear the current user ID, i.e. a bank connection must always have a user ID (except for when it is a &#39;demo connection&#39;). Max length: 64.
   * @return bankingUserId
  **/
  @ApiModelProperty(example = "123456", value = "New online banking user ID. If you do not want to change the current user ID let this field remain unset. In case you need to use finAPI's web form to let the user update the field, just set the field to any value, so that the service recognizes that you wish to use the web form flow. Note that you cannot clear the current user ID, i.e. a bank connection must always have a user ID (except for when it is a 'demo connection'). Max length: 64.")
  public String getBankingUserId() {
    return bankingUserId;
  }

  public void setBankingUserId(String bankingUserId) {
    this.bankingUserId = bankingUserId;
  }

  public EditBankConnectionParams bankingCustomerId(String bankingCustomerId) {
    this.bankingCustomerId = bankingCustomerId;
    return this;
  }

   /**
   * New online banking customer ID. If you do not want to change the current customer ID let this field remain unset. In case you need to use finAPI&#39;s web form to let the user update the field, just set the field to non-empty value, so that the service recognizes that you wish to use the web form flow. If you want to clear the current customer ID, set the field&#39;s value to an empty string (\&quot;\&quot;). Max length: 64.
   * @return bankingCustomerId
  **/
  @ApiModelProperty(example = "123456", value = "New online banking customer ID. If you do not want to change the current customer ID let this field remain unset. In case you need to use finAPI's web form to let the user update the field, just set the field to non-empty value, so that the service recognizes that you wish to use the web form flow. If you want to clear the current customer ID, set the field's value to an empty string (\"\"). Max length: 64.")
  public String getBankingCustomerId() {
    return bankingCustomerId;
  }

  public void setBankingCustomerId(String bankingCustomerId) {
    this.bankingCustomerId = bankingCustomerId;
  }

  public EditBankConnectionParams bankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
    return this;
  }

   /**
   * New online banking PIN. If you do not want to change the current PIN let this field remain unset. In case you need to use finAPI&#39;s web form to let the user update the field, just set the field to non-empty value, so that the service recognizes that you wish to use the web form flow. If you want to clear the current PIN, set the field&#39;s value to an empty string (\&quot;\&quot;).&lt;br/&gt;&lt;br/&gt;NOTE: Before you set this field, please regard the &#39;pinsAreVolatile&#39; flag of this connection&#39;s bank.&lt;br/&gt;Any symbols are allowed. Max length: 170.
   * @return bankingPin
  **/
  @ApiModelProperty(example = "123456", value = "New online banking PIN. If you do not want to change the current PIN let this field remain unset. In case you need to use finAPI's web form to let the user update the field, just set the field to non-empty value, so that the service recognizes that you wish to use the web form flow. If you want to clear the current PIN, set the field's value to an empty string (\"\").<br/><br/>NOTE: Before you set this field, please regard the 'pinsAreVolatile' flag of this connection's bank.<br/>Any symbols are allowed. Max length: 170.")
  public String getBankingPin() {
    return bankingPin;
  }

  public void setBankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
  }

  public EditBankConnectionParams defaultTwoStepProcedureId(String defaultTwoStepProcedureId) {
    this.defaultTwoStepProcedureId = defaultTwoStepProcedureId;
    return this;
  }

   /**
   * New default two-step-procedure. Must match the &#39;procedureId&#39; of one of the procedures that are listed in the bank connection. If you do not want to change this field let it remain unset. If you want to clear the current default two-step-procedure, set the field&#39;s value to an empty string (\&quot;\&quot;).
   * @return defaultTwoStepProcedureId
  **/
  @ApiModelProperty(example = "955", value = "New default two-step-procedure. Must match the 'procedureId' of one of the procedures that are listed in the bank connection. If you do not want to change this field let it remain unset. If you want to clear the current default two-step-procedure, set the field's value to an empty string (\"\").")
  public String getDefaultTwoStepProcedureId() {
    return defaultTwoStepProcedureId;
  }

  public void setDefaultTwoStepProcedureId(String defaultTwoStepProcedureId) {
    this.defaultTwoStepProcedureId = defaultTwoStepProcedureId;
  }

  public EditBankConnectionParams name(String name) {
    this.name = name;
    return this;
  }

   /**
   * New name for the bank connection. Maximum length is 64. If you do not want to change the current name let this field remain unset. If you want to clear the current name, set the field&#39;s value to an empty string (\&quot;\&quot;).
   * @return name
  **/
  @ApiModelProperty(example = "Bank Connection", value = "New name for the bank connection. Maximum length is 64. If you do not want to change the current name let this field remain unset. If you want to clear the current name, set the field's value to an empty string (\"\").")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EditBankConnectionParams editBankConnectionParams = (EditBankConnectionParams) o;
    return Objects.equals(this.bankingUserId, editBankConnectionParams.bankingUserId) &&
        Objects.equals(this.bankingCustomerId, editBankConnectionParams.bankingCustomerId) &&
        Objects.equals(this.bankingPin, editBankConnectionParams.bankingPin) &&
        Objects.equals(this.defaultTwoStepProcedureId, editBankConnectionParams.defaultTwoStepProcedureId) &&
        Objects.equals(this.name, editBankConnectionParams.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankingUserId, bankingCustomerId, bankingPin, defaultTwoStepProcedureId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EditBankConnectionParams {\n");
    
    sb.append("    bankingUserId: ").append(toIndentedString(bankingUserId)).append("\n");
    sb.append("    bankingCustomerId: ").append(toIndentedString(bankingCustomerId)).append("\n");
    sb.append("    bankingPin: ").append(toIndentedString(bankingPin)).append("\n");
    sb.append("    defaultTwoStepProcedureId: ").append(toIndentedString(defaultTwoStepProcedureId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

