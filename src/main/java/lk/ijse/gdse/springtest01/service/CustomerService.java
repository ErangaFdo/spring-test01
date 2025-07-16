package lk.ijse.gdse.springtest01.service;

import lk.ijse.gdse.springtest01.dto.CustomerDto;
import org.springframework.web.bind.annotation.RequestBody;

public interface CustomerService {
    public void saveCustomer(CustomerDto customerDto);
}
