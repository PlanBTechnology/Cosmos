package com.planbtech.cosmos.model.Interfaces;

public interface IAddress {

    //Getters and Setters
    public String getStreet();
    public String getCity();
    public String getState();
    public String getCEP();
    public Integer getNumber();
    public void setStreet(String street);
    public void setCity(String city);
    public void setState(String state);
    public void setCEP(String cep);
    public void setNumber(Integer number);


}
