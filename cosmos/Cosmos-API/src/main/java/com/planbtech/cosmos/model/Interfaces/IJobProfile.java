package com.planbtech.cosmos.model.Interfaces;

import com.planbtech.cosmos.model.entites.Job;
import com.planbtech.cosmos.model.entites.JobProfilePK;
import com.planbtech.cosmos.model.entites.Profile;

import java.util.List;

public interface IJobProfile {

    public void setId(JobProfilePK jobProfile);
    public JobProfilePK getId();

    public void setExperience(int experience);
    public int getExperience();
}
