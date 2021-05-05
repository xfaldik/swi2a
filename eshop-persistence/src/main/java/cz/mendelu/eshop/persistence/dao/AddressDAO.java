package cz.mendelu.eshop.persistence.dao;

import cz.mendelu.eshop.persistence.domain.Address;
import cz.mendelu.eshop.persistence.domain.Customer;

import java.util.List;

public interface AddressDAO {
    Address findById(Long id);
    List<Address> findAll();
    void save(Address address);
    void delete(Address address);
}
