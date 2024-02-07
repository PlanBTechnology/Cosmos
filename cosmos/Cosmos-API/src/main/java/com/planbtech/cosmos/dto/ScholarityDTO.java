package com.planbtech.cosmos.dto;

import com.planbtech.cosmos.model.entites.Scholarity;

public class ScholarityDTO {

    private Long id;

    private String scholarity;

    public ScholarityDTO(Scholarity entity) {
        this.id = entity.getId();
        this.scholarity = entity.getScholarity();
    }

    public Long getId() {return this.id;}

    public void setId(Long id) {this.id = id;}

    public String getScholarity() {return this.scholarity;}

    public void setScholarity(String scholarity) {this.scholarity = scholarity;}
}
