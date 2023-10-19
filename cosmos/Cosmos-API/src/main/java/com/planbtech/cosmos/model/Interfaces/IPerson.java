package com.planbtech.cosmos.model.Interfaces;

import com.planbtech.cosmos.model.entites.Address;

import java.time.LocalDate;

public interface IPerson {

//name,birthDate,cpf,cellphone,adress,gender,maritalStatus,escolarity,email

    String getName();

    void setName(String name);

    LocalDate getBirthDate();

    void setBirthDate(LocalDate birthDate);

    String getCpf();

    void setCpf(String cpf);

    String getCellphone();

    void setCellphone(String cellphone);

    Address getAdress();

    void setAdress(Address adress);

    String getGender();

    void setGender(String gender);

    String getMaritalStatus();

    void setMaritalStatus(String maritalStatus);

    String getEscolarity();

    void setEscolarity(String escolarity);

    String getEmail();

    void setEmail(String email);

    //Other methods
    String toString();

}
