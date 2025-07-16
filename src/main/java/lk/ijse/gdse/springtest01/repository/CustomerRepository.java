package lk.ijse.gdse.springtest01.repository;

import lk.ijse.gdse.springtest01.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    @Query(value = "UPDATE customer  SET cust_phone='1990' WHERE id=? ",nativeQuery = true)
    @Modifying
    @Transactional
    void updatePhoneNumber(String id);

    List<Customer> findCustomerBycustAddressContainingIgnoreCase(String keyword);
}
