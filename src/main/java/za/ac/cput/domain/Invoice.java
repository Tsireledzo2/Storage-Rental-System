/**
 * invoice.java
 * This is the model or worker class
 * @author christian mukuna mbuyi
 * 07/04/2023
 */

package za.ac.cput.domain;

public class Invoice {
    private String invoiceID;
    private float amount;
    private String customerName;

    private  Invoice(){}

    private Invoice(Builder builder){
        this.invoiceID = builder.invoiceID;
        this.amount = builder.amount;
        this.customerName = builder.customerName;
    }

    public String getInvoiceID() {
        return invoiceID;
    }

    public float getAmount() {
        return amount;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceID=" + invoiceID +
                ", amount=" + amount +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    public  static class Builder{
        private String invoiceID;
        private float amount;
        private String customerName;

        public  Builder setInvoiceID(String invoiceID){
            this.invoiceID = invoiceID;
            return this;
        }
        public  Builder setAmount(float amount){
            this.amount = amount;
            return this;
        }
        public  Builder setCustomerName(String customerName){
            this.customerName = customerName;
            return this;
        }

        public Builder copy(Invoice invoice){
            this.invoiceID = invoice.invoiceID;
            this.amount = invoice.amount;
            this.customerName = invoice.customerName;
            return this;
        }
        public Invoice build(){
            return new Invoice(this);
        }

    }
}
