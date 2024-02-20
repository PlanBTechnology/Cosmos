package com.planbtech.cosmos.dto;

import com.planbtech.cosmos.model.entites.Job;

public class JobDTO {

    private Long id;

    private String jobName;

    public JobDTO() {

    }

    public JobDTO(Job entity) {
        this.id = entity.getId();
        this.jobName = entity.getJobName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
}
