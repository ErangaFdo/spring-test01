package lk.ijse.gdse.springtest01.controller;

import lk.ijse.gdse.springtest01.dto.CustomerDto;
import lk.ijse.gdse.springtest01.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/cust")
@RequiredArgsConstructor
public class CustomerController {
     private final CustomerService customerService;

     @PostMapping("create")
     public void createCustomer(@RequestBody CustomerDto customerDto) {
           customerService.saveCustomer(customerDto);
     }
}
