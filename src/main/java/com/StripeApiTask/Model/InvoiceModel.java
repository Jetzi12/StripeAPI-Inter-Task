
package com.StripeApiTask.Model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;

@Builder
@Generated("jsonschema2pojo")
public class InvoiceModel {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("object")
    @Expose
    public String object;
    @SerializedName("account_country")
    @Expose
    public String accountCountry;
    @SerializedName("account_name")
    @Expose
    public String accountName;
    @SerializedName("account_tax_ids")
    @Expose
    public Object accountTaxIds;
    @SerializedName("amount_due")
    @Expose
    public Integer amountDue;
    @SerializedName("amount_paid")
    @Expose
    public Integer amountPaid;
    @SerializedName("amount_remaining")
    @Expose
    public Integer amountRemaining;
    @SerializedName("application_fee_amount")
    @Expose
    public Object applicationFeeAmount;
    @SerializedName("attempt_count")
    @Expose
    public Integer attemptCount;
    @SerializedName("attempted")
    @Expose
    public Boolean attempted;
    @SerializedName("auto_advance")
    @Expose
    public Boolean autoAdvance;
    @SerializedName("automatic_tax")
    @Expose
    public AutomaticTax automaticTax;
    @SerializedName("billing_reason")
    @Expose
    public String billingReason;
    @SerializedName("charge")
    @Expose
    public Object charge;
    @SerializedName("collection_method")
    @Expose
    public String collectionMethod;
    @SerializedName("created")
    @Expose
    public Integer created;
    @SerializedName("currency")
    @Expose
    public String currency;
    @SerializedName("custom_fields")
    @Expose
    public Object customFields;
    @SerializedName("customer")
    @Expose
    public String customer;
    @SerializedName("customer_address")
    @Expose
    public Object customerAddress;
    @SerializedName("customer_email")
    @Expose
    public String customerEmail;
    @SerializedName("customer_name")
    @Expose
    public Object customerName;
    @SerializedName("customer_phone")
    @Expose
    public Object customerPhone;
    @SerializedName("customer_shipping")
    @Expose
    public Object customerShipping;
    @SerializedName("customer_tax_exempt")
    @Expose
    public String customerTaxExempt;
    @SerializedName("customer_tax_ids")
    @Expose
    public List<Object> customerTaxIds = null;
    @SerializedName("default_payment_method")
    @Expose
    public Object defaultPaymentMethod;
    @SerializedName("default_source")
    @Expose
    public Object defaultSource;
    @SerializedName("default_tax_rates")
    @Expose
    public List<Object> defaultTaxRates = null;
    @SerializedName("description")
    @Expose
    public Object description;
    @SerializedName("discount")
    @Expose
    public Object discount;
    @SerializedName("discounts")
    @Expose
    public List<Object> discounts = null;
    @SerializedName("due_date")
    @Expose
    public Object dueDate;
    @SerializedName("ending_balance")
    @Expose
    public Object endingBalance;
    @SerializedName("footer")
    @Expose
    public Object footer;
    @SerializedName("hosted_invoice_url")
    @Expose
    public Object hostedInvoiceUrl;
    @SerializedName("invoice_pdf")
    @Expose
    public Object invoicePdf;
    @SerializedName("last_finalization_error")
    @Expose
    public Object lastFinalizationError;
    @SerializedName("lines")
    @Expose
    public Lines lines;
    @SerializedName("livemode")
    @Expose
    public Boolean livemode;
    @SerializedName("metadata")
    @Expose
    public Metadata metadata;
    @SerializedName("next_payment_attempt")
    @Expose
    public Integer nextPaymentAttempt;
    @SerializedName("number")
    @Expose
    public String number;
    @SerializedName("on_behalf_of")
    @Expose
    public Object onBehalfOf;
    @SerializedName("paid")
    @Expose
    public Boolean paid;
    @SerializedName("payment_intent")
    @Expose
    public Object paymentIntent;
    @SerializedName("payment_settings")
    @Expose
    public PaymentSettings paymentSettings;
    @SerializedName("period_end")
    @Expose
    public Integer periodEnd;
    @SerializedName("period_start")
    @Expose
    public Integer periodStart;
    @SerializedName("post_payment_credit_notes_amount")
    @Expose
    public Integer postPaymentCreditNotesAmount;
    @SerializedName("pre_payment_credit_notes_amount")
    @Expose
    public Integer prePaymentCreditNotesAmount;
    @SerializedName("quote")
    @Expose
    public Object quote;
    @SerializedName("receipt_number")
    @Expose
    public Object receiptNumber;
    @SerializedName("starting_balance")
    @Expose
    public Integer startingBalance;
    @SerializedName("statement_descriptor")
    @Expose
    public Object statementDescriptor;
    @SerializedName("status")
    @Expose
    public String status;
    @SerializedName("status_transitions")
    @Expose
    public StatusTransitions statusTransitions;
    @SerializedName("subscription")
    @Expose
    public Object subscription;
    @SerializedName("subtotal")
    @Expose
    public Integer subtotal;
    @SerializedName("tax")
    @Expose
    public Object tax;
    @SerializedName("total")
    @Expose
    public Integer total;
    @SerializedName("total_discount_amounts")
    @Expose
    public List<Object> totalDiscountAmounts = null;
    @SerializedName("total_tax_amounts")
    @Expose
    public List<Object> totalTaxAmounts = null;
    @SerializedName("transfer_data")
    @Expose
    public Object transferData;
    @SerializedName("webhooks_delivered_at")
    @Expose
    public Object webhooksDeliveredAt;

