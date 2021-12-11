
package com.StripeApiTask.Model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class StatusTransitions {

    @SerializedName("finalized_at")
    @Expose
    public Object finalizedAt;
    @SerializedName("marked_uncollectible_at")
    @Expose
    public Object markedUncollectibleAt;
    @SerializedName("paid_at")
    @Expose
    public Object paidAt;
    @SerializedName("voided_at")
    @Expose
    public Object voidedAt;

    public StatusTransitions withFinalizedAt(Object finalizedAt) {
        this.finalizedAt = finalizedAt;
        return this;
    }

    public StatusTransitions withMarkedUncollectibleAt(Object markedUncollectibleAt) {
        this.markedUncollectibleAt = markedUncollectibleAt;
        return this;
    }

    public StatusTransitions withPaidAt(Object paidAt) {
        this.paidAt = paidAt;
        return this;
    }

    public StatusTransitions withVoidedAt(Object voidedAt) {
        this.voidedAt = voidedAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StatusTransitions.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("finalizedAt");
        sb.append('=');
        sb.append(((this.finalizedAt == null)?"<null>":this.finalizedAt));
        sb.append(',');
        sb.append("markedUncollectibleAt");
        sb.append('=');
        sb.append(((this.markedUncollectibleAt == null)?"<null>":this.markedUncollectibleAt));
        sb.append(',');
        sb.append("paidAt");
        sb.append('=');
        sb.append(((this.paidAt == null)?"<null>":this.paidAt));
        sb.append(',');
        sb.append("voidedAt");
        sb.append('=');
        sb.append(((this.voidedAt == null)?"<null>":this.voidedAt));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
