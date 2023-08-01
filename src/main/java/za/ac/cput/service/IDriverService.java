package za.ac.cput.service;

import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Driver;

import java.util.List;

@Repository
public interface IDriverService extends IService<Driver,String>{
    public List<Driver> getAll();
}
