package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Invoice;

import static org.junit.jupiter.api.Assertions.*;
class InvoiceFactoryTest {

    @Test
    void testCreateInvoiceSuccess(){
        Invoice invoice = InvoiceFactory.buildInvoice(200,"christian");
        System.out.println(invoice);
        assertNotNull(invoice);
    }

    @Test
    void testCreateInvoiceFail(){
        Invoice invoice = InvoiceFactory.buildInvoice(200,"");
        System.out.println(invoice);
        assertNotNull(invoice,"Value cannot be empty");
    }





  
}