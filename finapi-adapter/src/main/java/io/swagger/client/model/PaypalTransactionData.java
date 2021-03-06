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
 * Additional, PayPal-specific transaction data. This field is only set for transactions that belong to an account of the &#39;PayPal&#39; bank (BLZ &#39;PAYPAL&#39;).
 */
@ApiModel(description = "Additional, PayPal-specific transaction data. This field is only set for transactions that belong to an account of the 'PayPal' bank (BLZ 'PAYPAL').")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-02-05T12:19:21.458Z")
public class PaypalTransactionData {
  @SerializedName("invoiceNumber")
  private String invoiceNumber = null;

  @SerializedName("fee")
  private BigDecimal fee = null;

  @SerializedName("net")
  private BigDecimal net = null;

  @SerializedName("auctionSite")
  private String auctionSite = null;

  public PaypalTransactionData invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice Number
   * @return invoiceNumber
  **/
  @ApiModelProperty(example = "INV2-KXVU-7Z64-DT6W-MG2X", value = "Invoice Number")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public PaypalTransactionData fee(BigDecimal fee) {
    this.fee = fee;
    return this;
  }

   /**
   * Fee value
   * @return fee
  **/
  @ApiModelProperty(example = "-0.99", value = "Fee value")
  public BigDecimal getFee() {
    return fee;
  }

  public void setFee(BigDecimal fee) {
    this.fee = fee;
  }

  public PaypalTransactionData net(BigDecimal net) {
    this.net = net;
    return this;
  }

   /**
   * Net value
   * @return net
  **/
  @ApiModelProperty(example = "9.99", value = "Net value")
  public BigDecimal getNet() {
    return net;
  }

  public void setNet(BigDecimal net) {
    this.net = net;
  }

  public PaypalTransactionData auctionSite(String auctionSite) {
    this.auctionSite = auctionSite;
    return this;
  }

   /**
   * Auction Site
   * @return auctionSite
  **/
  @ApiModelProperty(example = "eBay", value = "Auction Site")
  public String getAuctionSite() {
    return auctionSite;
  }

  public void setAuctionSite(String auctionSite) {
    this.auctionSite = auctionSite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaypalTransactionData paypalTransactionData = (PaypalTransactionData) o;
    return Objects.equals(this.invoiceNumber, paypalTransactionData.invoiceNumber) &&
        Objects.equals(this.fee, paypalTransactionData.fee) &&
        Objects.equals(this.net, paypalTransactionData.net) &&
        Objects.equals(this.auctionSite, paypalTransactionData.auctionSite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceNumber, fee, net, auctionSite);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaypalTransactionData {\n");
    
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    auctionSite: ").append(toIndentedString(auctionSite)).append("\n");
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

