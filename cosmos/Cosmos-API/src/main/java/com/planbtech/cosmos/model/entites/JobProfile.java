package com.planbtech.cosmos.model.entites;

import com.planbtech.cosmos.model.Interfaces.IJobProfile;
import jakarta.persistence.*;

@Entity(name = "Profilejobs")
public class JobProfile implements IJobProfile {

    @EmbeddedId
    private JobProfilePK id;

    @Column(name = "jobexperience")
    private int experience;


    public JobProfile (){

    }

    @Override
    public JobProfilePK getId(){
        return this.id;
    }

    @Override
    public void setId(JobProfilePK id){
        this.id = id;
    }

    @Override
    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public int getExperience() {
        return this.experience;
    }

}
