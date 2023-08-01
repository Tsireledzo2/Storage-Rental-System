package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
    private InvoiceService invoiceService;

    @Autowired
    public InvoiceService(InvoiceService invoiceService){
        this.invoiceService = invoiceService;
    }
}
