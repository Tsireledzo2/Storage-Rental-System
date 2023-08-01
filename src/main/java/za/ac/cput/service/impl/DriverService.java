package za.ac.cput.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Driver;
import za.ac.cput.repository.IDriverRepository;
import za.ac.cput.service.IDriverService;

import java.util.List;

@Service
public class DriverService implements IDriverService {

    @Autowired
    IDriverRepository driverRepository;

    public DriverService(IDriverRepository driverRepository){
        this.driverRepository = driverRepository;
    }
    @Override
    public List<Driver> getAll() {
        return this.driverRepository.findAll();
    }

    @Override
    public Driver create(Driver driver) {
        return this.driverRepository.save(driver);
    }

    @Override
    public Driver read(String licenceNumber) {
        return this.driverRepository.findById(licenceNumber).orElse(null);
    }

    @Override
    public Driver update(Driver T) {
        return null;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }
}
