package cz.mendelu.eshop.persistence.dao;

import cz.mendelu.eshop.persistence.domain.Address;
import cz.mendelu.eshop.persistence.domain.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AddressDAOimpl implements AddressDAO{

    @PersistenceContext
    private EntityManager em;

    @Override
    public Address findById(Long id) {
        return em.find(Address.class,id);
    }

    @Override
    public List<Address> findAll() {
        return em.createQuery("SELECT a FROM Address a",Address.class).getResultList();
    }

    @Override
    public void save(Address address) {
        if(address.getId()!=null){
            em.merge(address);
        }else{
            em.persist(address);
        }
    }

    @Override
    public void delete(Address address) {
        em.remove(findById(address.getId()));
    }
}
