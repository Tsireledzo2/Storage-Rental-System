package za.ac.cput.repository.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Invoice;
import za.ac.cput.factory.InvoiceFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class InvoiceRepositpryImplTest {

    private static InvoiceRepositpryImpl InvoiceRepository = InvoiceRepositpryImpl.getRepository();
    private static Invoice invoice = InvoiceFactory.buildInvoice(2500,"mbuyi");


    @Test
    void a_create() {
        Invoice createInvoice = InvoiceRepository.create(invoice);
        assertNotNull(invoice.getAmount(), invoice.getCustomerName());
        System.out.println("Create: "+ createInvoice);

    }

    @Test
    void b_read() {
        Invoice readInvoice = InvoiceRepository.read(invoice.getInvoiceID());
        assertNotNull(readInvoice);
        System.out.println("Read: "+ readInvoice);
    }

    @Test
    void c_update() {
        Invoice updateInvoice = new Invoice.Builder()
                .copy(invoice)
                .setAmount(600)
                .setCustomerName("chris")
                .build();
        assertNotNull(InvoiceRepository.update(invoice));
        System.out.println("Update: "+ updateInvoice);
    }

    @Test
    void d_delete() {
        boolean success = InvoiceRepository.delete(invoice.getInvoiceID());
        assertTrue(success);
        System.out.println("Delete: "+ success);
    }

    @Test
    void e_getAll() {
        System.out.println("Get all: "+ InvoiceRepository.getAll());
    }
}