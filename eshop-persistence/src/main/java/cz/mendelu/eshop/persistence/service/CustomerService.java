package cz.mendelu.eshop.persistence.service;

import cz.mendelu.eshop.persistence.dto.CreateCustomerDTO;
import cz.mendelu.eshop.persistence.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    List<CustomerDTO> getAllOfCustomers();
    void createNewCustomer(CreateCustomerDTO ccDTO);
}
