package lk.ijse.gdse.springtest01.service;

import lk.ijse.gdse.springtest01.dto.CustomerDto;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CustomerService {
    public void saveCustomer(CustomerDto customerDto);
           void updateCustomer(CustomerDto customerDto);
           List<CustomerDto> getAllCustomer();
           void changePhoneNumber(String id);
           List<CustomerDto> searchAddress(String keyword);
}
