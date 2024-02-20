package com.planbtech.cosmos.model.entites;

import jakarta.persistence.*;

import java.io.Serializable;

@Embeddable
public class JobProfilePK implements Serializable {


    @ManyToOne
    @JoinColumn(name = "jobid")
    private Job jobId;

    @ManyToOne
    @JoinColumn(name = "profileid")
    private Profile profileId;

    public Job getJob() {
        return jobId;
    }

    public void setJob(Job jobId) {
        this.jobId = jobId;
    }

    public Profile getProfile() {
        return profileId;
    }

    public void setProfile(Profile profileId) {
        this.profileId = profileId;
    }

    public JobProfilePK(Job jobId, Profile profileId) {
        this.jobId = jobId;
        this.profileId = profileId;
    }

    public JobProfilePK() {
    }

    }

