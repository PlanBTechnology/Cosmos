package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IScholarity;
import jakarta.persistence.*;

@Entity(name = "scholarity")
public class Scholarity implements IScholarity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "scholarity_id")
    private Long id;

    private String scholarity;

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getScholarity() {
        return this.scholarity;
    }

    @Override
    public void setScholarity(String scholarity) {
        this.scholarity = scholarity;
    }
}
