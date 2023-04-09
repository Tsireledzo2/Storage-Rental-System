package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.InvoiceLine;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceLineFactoryTest {

    @Test
    void testCreateIncoiceLineSucces(){
        List<String> list = new ArrayList<>();
        list.add("NUGGET");
        list.add("IPHONE");
        InvoiceLine invoiceLine = InvoiceLineFactory.buildInvoiceLine(list);
        System.out.println(invoiceLine);
        assertNotNull(invoiceLine);

    }

    @Test
    void testCreateIncoiceLineFail(){
        List<String> list = new ArrayList<>();
        InvoiceLine invoiceLine = InvoiceLineFactory.buildInvoiceLine(list);
        System.out.println(invoiceLine);
        assertNotNull(invoiceLine,"Value connet be empty");


    }

}