package com.planbtech.cosmos.services.impl;

import com.planbtech.cosmos.dto.JobDTO;
import com.planbtech.cosmos.repositories.JobRepository;
import com.planbtech.cosmos.services.IJobServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService implements IJobServices {

    @Autowired
    private JobRepository jobRepository;

    public List<JobDTO> findAll() {
        return jobRepository.findAll().stream().map(JobDTO::new).toList();
    }
}
