package lk.ijse.gdse.springtest01.service.impl;

import lk.ijse.gdse.springtest01.dto.CustomerDto;
import lk.ijse.gdse.springtest01.entity.Customer;
import lk.ijse.gdse.springtest01.repository.CustomerRepository;
import lk.ijse.gdse.springtest01.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    @Override
    public void saveCustomer(CustomerDto customerDto) {
        customerRepository.save(modelMapper.map(customerDto, Customer.class));
    }

    @Override
    public void updateCustomer(CustomerDto customerDto) {
        customerRepository.save(modelMapper.map(customerDto, Customer.class));
    }

    @Override
    public List<CustomerDto> getAllCustomer() {
       List<Customer> customers = customerRepository.findAll();
       List<CustomerDto> customerDtos = new ArrayList<>();
       for (Customer customer : customers) {
           customerDtos.add(modelMapper.map(customer, CustomerDto.class));
       }
       return customerDtos;
    }

    @Override
    public void changePhoneNumber(String id) {
        customerRepository.updatePhoneNumber(id);
    }
}
