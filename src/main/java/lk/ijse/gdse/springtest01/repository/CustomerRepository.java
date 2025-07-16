package lk.ijse.gdse.springtest01.repository;

import lk.ijse.gdse.springtest01.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
