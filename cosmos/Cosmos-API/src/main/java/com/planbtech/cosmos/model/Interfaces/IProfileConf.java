package com.planbtech.cosmos.model.Interfaces;

public interface IProfileConf {

    //get e set for id, woring and Homeoffice
    public void setId(Long id);
    public Long getId();

    public void setWorking(boolean working);
    public boolean getWorking();

    public void setHomeoffice(boolean homeoffice);
    public boolean getHomeoffice();

    public void setSalaryExpectation(float salaryExpectation);
    public float getSalaryExpectation();

}
