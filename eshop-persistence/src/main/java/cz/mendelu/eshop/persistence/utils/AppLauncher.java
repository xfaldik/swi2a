package cz.mendelu.eshop.persistence.utils;


import java.io.File;

public class AppLauncher {

    public static void main(String[] args){
        /*ApplicationContext context=new ClassPathXmlApplicationContext("user-bean-config.xml");
        CustomerService cService=context.getBean(CustomerService.class);

        CreateCustomerDTO ccDTO= new CreateCustomerDTO();
        ccDTO.setFirstName("Odlrich");
        ccDTO.setLastName("Faldik");
        ccDTO.setHeight(180);
        cService.createNewCustomer(ccDTO);
        System.out.println(cService.getAllOfCustomers());*/

        //CustomerDAO customerDAO=context.getBean(CustomerDAO.class);
        //AddressDAO addressDAO=context.getBean(AddressDAO.class);
        /*Address ad= new Address();
        ad.setCity("Brno");
        ad.setCountry("Czech Republic");
        ad.setStreet("Zemedelska");
        ad.setPostCode(61300);
        //addressDAO.save(ad);
        Customer c1=new Customer("Paul","Newman",180,ad);
        Customer c2=new Customer("John","Doe",190,ad);
        ad.getCustomers().add(c1);
        ad.getCustomers().add(c2);
        customerDAO.save(c1);
        customerDAO.save(c2);
        c1.setFirstName("XXXXX");*/

        //System.out.println(customerDAO.findAll());

        /*DatabaseConnector dbc=DatabaseConnector.getInstance();
        System.out.println("First instance: "+dbc);
        DatabaseConnector dbc2=DatabaseConnector.getInstance();
        System.out.println("Second instance: "+dbc2);

        if(dbc==dbc2){
            System.out.println("THEY EQUALS");
        }else{
            System.out.println("THEY NOT EQUALS");
        }*/


    }
}
