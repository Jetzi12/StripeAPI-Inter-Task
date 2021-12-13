import com.StripeApiTask.Services.InvoiceService
import org.apache.log4j.BasicConfigurator
import org.junit.Test
import spock.lang.Specification

class DraftInvoice extends Specification {
    @Test
    def "Method createNewInvoice should create a draft invoice in system and a new response from api should be in var responseFromApi"() {
        given:
        InvoiceService invoiceService = new InvoiceService();
        String customerId = "customer=cus_Kf2EOtdCptU2vq"
        String priceId = "price=price_1JznGvEnoq8m0FxhO7rTBwl6"

        BasicConfigurator.configure();
        invoiceService.addInvoiceItem(customerId, priceId);
        String responseFromAddingItem = invoiceService.responseFromApi;
        when:
        invoiceService.createNewInvoice(customerId);
        then:
        !invoiceService.responseFromApi.equals(responseFromAddingItem);
    }

}

