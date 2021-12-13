package com.StripeApiTask.Services;

import com.StripeApiTask.Model.InvoiceModel;
import org.springframework.http.HttpMethod;
import com.StripeApiTask.Configuration.ReadPropertyFile;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class InvoiceService {
    private String responseFromApi;
    private final ReadPropertyFile reader = new ReadPropertyFile();
    private final String createNewInvoicePropVal = "createInvoiceApiURL";
    private final String getInvoicePropVal = "getInvoiceApiURL";
    private final String addInvoiceItemPropVal = "addItemToInvoiceApiURL";
    private final String slash = "/";

    public InvoiceService() {
        this.responseFromApi = "";
    }

    public void createNewInvoice(String customerId) throws IOException {
        URL url = new URL(reader.getProperties(createNewInvoicePropVal.toString()).toString());
        HttpURLConnection connection = new ConnectionInit().initConnection(HttpMethod.POST.toString(),url);
        this.responseFromApi = new IOInit().initOutputWriterGetResponse(connection,customerId);
    }

    public InvoiceModel getInvoice(String invoiceId) throws IOException {
        URL url = new URL((reader.getProperties(getInvoicePropVal.toString()).toString() + slash + invoiceId));
        HttpURLConnection connection = new ConnectionInit().initConnection(HttpMethod.GET.toString(),url);
        return new IOInit().initInputReaderGetResponse(connection);
    }

    public void addInvoiceItem(String customerId, String priceId) throws IOException {
        String customer = customerId + "&" + priceId;
        URL url = new URL(reader.getProperties(addInvoiceItemPropVal.toString()).toString());
        HttpURLConnection connection = new ConnectionInit().initConnection(HttpMethod.POST.toString(),url);
        this.responseFromApi = new IOInit().initOutputWriterGetResponse(connection,customer);
    }

    public String getResponseFromApi() {
        return responseFromApi;
    }

}

