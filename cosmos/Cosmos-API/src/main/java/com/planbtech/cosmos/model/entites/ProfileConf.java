package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IProfileConf;
import jakarta.persistence.*;

@Entity(name = "profileconf")
public class ProfileConf implements IProfileConf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "profileconf_id", nullable = false)
    private Long id;

    @Column(name = "working")
    private boolean working;

    @Column(name = "homeOffice")
    private boolean homeoffice;

    @Column(name = "salaryexpectation")
    private float salaryExpectation;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void setWorking(boolean working) {
        this.working = working;
    }

    @Override
    public boolean getWorking() {
        return this.working;
    }

    @Override
    public void setHomeoffice(boolean homeoffice) {
        this.homeoffice = homeoffice;
    }

    @Override
    public boolean getHomeoffice() {
        return this.homeoffice;
    }

    @Override
    public void setSalaryExpectation(float salaryExpectation) {
        this.salaryExpectation = salaryExpectation;
    }

    @Override
    public float getSalaryExpectation() {
        return this.salaryExpectation;
    }
}
