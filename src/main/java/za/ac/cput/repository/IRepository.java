/**
 * invoiceListFactory.java
 * This is the model or factory class
 * @author christian mukuna mbuyi
 * 07/04/2023
 */
package za.ac.cput.repository;

public interface IRepository <objectType, t>{
    //crud
    objectType create(objectType objectType);
    objectType read(t t);
    objectType update(objectType objectType);
    boolean delete(t t);
}
