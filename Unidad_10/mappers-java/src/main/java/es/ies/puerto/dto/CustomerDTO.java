package es.ies.puerto.dto;

import java.io.Serializable;
import java.util.Objects;

public class CustomerDTO implements Serializable{

    private Long id;
	private String FullName;
	private String country;
	private String address;
	private String zipCode;


    public CustomerDTO(){
        
    }

    public CustomerDTO(Long id) {
        this.id = id;
    }


    public CustomerDTO(Long id, String FullName, String country,
     String address, String zipCode) {
        this.id = id;
        this.FullName = FullName;
        this.country = country;
        this.address = address;
        this.zipCode = zipCode;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return this.FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getaddress() {
        return this.address;
    }

    public void setaddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CustomerDTO)) {
            return false;
        }
        CustomerDTO customerDTO = (CustomerDTO) o;
        return Objects.equals(id, customerDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", FullName='" + getFullName() + "'" +
            ", country='" + getCountry() + "'" +
            ", address='" + getaddress() + "'" +
            ", zipCode='" + getZipCode() + "'" +
            "}";
    }

    

}
