package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Driver;

public interface IDriverRepository extends JpaRepository<Driver,String> {
}
