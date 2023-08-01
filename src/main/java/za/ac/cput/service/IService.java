package za.ac.cput.service;

public interface IService <T,t>{

    T create (T T);
    T read(t t);
    T update(T T);
    boolean delete(t t);
}
