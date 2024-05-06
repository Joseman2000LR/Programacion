package es.ies.puerto.mapper.clasic;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;

public class MapperCustomer {

    public static Customer  CustomerDtoToCoustomerEntity(CustomerDTO customerDTO){
        Customer customers =null;
        if (customerDTO== null) {
            return null;
        }
        customers= new Customer();
        customers.setId(customerDTO.getId());
        //TODO: exprecion regular un espacio
        customers.setFirstname(customerDTO.getFullName());
        customers.setLastname(customerDTO.getFullName());
        return customers;
    }

    public static CustomerDTO CustomerEntityToCoustomerDto(Customer customer ,Address address){
        CustomerDTO customerDTO= null;

        if (customer==null) {
            return customerDTO;
        }
        customerDTO= new CustomerDTO();
        customerDTO.setId(customer.getId());
        customerDTO.setFullName(customer.getFirstname()+" "+customer.getLastname());
        if (address!=null) {
            customerDTO.setaddress(address.getAddress());
            customerDTO.setCountry(address.getCountry());
            customerDTO.setZipCode(address.getZipCode());
        }
     
        return customerDTO;

    }
}
