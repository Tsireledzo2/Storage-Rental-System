/**
 * invoiceListFactory.java
 * This is the model or factory class
 * @author christian mukuna mbuyi
 * 07/04/2023
 */
package za.ac.cput.repository;

import za.ac.cput.domain.Invoice;

import java.util.Set;

public interface IInvoiceRepository extends IRepository<Invoice, String> {
    Set<Invoice> getAll();
}
