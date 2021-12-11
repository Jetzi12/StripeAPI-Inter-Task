
package com.StripeApiTask.Model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class PaymentSettings {

    @SerializedName("payment_method_options")
    @Expose
    public Object paymentMethodOptions;
    @SerializedName("payment_method_types")
    @Expose
    public Object paymentMethodTypes;

    public PaymentSettings withPaymentMethodOptions(Object paymentMethodOptions) {
        this.paymentMethodOptions = paymentMethodOptions;
        return this;
    }

    public PaymentSettings withPaymentMethodTypes(Object paymentMethodTypes) {
        this.paymentMethodTypes = paymentMethodTypes;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PaymentSettings.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("paymentMethodOptions");
        sb.append('=');
        sb.append(((this.paymentMethodOptions == null)?"<null>":this.paymentMethodOptions));
        sb.append(',');
        sb.append("paymentMethodTypes");
        sb.append('=');
        sb.append(((this.paymentMethodTypes == null)?"<null>":this.paymentMethodTypes));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
