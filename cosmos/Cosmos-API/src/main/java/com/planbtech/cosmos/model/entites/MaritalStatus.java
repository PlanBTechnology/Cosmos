package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IMartialStatus;
import jakarta.persistence.*;

@Entity(name = "maritalstatus")
public class MaritalStatus implements IMartialStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maritalstatus_id")
    private Long id;

    @Column(name = "maritalstatus")
    private String maritalStatus;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getMaritalStatus() {
        return this.maritalStatus;
    }

    @Override
    public void setMaritalStatus(String matrialStatus) {
        this.maritalStatus = matrialStatus;
    }
}
