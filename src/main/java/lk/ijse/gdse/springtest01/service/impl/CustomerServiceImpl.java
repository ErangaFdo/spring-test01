package lk.ijse.gdse.springtest01.service.impl;

import lk.ijse.gdse.springtest01.dto.CustomerDto;
import lk.ijse.gdse.springtest01.entity.Customer;
import lk.ijse.gdse.springtest01.repository.CustomerRepository;
import lk.ijse.gdse.springtest01.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;
    private final ModelMapper modelMapper;

    @Override
    public void saveCustomer(CustomerDto customerDto) {
        customerRepository.save(modelMapper.map(customerDto, Customer.class));
    }
}