    public InvoiceModel withId(String id) {
        this.id = id;
        return this;
    }

    public InvoiceModel withObject(String object) {
        this.object = object;
        return this;
    }

    public InvoiceModel withAccountCountry(String accountCountry) {
        this.accountCountry = accountCountry;
        return this;
    }

    public InvoiceModel withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    public InvoiceModel withAccountTaxIds(Object accountTaxIds) {
        this.accountTaxIds = accountTaxIds;
        return this;
    }

    public InvoiceModel withAmountDue(Integer amountDue) {
        this.amountDue = amountDue;
        return this;
    }

    public InvoiceModel withAmountPaid(Integer amountPaid) {
        this.amountPaid = amountPaid;
        return this;
    }

    public InvoiceModel withAmountRemaining(Integer amountRemaining) {
        this.amountRemaining = amountRemaining;
        return this;
    }

    public InvoiceModel withApplicationFeeAmount(Object applicationFeeAmount) {
        this.applicationFeeAmount = applicationFeeAmount;
        return this;
    }

    public InvoiceModel withAttemptCount(Integer attemptCount) {
        this.attemptCount = attemptCount;
        return this;
    }

    public InvoiceModel withAttempted(Boolean attempted) {
        this.attempted = attempted;
        return this;
    }

    public InvoiceModel withAutoAdvance(Boolean autoAdvance) {
        this.autoAdvance = autoAdvance;
        return this;
    }

    public InvoiceModel withAutomaticTax(AutomaticTax automaticTax) {
        this.automaticTax = automaticTax;
        return this;
    }

    public InvoiceModel withBillingReason(String billingReason) {
        this.billingReason = billingReason;
        return this;
    }

    public InvoiceModel withCharge(Object charge) {
        this.charge = charge;
        return this;
    }

    public InvoiceModel withCollectionMethod(String collectionMethod) {
        this.collectionMethod = collectionMethod;
        return this;
    }

    public InvoiceModel withCreated(Integer created) {
        this.created = created;
        return this;
    }

    public InvoiceModel withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    public InvoiceModel withCustomFields(Object customFields) {
        this.customFields = customFields;
        return this;
    }

