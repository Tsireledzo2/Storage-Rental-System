package za.ac.cput.service;

import za.ac.cput.domain.Invoice;

import java.util.List;

public interface IInvoice extends IService<IInvoice,String>{
    public List<Invoice>getAll();
}
