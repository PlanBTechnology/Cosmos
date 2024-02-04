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
        return null;
    }

    @Override
    public void setId(Long id) {

    }

    @Override
    public String getMatrialStatus() {
        return null;
    }

    @Override
    public void setMatrialStatus(String matrialStatus) {

    }
}