    public InvoiceModel withCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    public InvoiceModel withCustomerAddress(Object customerAddress) {
        this.customerAddress = customerAddress;
        return this;
    }

    public InvoiceModel withCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public InvoiceModel withCustomerName(Object customerName) {
        this.customerName = customerName;
        return this;
    }

    public InvoiceModel withCustomerPhone(Object customerPhone) {
        this.customerPhone = customerPhone;
        return this;
    }

    public InvoiceModel withCustomerShipping(Object customerShipping) {
        this.customerShipping = customerShipping;
        return this;
    }

    public InvoiceModel withCustomerTaxExempt(String customerTaxExempt) {
        this.customerTaxExempt = customerTaxExempt;
        return this;
    }

    public InvoiceModel withCustomerTaxIds(List<Object> customerTaxIds) {
        this.customerTaxIds = customerTaxIds;
        return this;
    }

    public InvoiceModel withDefaultPaymentMethod(Object defaultPaymentMethod) {
        this.defaultPaymentMethod = defaultPaymentMethod;
        return this;
    }

    public InvoiceModel withDefaultSource(Object defaultSource) {
        this.defaultSource = defaultSource;
        return this;
    }

    public InvoiceModel withDefaultTaxRates(List<Object> defaultTaxRates) {
        this.defaultTaxRates = defaultTaxRates;
        return this;
    }

    public InvoiceModel withDescription(Object description) {
        this.description = description;
        return this;
    }

    public InvoiceModel withDiscount(Object discount) {
        this.discount = discount;
        return this;
    }

    public InvoiceModel withDiscounts(List<Object> discounts) {
        this.discounts = discounts;
        return this;
    }

