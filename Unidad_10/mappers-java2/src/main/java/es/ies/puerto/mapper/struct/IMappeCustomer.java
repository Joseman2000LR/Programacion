package es.ies.puerto.mapper.struct;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;
import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(uses = IMapperAddress.class)
public interface IMappeCustomer {

    IMappeCustomer INSTANCE = Mappers.getMapper( IMappeCustomer.class );

    Customer customerDtoToCustomerEntity(CustomerDTO customerDTO);
    CustomerDTO customerToCustomerDTO(Customer customer);

    @Mapping(target="adress", source="address")
    @Mapping(target="id",source="addrres.id")
    @Mapping(target="fullName", source="coustomer",qualifiedByName="transfomarNombre")

    CustomerDTO customerToCustomerDTO(Address  address,@Context Customer customer );

    /**
     *     @Mapping(target = "b", source = "b", qualifiedByName = "mapB")
     *     ADto toADto(A a, @Context BMapper bMapper);
     *
     *     @Mapping(target = "b", source = "b", qualifiedByName = "mapBDto")
     *     A fromADto(ADto aDto, @Context BMapper bMapper);
     */

}
