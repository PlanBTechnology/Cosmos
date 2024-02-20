package com.planbtech.cosmos.model.Interfaces;

import jakarta.persistence.Entity;

public interface IJobFunction {

    public Long getId();

    public void setId(Long id);

    public String getJobName();

    public void setJonName(String JobName);
}

