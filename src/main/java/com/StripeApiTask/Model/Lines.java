
package com.StripeApiTask.Model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Lines {

    @SerializedName("object")
    @Expose
    public String object;
    @SerializedName("data")
    @Expose
    public List<Datum> data = null;
    @SerializedName("has_more")
    @Expose
    public Boolean hasMore;
    @SerializedName("url")
    @Expose
    public String url;

    public Lines withObject(String object) {
        this.object = object;
        return this;
    }

    public Lines withData(List<Datum> data) {
        this.data = data;
        return this;
    }

    public Lines withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
        return this;
    }

    public Lines withUrl(String url) {
        this.url = url;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Lines.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("object");
        sb.append('=');
        sb.append(((this.object == null)?"<null>":this.object));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("hasMore");
        sb.append('=');
        sb.append(((this.hasMore == null)?"<null>":this.hasMore));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
