package com.planbtech.cosmos.dto;

import com.planbtech.cosmos.model.entites.Gender;

public class GenderDTO {

    private Long id;
    private String gender;

    //make id and gender, make a getters and setters and a constructor with BeanUtils
    public GenderDTO(Gender entity) {
        this.id = entity.getId();
        this.gender = entity.getGender();
    }

    public Long getId() {return this.id;}

    public String getGender() {return this.gender;}

    public void setId(Long id) {this.id = id;}

    public void setGender(String gender) {this.gender = gender;}
}