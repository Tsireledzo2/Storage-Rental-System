/**
 * invoiceListFactory.java
 * This is the model or factory class
 * @author christian mukuna mbuyi
 * 07/04/2023
 */
package za.ac.cput.repository;

import za.ac.cput.domain.InvoiceLine;

import java.util.Set;

public interface IInvoiceLineRepository extends IRepository<InvoiceLine, String>{
    Set<InvoiceLine> getAll();
}
