package lk.ijse.gdse.springtest01.controller;

import lk.ijse.gdse.springtest01.dto.CustomerDto;
import lk.ijse.gdse.springtest01.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/cust")
@RequiredArgsConstructor
public class CustomerController {
     private final CustomerService customerService;

     @PostMapping("create")
     public void createCustomer(@RequestBody CustomerDto customerDto) {
           customerService.saveCustomer(customerDto);
     }

     @PutMapping("put")
     public void updateCustomer(@RequestBody CustomerDto customerDto) {
          customerService.updateCustomer(customerDto);
     }

     @GetMapping("get")
     public List<CustomerDto> getAllCustomers() {
        return customerService.getAllCustomer();
     }

     @PatchMapping("phone/{id}")
     public void changePhoneNumber(@PathVariable ("id") String id ) {
         customerService.changePhoneNumber(id);
     }
}
