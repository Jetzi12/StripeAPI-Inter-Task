import com.StripeApiTask.Model.InvoiceModel
import com.StripeApiTask.Services.InvoiceService
import org.apache.log4j.BasicConfigurator
import org.junit.Test
import spock.lang.Specification

class DownloadInvoiceTest extends Specification {

    @Test
    def "Method getInvoice from invoiceService should return invoice from API"() {
        given:
        InvoiceService invoiceService = new InvoiceService()
        BasicConfigurator.configure()
        String invoiceId = "in_1JziAMEnoq8m0FxhCUaidS7T"

        when:
        InvoiceModel invoice = invoiceService.getInvoice(invoiceId);

        then:
        !invoice.equals(null);
    }
}