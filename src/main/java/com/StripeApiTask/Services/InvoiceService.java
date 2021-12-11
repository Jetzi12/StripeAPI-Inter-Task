package com.StripeApiTask.Services;

import com.StripeApiTask.Model.InvoiceModel;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class InvoiceService {
    private String responseFromApi;

    public InvoiceService() {
        this.responseFromApi = "";
    }

    public void createNewInvoice(String customerId) throws IOException {
        URL url = new URL("https://api.stripe.com/v1/invoices");
        HttpURLConnection connection = new ConnectionInit().initConnection("POST",url);
        this.responseFromApi = new IOInit().initOutputWriterGetResponse(connection,customerId);
    }

    public InvoiceModel getInvoice(String invoiceId) throws IOException {
        URL url = new URL(("https://api.stripe.com/v1/invoices" + "/" + invoiceId));
        HttpURLConnection connection = new ConnectionInit().initConnection("GET",url);
        return new IOInit().initInputReaderGetResponse(connection);
    }

    public void addInvoiceItem(String customerId, String priceId) throws IOException {
        String customer = customerId + "&" + priceId;
        URL url = new URL("https://api.stripe.com/v1/invoiceitems");
        HttpURLConnection connection = new ConnectionInit().initConnection("POST",url);
        this.responseFromApi = new IOInit().initOutputWriterGetResponse(connection,customer);
    }

    public String getResponseFromApi() {
        return responseFromApi;
    }

}

