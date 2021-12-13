import com.StripeApiTask.Services.InvoiceService
import org.apache.log4j.BasicConfigurator
import org.junit.Test
import spock.lang.Specification

class AddItemToInvoiceTest extends Specification {
    @Test
    def "Method addInvoiceItem from invoiceService should add an item to an invoice of specific customer and as response, change responseFromApi variable"() {
        given:
        InvoiceService invoiceService = new InvoiceService();
        BasicConfigurator.configure();
        String customerId = "customer=cus_Kf2EOtdCptU2vq"
        String priceId = "price=price_1JznGvEnoq8m0FxhO7rTBwl6"

        when:
        invoiceService.addInvoiceItem(customerId , priceId )

        then:
        !invoiceService.responseFromApi.equals("");
    }

}