    public InvoiceModel withDueDate(Object dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public InvoiceModel withEndingBalance(Object endingBalance) {
        this.endingBalance = endingBalance;
        return this;
    }

    public InvoiceModel withFooter(Object footer) {
        this.footer = footer;
        return this;
    }

    public InvoiceModel withHostedInvoiceUrl(Object hostedInvoiceUrl) {
        this.hostedInvoiceUrl = hostedInvoiceUrl;
        return this;
    }

    public InvoiceModel withInvoicePdf(Object invoicePdf) {
        this.invoicePdf = invoicePdf;
        return this;
    }

    public InvoiceModel withLastFinalizationError(Object lastFinalizationError) {
        this.lastFinalizationError = lastFinalizationError;
        return this;
    }

    public InvoiceModel withLines(Lines lines) {
        this.lines = lines;
        return this;
    }

    public InvoiceModel withLivemode(Boolean livemode) {
        this.livemode = livemode;
        return this;
    }

    public InvoiceModel withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public InvoiceModel withNextPaymentAttempt(Integer nextPaymentAttempt) {
        this.nextPaymentAttempt = nextPaymentAttempt;
        return this;
    }

    public InvoiceModel withNumber(String number) {
        this.number = number;
        return this;
    }

    public InvoiceModel withOnBehalfOf(Object onBehalfOf) {
        this.onBehalfOf = onBehalfOf;
        return this;
    }

    public InvoiceModel withPaid(Boolean paid) {
        this.paid = paid;
        return this;
    }

    public InvoiceModel withPaymentIntent(Object paymentIntent) {
        this.paymentIntent = paymentIntent;
        return this;
    }

    public InvoiceModel withPaymentSettings(PaymentSettings paymentSettings) {
        this.paymentSettings = paymentSettings;
        return this;
    }

    public InvoiceModel withPeriodEnd(Integer periodEnd) {
        this.periodEnd = periodEnd;
        return this;
    }

    public InvoiceModel withPeriodStart(Integer periodStart) {
        this.periodStart = periodStart;
        return this;
    }

    public InvoiceModel withPostPaymentCreditNotesAmount(Integer postPaymentCreditNotesAmount) {
        this.postPaymentCreditNotesAmount = postPaymentCreditNotesAmount;
        return this;
    }

    public InvoiceModel withPrePaymentCreditNotesAmount(Integer prePaymentCreditNotesAmount) {
        this.prePaymentCreditNotesAmount = prePaymentCreditNotesAmount;
        return this;
    }

    public InvoiceModel withQuote(Object quote) {
        this.quote = quote;
        return this;
    }

    public InvoiceModel withReceiptNumber(Object receiptNumber) {
        this.receiptNumber = receiptNumber;
        return this;
    }

    public InvoiceModel withStartingBalance(Integer startingBalance) {
        this.startingBalance = startingBalance;
        return this;
    }

    public InvoiceModel withStatementDescriptor(Object statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
        return this;
    }

    public InvoiceModel withStatus(String status) {
        this.status = status;
        return this;
    }

    public InvoiceModel withStatusTransitions(StatusTransitions statusTransitions) {
        this.statusTransitions = statusTransitions;
        return this;
    }

    public InvoiceModel withSubscription(Object subscription) {
        this.subscription = subscription;
        return this;
    }

    public InvoiceModel withSubtotal(Integer subtotal) {
        this.subtotal = subtotal;
        return this;
    }

    public InvoiceModel withTax(Object tax) {
        this.tax = tax;
        return this;
    }

    public InvoiceModel withTotal(Integer total) {
        this.total = total;
        return this;
    }

    public InvoiceModel withTotalDiscountAmounts(List<Object> totalDiscountAmounts) {
        this.totalDiscountAmounts = totalDiscountAmounts;
        return this;
    }

    public InvoiceModel withTotalTaxAmounts(List<Object> totalTaxAmounts) {
        this.totalTaxAmounts = totalTaxAmounts;
        return this;
    }

    public InvoiceModel withTransferData(Object transferData) {
        this.transferData = transferData;
        return this;
    }

    public InvoiceModel withWebhooksDeliveredAt(Object webhooksDeliveredAt) {
        this.webhooksDeliveredAt = webhooksDeliveredAt;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InvoiceModel.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("object");
        sb.append('=');
        sb.append(((this.object == null)?"<null>":this.object));
        sb.append(',');
        sb.append("accountCountry");
        sb.append('=');
        sb.append(((this.accountCountry == null)?"<null>":this.accountCountry));
        sb.append(',');
        sb.append("accountName");
        sb.append('=');
        sb.append(((this.accountName == null)?"<null>":this.accountName));
        sb.append(',');
        sb.append("accountTaxIds");
        sb.append('=');
        sb.append(((this.accountTaxIds == null)?"<null>":this.accountTaxIds));
        sb.append(',');
        sb.append("amountDue");
        sb.append('=');
        sb.append(((this.amountDue == null)?"<null>":this.amountDue));
        sb.append(',');
        sb.append("amountPaid");
        sb.append('=');
        sb.append(((this.amountPaid == null)?"<null>":this.amountPaid));
        sb.append(',');
        sb.append("amountRemaining");
        sb.append('=');
        sb.append(((this.amountRemaining == null)?"<null>":this.amountRemaining));
        sb.append(',');
        sb.append("applicationFeeAmount");
        sb.append('=');
        sb.append(((this.applicationFeeAmount == null)?"<null>":this.applicationFeeAmount));
        sb.append(',');
        sb.append("attemptCount");
        sb.append('=');
        sb.append(((this.attemptCount == null)?"<null>":this.attemptCount));
        sb.append(',');
        sb.append("attempted");
        sb.append('=');
        sb.append(((this.attempted == null)?"<null>":this.attempted));
        sb.append(',');
        sb.append("autoAdvance");
        sb.append('=');
        sb.append(((this.autoAdvance == null)?"<null>":this.autoAdvance));
        sb.append(',');
        sb.append("automaticTax");
        sb.append('=');
        sb.append(((this.automaticTax == null)?"<null>":this.automaticTax));
        sb.append(',');
        sb.append("billingReason");
        sb.append('=');
        sb.append(((this.billingReason == null)?"<null>":this.billingReason));
        sb.append(',');
        sb.append("charge");
        sb.append('=');
        sb.append(((this.charge == null)?"<null>":this.charge));
        sb.append(',');
        sb.append("collectionMethod");
        sb.append('=');
        sb.append(((this.collectionMethod == null)?"<null>":this.collectionMethod));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null)?"<null>":this.created));
        sb.append(',');
        sb.append("currency");
        sb.append('=');
        sb.append(((this.currency == null)?"<null>":this.currency));
        sb.append(',');
        sb.append("customFields");
        sb.append('=');
        sb.append(((this.customFields == null)?"<null>":this.customFields));
        sb.append(',');
        sb.append("customer");
        sb.append('=');
        sb.append(((this.customer == null)?"<null>":this.customer));
        sb.append(',');
        sb.append("customerAddress");
        sb.append('=');
        sb.append(((this.customerAddress == null)?"<null>":this.customerAddress));
        sb.append(',');
        sb.append("customerEmail");
        sb.append('=');
        sb.append(((this.customerEmail == null)?"<null>":this.customerEmail));
        sb.append(',');
        sb.append("customerName");
        sb.append('=');
        sb.append(((this.customerName == null)?"<null>":this.customerName));
        sb.append(',');
        sb.append("customerPhone");
        sb.append('=');
        sb.append(((this.customerPhone == null)?"<null>":this.customerPhone));
        sb.append(',');
        sb.append("customerShipping");
        sb.append('=');
        sb.append(((this.customerShipping == null)?"<null>":this.customerShipping));
        sb.append(',');
        sb.append("customerTaxExempt");
        sb.append('=');
        sb.append(((this.customerTaxExempt == null)?"<null>":this.customerTaxExempt));
        sb.append(',');
        sb.append("customerTaxIds");
        sb.append('=');
        sb.append(((this.customerTaxIds == null)?"<null>":this.customerTaxIds));
        sb.append(',');
        sb.append("defaultPaymentMethod");
        sb.append('=');
        sb.append(((this.defaultPaymentMethod == null)?"<null>":this.defaultPaymentMethod));
        sb.append(',');
        sb.append("defaultSource");
        sb.append('=');
        sb.append(((this.defaultSource == null)?"<null>":this.defaultSource));
        sb.append(',');
        sb.append("defaultTaxRates");
        sb.append('=');
        sb.append(((this.defaultTaxRates == null)?"<null>":this.defaultTaxRates));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("discount");
        sb.append('=');
        sb.append(((this.discount == null)?"<null>":this.discount));
        sb.append(',');
        sb.append("discounts");
        sb.append('=');
        sb.append(((this.discounts == null)?"<null>":this.discounts));
        sb.append(',');
        sb.append("dueDate");
        sb.append('=');
        sb.append(((this.dueDate == null)?"<null>":this.dueDate));
        sb.append(',');
        sb.append("endingBalance");
        sb.append('=');
        sb.append(((this.endingBalance == null)?"<null>":this.endingBalance));
        sb.append(',');
        sb.append("footer");
        sb.append('=');
        sb.append(((this.footer == null)?"<null>":this.footer));
        sb.append(',');
        sb.append("hostedInvoiceUrl");
        sb.append('=');
        sb.append(((this.hostedInvoiceUrl == null)?"<null>":this.hostedInvoiceUrl));
        sb.append(',');
        sb.append("invoicePdf");
        sb.append('=');
        sb.append(((this.invoicePdf == null)?"<null>":this.invoicePdf));
        sb.append(',');
        sb.append("lastFinalizationError");
        sb.append('=');
        sb.append(((this.lastFinalizationError == null)?"<null>":this.lastFinalizationError));
        sb.append(',');
        sb.append("lines");
        sb.append('=');
        sb.append(((this.lines == null)?"<null>":this.lines));
        sb.append(',');
        sb.append("livemode");
        sb.append('=');
        sb.append(((this.livemode == null)?"<null>":this.livemode));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("nextPaymentAttempt");
        sb.append('=');
        sb.append(((this.nextPaymentAttempt == null)?"<null>":this.nextPaymentAttempt));
        sb.append(',');
        sb.append("number");
        sb.append('=');
        sb.append(((this.number == null)?"<null>":this.number));
        sb.append(',');
        sb.append("onBehalfOf");
        sb.append('=');
        sb.append(((this.onBehalfOf == null)?"<null>":this.onBehalfOf));
        sb.append(',');
        sb.append("paid");
        sb.append('=');
        sb.append(((this.paid == null)?"<null>":this.paid));
        sb.append(',');
        sb.append("paymentIntent");
        sb.append('=');
        sb.append(((this.paymentIntent == null)?"<null>":this.paymentIntent));
        sb.append(',');
        sb.append("paymentSettings");
        sb.append('=');
        sb.append(((this.paymentSettings == null)?"<null>":this.paymentSettings));
        sb.append(',');
        sb.append("periodEnd");
        sb.append('=');
        sb.append(((this.periodEnd == null)?"<null>":this.periodEnd));
        sb.append(',');
        sb.append("periodStart");
        sb.append('=');
        sb.append(((this.periodStart == null)?"<null>":this.periodStart));
        sb.append(',');
        sb.append("postPaymentCreditNotesAmount");
        sb.append('=');
        sb.append(((this.postPaymentCreditNotesAmount == null)?"<null>":this.postPaymentCreditNotesAmount));
        sb.append(',');
        sb.append("prePaymentCreditNotesAmount");
        sb.append('=');
        sb.append(((this.prePaymentCreditNotesAmount == null)?"<null>":this.prePaymentCreditNotesAmount));
        sb.append(',');
        sb.append("quote");
        sb.append('=');
        sb.append(((this.quote == null)?"<null>":this.quote));
        sb.append(',');
        sb.append("receiptNumber");
        sb.append('=');
        sb.append(((this.receiptNumber == null)?"<null>":this.receiptNumber));
        sb.append(',');
        sb.append("startingBalance");
        sb.append('=');
        sb.append(((this.startingBalance == null)?"<null>":this.startingBalance));
        sb.append(',');
        sb.append("statementDescriptor");
        sb.append('=');
        sb.append(((this.statementDescriptor == null)?"<null>":this.statementDescriptor));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("statusTransitions");
        sb.append('=');
        sb.append(((this.statusTransitions == null)?"<null>":this.statusTransitions));
        sb.append(',');
        sb.append("subscription");
        sb.append('=');
        sb.append(((this.subscription == null)?"<null>":this.subscription));
        sb.append(',');
        sb.append("subtotal");
        sb.append('=');
        sb.append(((this.subtotal == null)?"<null>":this.subtotal));
        sb.append(',');
        sb.append("tax");
        sb.append('=');
        sb.append(((this.tax == null)?"<null>":this.tax));
        sb.append(',');
        sb.append("total");
        sb.append('=');
        sb.append(((this.total == null)?"<null>":this.total));
        sb.append(',');
        sb.append("totalDiscountAmounts");
        sb.append('=');
        sb.append(((this.totalDiscountAmounts == null)?"<null>":this.totalDiscountAmounts));
        sb.append(',');
        sb.append("totalTaxAmounts");
        sb.append('=');
        sb.append(((this.totalTaxAmounts == null)?"<null>":this.totalTaxAmounts));
        sb.append(',');
        sb.append("transferData");
        sb.append('=');
        sb.append(((this.transferData == null)?"<null>":this.transferData));
        sb.append(',');
        sb.append("webhooksDeliveredAt");
        sb.append('=');
        sb.append(((this.webhooksDeliveredAt == null)?"<null>":this.webhooksDeliveredAt));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
