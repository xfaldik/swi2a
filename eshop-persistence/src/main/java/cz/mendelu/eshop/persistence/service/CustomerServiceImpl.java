package cz.mendelu.eshop.persistence.service;

import cz.mendelu.eshop.persistence.dao.AddressDAO;
import cz.mendelu.eshop.persistence.dao.CustomerDAO;
import cz.mendelu.eshop.persistence.domain.Customer;
import cz.mendelu.eshop.persistence.dto.CreateCustomerDTO;
import cz.mendelu.eshop.persistence.dto.CustomerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerDAO cDAO;
    @Autowired
    private AddressDAO aDAO;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<CustomerDTO> getAllOfCustomers() {
        List<CustomerDTO> cDTOs=new ArrayList<>();
        List<Customer> customers=this.cDAO.findAll();
        for(Customer c:customers){
            /*CustomerDTO cDTO=new CustomerDTO();
            cDTO.setId(c.getId());
            cDTO.setFirstName(c.getFirstName());
            cDTO.setLastName(c.getLastName());
            cDTO.setHeight(c.getHeight());
            if(c.getAddress()!=null)
                cDTO.setAddress(c.getAddress().getStreet()+" "+c.getAddress().getCity()+" "+c.getAddress().getCountry());*/
            cDTOs.add(modelMapper.map(c,CustomerDTO.class));
        }
        return cDTOs;
    }

    @Override
    public void createNewCustomer(CreateCustomerDTO ccDTO) {
        Customer c1=new Customer(ccDTO.getFirstName(),ccDTO.getLastName(),ccDTO.getHeight(),null);
        cDAO.save(c1);
        if(ccDTO.getAddress()!=null){


        }
    }
}
