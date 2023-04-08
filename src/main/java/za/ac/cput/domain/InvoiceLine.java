/**
 * ivoiceList.java
 * This is the model or worker class
 * @author christian mukuna mbuyi
 * 07/04/2023
 */
package za.ac.cput.domain;

import java.util.List;

public class InvoiceLine {
    private String invoiceListID;
    private List invoiceline;

    private InvoiceLine(){}

    private InvoiceLine(Builder builder){
        this.invoiceListID = builder.invoiceListID;
        this.invoiceline = builder.invoiceline;
    }


    public String getInvoiceListID() {
        return invoiceListID;
    }


    public List getInvoiceline() {
        return invoiceline;
    }

    @Override
    public String toString() {
        return "InvoiceList{" +
                "invoiceListID=" + invoiceListID +
                ", invoiceline=" + invoiceline +
                '}';
    }

    public static class Builder{

        private String invoiceListID;
        private List invoiceline;

        public  Builder setInvoiceListID(String invoiceListID){
            this.invoiceListID = invoiceListID;
            return this;
        }


        public  Builder setInvoiceline(List invoiceline){
            this.invoiceline = invoiceline;
            return this;
        }

        public Builder copy(InvoiceLine invoiceList){
            this.invoiceListID = invoiceList.invoiceListID;
            this.invoiceline = invoiceList.invoiceline;
            return this;
        }
        public InvoiceLine build(){
            return new InvoiceLine(this);
        }
    }
}
