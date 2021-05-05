package cz.mendelu.eshop.persistence.dao;

import cz.mendelu.eshop.persistence.domain.Customer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CustomerDAOimpl implements CustomerDAO{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Customer findById(Long id) {
        return em.find(Customer.class,id);
    }

    @Override
    public List<Customer> findAll() {
        return em.createQuery("SELECT c FROM Customer c",Customer.class).getResultList();
    }

    @Override
    public void save(Customer customer) {
        if(customer.getId()!=null){
            em.merge(customer);
        }else{
            em.persist(customer);
        }
    }

    @Override
    public void delete(Customer customer) {
        em.remove(findById(customer.getId()));
    }
}
