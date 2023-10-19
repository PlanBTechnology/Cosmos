package com.planbtech.cosmos.model.Interfaces;

import com.planbtech.cosmos.model.entites.Address;

public interface IUser {
    //Getters and Setters
    public String getFirstName();
    public String getLastName();
    public String getEmail();
    public String getPassword();


    public void setFirstName(String firstName);
    public void setLastName(String lastName);
    public void setEmail(String email);
    public void setPassword(String password);



    //Other methods
    public String toString();
    public boolean equals(Object o);
    public int hashCode();


}
