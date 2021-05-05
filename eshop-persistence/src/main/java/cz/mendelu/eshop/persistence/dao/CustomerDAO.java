package cz.mendelu.eshop.persistence.dao;

import cz.mendelu.eshop.persistence.domain.Customer;

import java.util.List;

public interface CustomerDAO {
    Customer findById(Long id);
    List<Customer> findAll();
    void save(Customer customer);
    void delete(Customer customer);
}
