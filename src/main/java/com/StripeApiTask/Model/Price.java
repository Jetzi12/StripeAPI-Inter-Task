
package com.StripeApiTask.Model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Price {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("object")
    @Expose
    public String object;
    @SerializedName("active")
    @Expose
    public Boolean active;
    @SerializedName("billing_scheme")
    @Expose
    public String billingScheme;
    @SerializedName("created")
    @Expose
    public Integer created;
    @SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("livemode")
    @Expose
    public Boolean livemode;
    @SerializedName("lookup_key")
    @Expose
    public Object lookupKey;
    @SerializedName("metadata")
    @Expose
    public Metadata metadata;
    @SerializedName("nickname")
    @Expose
    public Object nickname;
    @SerializedName("product")
    @Expose
    public String product;
    @SerializedName("recurring")
    @Expose
    public Object recurring;
    @SerializedName("tax_behavior")
    @Expose
    public String taxBehavior;
    @SerializedName("tiers_mode")
    @Expose
    public Object tiersMode;
    @SerializedName("transform_quantity")
    @Expose
    public Object transformQuantity;
    @SerializedName("type")
    @Expose
    public String type;
    @SerializedName("unit_amount")
    @Expose
    public Integer unitAmount;
    @SerializedName("unit_amount_decimal")
    @Expose
    public String unitAmountDecimal;

    public Price withId(String id) {
        this.id = id;
        return this;
    }

    public Price withObject(String object) {
        this.object = object;
        return this;
    }

    public Price withActive(Boolean active) {
        this.active = active;
        return this;
    }

    public Price withBillingScheme(String billingScheme) {
        this.billingScheme = billingScheme;
        return this;
    }

    public Price withCreated(Integer created) {
        this.created = created;
        return this;
    }

    public Price withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public Price withLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    public Price withLookupKey(Object lookupKey) {
        this.lookupKey = lookupKey;
        return this;
    }

    public Price withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Price withNickname(Object nickname) {
        this.nickname = nickname;
        return this;
    }

    public Price withProduct(String product) {
        this.product = product;
        return this;
    }

    public Price withRecurring(Object recurring) {
        this.recurring = recurring;
        return this;
    }

    public Price withTaxBehavior(String taxBehavior) {
        this.taxBehavior = taxBehavior;
        return this;
    }

    public Price withTiersMode(Object tiersMode) {
        this.tiersMode = tiersMode;
        return this;
    }

    public Price withTransformQuantity(Object transformQuantity) {
        this.transformQuantity = transformQuantity;
        return this;
    }

    public Price withType(String type) {
        this.type = type;
        return this;
    }

    public Price withUnitAmount(Integer unitAmount) {
        this.unitAmount = unitAmount;
        return this;
    }

    public Price withUnitAmountDecimal(String unitAmountDecimal) {
        this.unitAmountDecimal = unitAmountDecimal;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Price.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("object");
        sb.append('=');
        sb.append(((this.object == null)?"<null>":this.object));
        sb.append(',');
        sb.append("active");
        sb.append('=');
        sb.append(((this.active == null)?"<null>":this.active));
        sb.append(',');
        sb.append("billingScheme");
        sb.append('=');
        sb.append(((this.billingScheme == null)?"<null>":this.billingScheme));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("livemode");
        sb.append('=');
        sb.append(((this.livemode == null)?"<null>":this.livemode));
        sb.append(',');
        sb.append("lookupKey");
        sb.append('=');
        sb.append(((this.lookupKey == null)?"<null>":this.lookupKey));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("nickname");
        sb.append('=');
        sb.append(((this.nickname == null)?"<null>":this.nickname));
        sb.append(',');
        sb.append("product");
        sb.append('=');
        sb.append(((this.product == null)?"<null>":this.product));
        sb.append(',');
        sb.append("recurring");
        sb.append('=');
        sb.append(((this.recurring == null)?"<null>":this.recurring));
        sb.append(',');
        sb.append("taxBehavior");
        sb.append('=');
        sb.append(((this.taxBehavior == null)?"<null>":this.taxBehavior));
        sb.append(',');
        sb.append("tiersMode");
        sb.append('=');
        sb.append(((this.tiersMode == null)?"<null>":this.tiersMode));
        sb.append(',');
        sb.append("transformQuantity");
        sb.append('=');
        sb.append(((this.transformQuantity == null)?"<null>":this.transformQuantity));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("unitAmount");
        sb.append('=');
        sb.append(((this.unitAmount == null)?"<null>":this.unitAmount));
        sb.append(',');
        sb.append("unitAmountDecimal");
        sb.append('=');
        sb.append(((this.unitAmountDecimal == null)?"<null>":this.unitAmountDecimal));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
