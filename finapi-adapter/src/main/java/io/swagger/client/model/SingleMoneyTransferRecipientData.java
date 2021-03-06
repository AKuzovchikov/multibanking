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
import java.math.BigDecimal;

/**
 * Recipient data for a single money transfer order
 */
@ApiModel(description = "Recipient data for a single money transfer order")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-05T12:19:21.458Z")
public class SingleMoneyTransferRecipientData {
  @SerializedName("recipientName")
  private String recipientName = null;

  @SerializedName("recipientIban")
  private String recipientIban = null;

  @SerializedName("recipientBic")
  private String recipientBic = null;

  @SerializedName("clearingAccountId")
  private String clearingAccountId = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("sepaPurposeCode")
  private String sepaPurposeCode = null;

  public SingleMoneyTransferRecipientData recipientName(String recipientName) {
    this.recipientName = recipientName;
    return this;
  }

   /**
   * Name of the recipient. Note: Neither finAPI nor the involved bank servers are guaranteed to validate the recipient name. Even if the recipient name does not depict the actual registered account holder of the specified recipient account, the money transfer request might still be successful. This field is optional only when you pass a clearing account as the recipient. Otherwise, this field is required.
   * @return recipientName
  **/
  @ApiModelProperty(example = "Max Mustermann", value = "Name of the recipient. Note: Neither finAPI nor the involved bank servers are guaranteed to validate the recipient name. Even if the recipient name does not depict the actual registered account holder of the specified recipient account, the money transfer request might still be successful. This field is optional only when you pass a clearing account as the recipient. Otherwise, this field is required.")
  public String getRecipientName() {
    return recipientName;
  }

  public void setRecipientName(String recipientName) {
    this.recipientName = recipientName;
  }

  public SingleMoneyTransferRecipientData recipientIban(String recipientIban) {
    this.recipientIban = recipientIban;
    return this;
  }

   /**
   * IBAN of the recipient&#39;s account. This field is optional only when you pass a clearing account as the recipient. Otherwise, this field is required.
   * @return recipientIban
  **/
  @ApiModelProperty(example = "DE13700800000061110500", value = "IBAN of the recipient's account. This field is optional only when you pass a clearing account as the recipient. Otherwise, this field is required.")
  public String getRecipientIban() {
    return recipientIban;
  }

  public void setRecipientIban(String recipientIban) {
    this.recipientIban = recipientIban;
  }

  public SingleMoneyTransferRecipientData recipientBic(String recipientBic) {
    this.recipientBic = recipientBic;
    return this;
  }

   /**
   * BIC of the recipient&#39;s account. Note: This field is optional when you pass a clearing account as the recipient or if the bank connection of the account that you want to transfer money from supports the IBAN-Only money transfer. You can find this out via GET /bankConnections/&lt;id&gt;. Also note that when a BIC is given, then this BIC will be used for the money transfer request independent of whether it is required or not (unless you pass a clearing account, in which case this field will always be ignored).
   * @return recipientBic
  **/
  @ApiModelProperty(example = "DRESDEFF700", value = "BIC of the recipient's account. Note: This field is optional when you pass a clearing account as the recipient or if the bank connection of the account that you want to transfer money from supports the IBAN-Only money transfer. You can find this out via GET /bankConnections/<id>. Also note that when a BIC is given, then this BIC will be used for the money transfer request independent of whether it is required or not (unless you pass a clearing account, in which case this field will always be ignored).")
  public String getRecipientBic() {
    return recipientBic;
  }

  public void setRecipientBic(String recipientBic) {
    this.recipientBic = recipientBic;
  }

  public SingleMoneyTransferRecipientData clearingAccountId(String clearingAccountId) {
    this.clearingAccountId = clearingAccountId;
    return this;
  }

   /**
   * Identifier of a clearing account. If this field is set, then the fields &#39;recipientName&#39;, &#39;recipientIban&#39; and &#39;recipientBic&#39; will be ignored and the recipient account will be the specified clearing account.
   * @return clearingAccountId
  **/
  @ApiModelProperty(example = "BA-TUYEF7D24CGK6", value = "Identifier of a clearing account. If this field is set, then the fields 'recipientName', 'recipientIban' and 'recipientBic' will be ignored and the recipient account will be the specified clearing account.")
  public String getClearingAccountId() {
    return clearingAccountId;
  }

  public void setClearingAccountId(String clearingAccountId) {
    this.clearingAccountId = clearingAccountId;
  }

  public SingleMoneyTransferRecipientData amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The amount to transfer. Must be a positive decimal number with at most two decimal places (e.g. 99.99)
   * @return amount
  **/
  @ApiModelProperty(example = "99.99", required = true, value = "The amount to transfer. Must be a positive decimal number with at most two decimal places (e.g. 99.99)")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public SingleMoneyTransferRecipientData purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The purpose of the transfer transaction
   * @return purpose
  **/
  @ApiModelProperty(example = "Test Payment", value = "The purpose of the transfer transaction")
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public SingleMoneyTransferRecipientData sepaPurposeCode(String sepaPurposeCode) {
    this.sepaPurposeCode = sepaPurposeCode;
    return this;
  }

   /**
   * SEPA purpose code, according to ISO 20022, external codes set.
   * @return sepaPurposeCode
  **/
  @ApiModelProperty(example = "OTHR", value = "SEPA purpose code, according to ISO 20022, external codes set.")
  public String getSepaPurposeCode() {
    return sepaPurposeCode;
  }

  public void setSepaPurposeCode(String sepaPurposeCode) {
    this.sepaPurposeCode = sepaPurposeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleMoneyTransferRecipientData singleMoneyTransferRecipientData = (SingleMoneyTransferRecipientData) o;
    return Objects.equals(this.recipientName, singleMoneyTransferRecipientData.recipientName) &&
        Objects.equals(this.recipientIban, singleMoneyTransferRecipientData.recipientIban) &&
        Objects.equals(this.recipientBic, singleMoneyTransferRecipientData.recipientBic) &&
        Objects.equals(this.clearingAccountId, singleMoneyTransferRecipientData.clearingAccountId) &&
        Objects.equals(this.amount, singleMoneyTransferRecipientData.amount) &&
        Objects.equals(this.purpose, singleMoneyTransferRecipientData.purpose) &&
        Objects.equals(this.sepaPurposeCode, singleMoneyTransferRecipientData.sepaPurposeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientName, recipientIban, recipientBic, clearingAccountId, amount, purpose, sepaPurposeCode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleMoneyTransferRecipientData {\n");
    
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    recipientIban: ").append(toIndentedString(recipientIban)).append("\n");
    sb.append("    recipientBic: ").append(toIndentedString(recipientBic)).append("\n");
    sb.append("    clearingAccountId: ").append(toIndentedString(clearingAccountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    sepaPurposeCode: ").append(toIndentedString(sepaPurposeCode)).append("\n");
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

