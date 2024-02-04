package com.planbtech.cosmos.dto;

import com.planbtech.cosmos.model.entites.Person;
import com.planbtech.cosmos.model.entites.State;
import org.springframework.beans.BeanUtils;

public class StateDTO {
    private Long id;
    private String stateName;

    public StateDTO(){

    }

    public StateDTO(State entity){
        BeanUtils.copyProperties(entity, this);
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStateName() {
        return this.stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }


}
