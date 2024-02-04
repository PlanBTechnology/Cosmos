package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IGender;
import jakarta.persistence.*;

@Entity(name = "gender")
public class Gender implements IGender {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gender_id")
    private Long id;

    private String gender;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getGender() {
        return this.gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }
}
