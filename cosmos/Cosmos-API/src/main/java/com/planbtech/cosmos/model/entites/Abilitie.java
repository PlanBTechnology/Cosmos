package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IAbilitie;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Abilities")
public class Abilitie implements IAbilitie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;

    @NotEmpty
    private String name;
    @NotEmpty
    private String classification;
    @NotNull
    private Double pontuation;

    @Override
    public int getCode() {
        return 0;
    }

    @Override
    public void setCode(int code) {

    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public String getClassification() {
        return null;
    }

    @Override
    public void setClassification(String classification) {

    }

    @Override
    public Double getPontuation() {
        return null;
    }

    @Override
    public void setPontuation(Double pontuation) {

    }
}
