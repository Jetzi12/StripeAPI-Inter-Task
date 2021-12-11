
package com.StripeApiTask.Model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Datum {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("object")
    @Expose
    public String object;
    @SerializedName("amount")
    @Expose
    public Integer amount;
    @SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("description")
    @Expose
    public String description;
    @SerializedName("discount_amounts")
    @Expose
    public List<Object> discountAmounts = null;
    @SerializedName("discountable")
    @Expose
    public Boolean discountable;
    @SerializedName("discounts")
    @Expose
    public List<Object> discounts = null;
    @SerializedName("invoice_item")
    @Expose
    public String invoiceItem;
    @SerializedName("livemode")
    @Expose
    public Boolean livemode;
    @SerializedName("metadata")
    @Expose
    public Metadata metadata;
    @SerializedName("period")
    @Expose
    public Period period;
    @SerializedName("price")
    @Expose
    public Price price;
    @SerializedName("proration")
    @Expose
    public Boolean proration;
    @SerializedName("quantity")
    @Expose
    public Integer quantity;
    @SerializedName("subscription")
    @Expose
    public Object subscription;
    @SerializedName("tax_amounts")
    @Expose
    public List<Object> taxAmounts = null;
    @SerializedName("tax_rates")
    @Expose
    public List<Object> taxRates = null;
    @SerializedName("type")
    @Expose
    public String type;

    public Datum withId(String id) {
        this.id = id;
        return this;
    }

    public Datum withObject(String object) {
        this.object = object;
        return this;
    }

    public Datum withAmount(Integer amount) {
        this.amount = amount;
        return this;
    }

    public Datum withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public Datum withDescription(String description) {
        this.description = description;
        return this;
    }

    public Datum withDiscountAmounts(List<Object> discountAmounts) {
        this.discountAmounts = discountAmounts;
        return this;
    }

    public Datum withDiscountable(Boolean discountable) {
        this.discountable = discountable;
        return this;
    }

    public Datum withDiscounts(List<Object> discounts) {
        this.discounts = discounts;
        return this;
    }

    public Datum withInvoiceItem(String invoiceItem) {
        this.invoiceItem = invoiceItem;
        return this;
    }

    public Datum withLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    public Datum withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Datum withPeriod(Period period) {
        this.period = period;
        return this;
    }

    public Datum withPrice(Price price) {
        this.price = price;
        return this;
    }

    public Datum withProration(Boolean proration) {
        this.proration = proration;
        return this;
    }

    public Datum withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public Datum withSubscription(Object subscription) {
        this.subscription = subscription;
        return this;
    }

    public Datum withTaxAmounts(List<Object> taxAmounts) {
        this.taxAmounts = taxAmounts;
        return this;
    }

    public Datum withTaxRates(List<Object> taxRates) {
        this.taxRates = taxRates;
        return this;
    }

    public Datum withType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Datum.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("object");
        sb.append('=');
        sb.append(((this.object == null)?"<null>":this.object));
        sb.append(',');
        sb.append("amount");
        sb.append('=');
        sb.append(((this.amount == null)?"<null>":this.amount));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("discountAmounts");
        sb.append('=');
        sb.append(((this.discountAmounts == null)?"<null>":this.discountAmounts));
        sb.append(',');
        sb.append("discountable");
        sb.append('=');
        sb.append(((this.discountable == null)?"<null>":this.discountable));
        sb.append(',');
        sb.append("discounts");
        sb.append('=');
        sb.append(((this.discounts == null)?"<null>":this.discounts));
        sb.append(',');
        sb.append("invoiceItem");
        sb.append('=');
        sb.append(((this.invoiceItem == null)?"<null>":this.invoiceItem));
        sb.append(',');
        sb.append("livemode");
        sb.append('=');
        sb.append(((this.livemode == null)?"<null>":this.livemode));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("period");
        sb.append('=');
        sb.append(((this.period == null)?"<null>":this.period));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(((this.price == null)?"<null>":this.price));
        sb.append(',');
        sb.append("proration");
        sb.append('=');
        sb.append(((this.proration == null)?"<null>":this.proration));
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(((this.quantity == null)?"<null>":this.quantity));
        sb.append(',');
        sb.append("subscription");
        sb.append('=');
        sb.append(((this.subscription == null)?"<null>":this.subscription));
        sb.append(',');
        sb.append("taxAmounts");
        sb.append('=');
        sb.append(((this.taxAmounts == null)?"<null>":this.taxAmounts));
        sb.append(',');
        sb.append("taxRates");
        sb.append('=');
        sb.append(((this.taxRates == null)?"<null>":this.taxRates));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
