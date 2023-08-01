package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceLineService {
    private InvoiceLineService invoiceLineService;

    @Autowired
    public InvoiceLineService(InvoiceLineService invoiceLineService){
        this.invoiceLineService = invoiceLineService;
    }

}
