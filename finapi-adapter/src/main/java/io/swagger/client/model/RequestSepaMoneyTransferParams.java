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
import io.swagger.client.model.SingleMoneyTransferRecipientData;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Parameters for a single or collective SEPA money transfer order request
 */
@ApiModel(description = "Parameters for a single or collective SEPA money transfer order request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-05T12:19:21.458Z")
public class RequestSepaMoneyTransferParams {
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

  @SerializedName("accountId")
  private Long accountId = null;

  @SerializedName("bankingPin")
  private String bankingPin = null;

  @SerializedName("storePin")
  private Boolean storePin = false;

  @SerializedName("twoStepProcedureId")
  private String twoStepProcedureId = null;

  @SerializedName("challengeResponse")
  private String challengeResponse = null;

  @SerializedName("executionDate")
  private String executionDate = null;

  @SerializedName("singleBooking")
  private Boolean singleBooking = false;

  @SerializedName("additionalMoneyTransfers")
  private List<SingleMoneyTransferRecipientData> additionalMoneyTransfers = null;

  public RequestSepaMoneyTransferParams recipientName(String recipientName) {
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

  public RequestSepaMoneyTransferParams recipientIban(String recipientIban) {
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

  public RequestSepaMoneyTransferParams recipientBic(String recipientBic) {
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

  public RequestSepaMoneyTransferParams clearingAccountId(String clearingAccountId) {
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

  public RequestSepaMoneyTransferParams amount(BigDecimal amount) {
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

  public RequestSepaMoneyTransferParams purpose(String purpose) {
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

  public RequestSepaMoneyTransferParams sepaPurposeCode(String sepaPurposeCode) {
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

  public RequestSepaMoneyTransferParams accountId(Long accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Identifier of the bank account that you want to transfer money from
   * @return accountId
  **/
  @ApiModelProperty(example = "1", required = true, value = "Identifier of the bank account that you want to transfer money from")
  public Long getAccountId() {
    return accountId;
  }

  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }

  public RequestSepaMoneyTransferParams bankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
    return this;
  }

   /**
   * Online banking PIN. Any symbols are allowed. Max length: 170. If a PIN is stored in the bank connection, then this field may remain unset. If finAPI&#39;s web form is not required and the field is set though then it will always be used (even if there is some other PIN stored in the bank connection). If you want the user to enter a PIN in finAPI&#39;s web form even when a PIN is stored, then just set the field to any value, so that the service recognizes that you wish to use the web form flow.
   * @return bankingPin
  **/
  @ApiModelProperty(example = "123456", value = "Online banking PIN. Any symbols are allowed. Max length: 170. If a PIN is stored in the bank connection, then this field may remain unset. If finAPI's web form is not required and the field is set though then it will always be used (even if there is some other PIN stored in the bank connection). If you want the user to enter a PIN in finAPI's web form even when a PIN is stored, then just set the field to any value, so that the service recognizes that you wish to use the web form flow.")
  public String getBankingPin() {
    return bankingPin;
  }

  public void setBankingPin(String bankingPin) {
    this.bankingPin = bankingPin;
  }

  public RequestSepaMoneyTransferParams storePin(Boolean storePin) {
    this.storePin = storePin;
    return this;
  }

   /**
   * Whether to store the PIN. If the PIN is stored, it is not required to pass the PIN again when executing SEPA orders. Default value is &#39;false&#39;. &lt;br/&gt;&lt;br/&gt;NOTES:&lt;br/&gt; - before you set this field to true, please regard the &#39;pinsAreVolatile&#39; flag of the bank connection that the account belongs to;&lt;br/&gt; - this field is ignored in case when the user will need to use finAPI&#39;s web form. The user will be able to decide whether to store the PIN or not in the web form, depending on the &#39;pinStorageAvailableInWebForm&#39; setting (see Client Configuration).
   * @return storePin
  **/
  @ApiModelProperty(example = "true", value = "Whether to store the PIN. If the PIN is stored, it is not required to pass the PIN again when executing SEPA orders. Default value is 'false'. <br/><br/>NOTES:<br/> - before you set this field to true, please regard the 'pinsAreVolatile' flag of the bank connection that the account belongs to;<br/> - this field is ignored in case when the user will need to use finAPI's web form. The user will be able to decide whether to store the PIN or not in the web form, depending on the 'pinStorageAvailableInWebForm' setting (see Client Configuration).")
  public Boolean isStorePin() {
    return storePin;
  }

  public void setStorePin(Boolean storePin) {
    this.storePin = storePin;
  }

  public RequestSepaMoneyTransferParams twoStepProcedureId(String twoStepProcedureId) {
    this.twoStepProcedureId = twoStepProcedureId;
    return this;
  }

   /**
   * The bank-given ID of the two-step-procedure that should be used for the order. For a list of available two-step-procedures, see the corresponding bank connection (GET /bankConnections). If this field is not set, then the bank connection&#39;s default two-step-procedure will be used. Note that in this case, when the bank connection has no default two-step-procedure set, then the response of the service depends on whether you need to use finAPI&#39;s web form or not. If you need to use the web form, the user will be prompted to select the two-step-procedure within the web form. If you don&#39;t need to use the web form, then the service will return an error (passing a value for this field is required in this case).
   * @return twoStepProcedureId
  **/
  @ApiModelProperty(example = "955", value = "The bank-given ID of the two-step-procedure that should be used for the order. For a list of available two-step-procedures, see the corresponding bank connection (GET /bankConnections). If this field is not set, then the bank connection's default two-step-procedure will be used. Note that in this case, when the bank connection has no default two-step-procedure set, then the response of the service depends on whether you need to use finAPI's web form or not. If you need to use the web form, the user will be prompted to select the two-step-procedure within the web form. If you don't need to use the web form, then the service will return an error (passing a value for this field is required in this case).")
  public String getTwoStepProcedureId() {
    return twoStepProcedureId;
  }

  public void setTwoStepProcedureId(String twoStepProcedureId) {
    this.twoStepProcedureId = twoStepProcedureId;
  }

  public RequestSepaMoneyTransferParams challengeResponse(String challengeResponse) {
    this.challengeResponse = challengeResponse;
    return this;
  }

   /**
   * Challenge response. This field should be set only when the previous attempt to request a SEPA money transfer failed with HTTP code 510, i.e. the bank sent a challenge for the user for an additional authentication. In this case, this field must contain the response to the bank&#39;s challenge. Please note that in case of using finAPI&#39;s web form you have to leave this field unset and the application will automatically recognize that the user has to input challenge response and then a web form will be shown to the user.
   * @return challengeResponse
  **/
  @ApiModelProperty(example = "0123", value = "Challenge response. This field should be set only when the previous attempt to request a SEPA money transfer failed with HTTP code 510, i.e. the bank sent a challenge for the user for an additional authentication. In this case, this field must contain the response to the bank's challenge. Please note that in case of using finAPI's web form you have to leave this field unset and the application will automatically recognize that the user has to input challenge response and then a web form will be shown to the user.")
  public String getChallengeResponse() {
    return challengeResponse;
  }

  public void setChallengeResponse(String challengeResponse) {
    this.challengeResponse = challengeResponse;
  }

  public RequestSepaMoneyTransferParams executionDate(String executionDate) {
    this.executionDate = executionDate;
    return this;
  }

   /**
   * Execution date for the money transfer(s), in the format &#39;YYYY-MM-DD&#39;. If not specified, then the current date will be used.
   * @return executionDate
  **/
  @ApiModelProperty(example = "2018-01-01", value = "Execution date for the money transfer(s), in the format 'YYYY-MM-DD'. If not specified, then the current date will be used.")
  public String getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(String executionDate) {
    this.executionDate = executionDate;
  }

  public RequestSepaMoneyTransferParams singleBooking(Boolean singleBooking) {
    this.singleBooking = singleBooking;
    return this;
  }

   /**
   * This field is only regarded when you pass multiple orders. It determines whether the orders should be processed by the bank as one collective booking (in case of &#39;false&#39;), or as single bookings (in case of &#39;true&#39;). Default value is &#39;false&#39;.
   * @return singleBooking
  **/
  @ApiModelProperty(example = "false", value = "This field is only regarded when you pass multiple orders. It determines whether the orders should be processed by the bank as one collective booking (in case of 'false'), or as single bookings (in case of 'true'). Default value is 'false'.")
  public Boolean isSingleBooking() {
    return singleBooking;
  }

  public void setSingleBooking(Boolean singleBooking) {
    this.singleBooking = singleBooking;
  }

  public RequestSepaMoneyTransferParams additionalMoneyTransfers(List<SingleMoneyTransferRecipientData> additionalMoneyTransfers) {
    this.additionalMoneyTransfers = additionalMoneyTransfers;
    return this;
  }

  public RequestSepaMoneyTransferParams addAdditionalMoneyTransfersItem(SingleMoneyTransferRecipientData additionalMoneyTransfersItem) {
    if (this.additionalMoneyTransfers == null) {
      this.additionalMoneyTransfers = new ArrayList<SingleMoneyTransferRecipientData>();
    }
    this.additionalMoneyTransfers.add(additionalMoneyTransfersItem);
    return this;
  }

   /**
   * In case that you want to submit not just a single money transfer, but do a collective money transfer, use this field to pass a list of additional money transfer orders. The service will then pass a collective money transfer request to the bank, including both the money transfer specified on the top-level, as well as all money transfers specified in this list. The maximum count of money transfers that you can pass (in total) is 15000. Note that you should check the account&#39;s &#39;supportedOrders&#39; field to find out whether or not it is supporting collective money transfers.
   * @return additionalMoneyTransfers
  **/
  @ApiModelProperty(value = "In case that you want to submit not just a single money transfer, but do a collective money transfer, use this field to pass a list of additional money transfer orders. The service will then pass a collective money transfer request to the bank, including both the money transfer specified on the top-level, as well as all money transfers specified in this list. The maximum count of money transfers that you can pass (in total) is 15000. Note that you should check the account's 'supportedOrders' field to find out whether or not it is supporting collective money transfers.")
  public List<SingleMoneyTransferRecipientData> getAdditionalMoneyTransfers() {
    return additionalMoneyTransfers;
  }

  public void setAdditionalMoneyTransfers(List<SingleMoneyTransferRecipientData> additionalMoneyTransfers) {
    this.additionalMoneyTransfers = additionalMoneyTransfers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestSepaMoneyTransferParams requestSepaMoneyTransferParams = (RequestSepaMoneyTransferParams) o;
    return Objects.equals(this.recipientName, requestSepaMoneyTransferParams.recipientName) &&
        Objects.equals(this.recipientIban, requestSepaMoneyTransferParams.recipientIban) &&
        Objects.equals(this.recipientBic, requestSepaMoneyTransferParams.recipientBic) &&
        Objects.equals(this.clearingAccountId, requestSepaMoneyTransferParams.clearingAccountId) &&
        Objects.equals(this.amount, requestSepaMoneyTransferParams.amount) &&
        Objects.equals(this.purpose, requestSepaMoneyTransferParams.purpose) &&
        Objects.equals(this.sepaPurposeCode, requestSepaMoneyTransferParams.sepaPurposeCode) &&
        Objects.equals(this.accountId, requestSepaMoneyTransferParams.accountId) &&
        Objects.equals(this.bankingPin, requestSepaMoneyTransferParams.bankingPin) &&
        Objects.equals(this.storePin, requestSepaMoneyTransferParams.storePin) &&
        Objects.equals(this.twoStepProcedureId, requestSepaMoneyTransferParams.twoStepProcedureId) &&
        Objects.equals(this.challengeResponse, requestSepaMoneyTransferParams.challengeResponse) &&
        Objects.equals(this.executionDate, requestSepaMoneyTransferParams.executionDate) &&
        Objects.equals(this.singleBooking, requestSepaMoneyTransferParams.singleBooking) &&
        Objects.equals(this.additionalMoneyTransfers, requestSepaMoneyTransferParams.additionalMoneyTransfers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recipientName, recipientIban, recipientBic, clearingAccountId, amount, purpose, sepaPurposeCode, accountId, bankingPin, storePin, twoStepProcedureId, challengeResponse, executionDate, singleBooking, additionalMoneyTransfers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestSepaMoneyTransferParams {\n");
    
    sb.append("    recipientName: ").append(toIndentedString(recipientName)).append("\n");
    sb.append("    recipientIban: ").append(toIndentedString(recipientIban)).append("\n");
    sb.append("    recipientBic: ").append(toIndentedString(recipientBic)).append("\n");
    sb.append("    clearingAccountId: ").append(toIndentedString(clearingAccountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    sepaPurposeCode: ").append(toIndentedString(sepaPurposeCode)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    bankingPin: ").append(toIndentedString(bankingPin)).append("\n");
    sb.append("    storePin: ").append(toIndentedString(storePin)).append("\n");
    sb.append("    twoStepProcedureId: ").append(toIndentedString(twoStepProcedureId)).append("\n");
    sb.append("    challengeResponse: ").append(toIndentedString(challengeResponse)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
    sb.append("    singleBooking: ").append(toIndentedString(singleBooking)).append("\n");
    sb.append("    additionalMoneyTransfers: ").append(toIndentedString(additionalMoneyTransfers)).append("\n");
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

