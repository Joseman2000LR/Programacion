package es.ies.puerto.mapper.clasic;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;

public class CoustomerBusiness {

    public CustomerDTO obtenerCustomer(CustomerDTO customerDTO){
        if (customerDTO==null) {
            return null;
        }
        Customer  customers =MapperCustomer.CustomerDtoToCoustomerEntity(customerDTO);
        Address address= MapperAddress.CustomerDtoToAddres(customerDTO);

        /**
         * llamar a BBDD
         */
        CustomerDTO respuesta = MapperCustomer.CustomerEntityToCoustomerDto(customers, address);
        return null;
    }

    public CustomerDTO obtenerCustomer(Long id){
        if (id ==null) {
            return null;
        }
        CustomerDTO customerDTO= new CustomerDTO(id);
        return obtenerCustomer(customerDTO);
    }
}
