package com.planbtech.cosmos.dto;

import com.planbtech.cosmos.model.entites.Address;
import com.planbtech.cosmos.model.entites.Person;
import org.springframework.beans.BeanUtils;

import java.time.LocalDate;

public class PersonFullDTO {
    private long id;
    private String name;
    private LocalDate birthDate;
    private String CPF;
    private String RG;
    private String cellphone;
    private Address address;
    private String gender;
    private String matrialStatus;
    private String escolarity;

    public PersonFullDTO() {

    }

    public PersonFullDTO(Person entity){
        BeanUtils.copyProperties(entity, this);
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMatrialStatus() {
        return matrialStatus;
    }

    public void setMatrialStatus(String matrialStatus) {
        this.matrialStatus = matrialStatus;
    }

    public String getEscolarity() {
        return escolarity;
    }

    public void setEscolarity(String escolarity) {
        this.escolarity = escolarity;
    }
}
