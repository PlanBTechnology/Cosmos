package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IPerson;
import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "Persons")
public class Person implements IPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private LocalDate birthDate;


    private String cpf;

    private String cellphone;

    private Address adress;

    private String gender;

    private String maritalStatus;

    private String escolarity;

    private String email;


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public LocalDate getBirthDate() {
        return this.birthDate;
    }

    @Override
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getCellphone() {
        return this.cellphone;
    }

    @Override
    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    @Override
    public Address getAdress() {
        return this.adress;
    }

    @Override
    public void setAdress(Address adress) {
        this.adress = adress;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getMaritalStatus() {
       return this.maritalStatus;
    }

    @Override
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public String getEscolarity() {
        return this.escolarity;
    }

    @Override
    public void setEscolarity(String escolarity) {
        this.escolarity = escolarity;
    }

    @Override
    public String getEmail() {
        return this.email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", cpf='" + cpf + '\'' +
                ", cellphone='" + cellphone + '\'' +
                ", adress=" + adress +
                ", gender='" + gender + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", escolarity='" + escolarity + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
