package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IJobFunction;
import jakarta.persistence.*;

import java.util.List;

@Entity(name = "job")
public class Job implements IJobFunction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "jobId")
    private Long id;

    @Column(name="jobname")
    private String jobName;

    public Job() {}

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getJobName() {
        return this.jobName;
    }

    @Override
    public void setJonName(String jobName) {
        this.jobName = jobName;
    }
}
