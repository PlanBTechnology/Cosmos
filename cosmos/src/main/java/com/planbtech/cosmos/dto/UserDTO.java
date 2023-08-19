package com.planbtech.cosmos.dto;

import com.planbtech.cosmos.model.entites.Address;
import com.planbtech.cosmos.model.entites.User;
import org.springframework.beans.BeanUtils;

public class UserDTO {


    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Address address;


    public UserDTO() {

    }

    public UserDTO(User entity){
        BeanUtils.copyProperties(entity, this);
    }

    //Getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
