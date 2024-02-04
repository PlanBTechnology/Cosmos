package com.planbtech.cosmos.model.Interfaces;

import com.planbtech.cosmos.model.entites.State;

public interface IState {
    public Long getId();

    public String getStateName();

    public void setId(Long id);

    public void setStateName(String stateName);

}
