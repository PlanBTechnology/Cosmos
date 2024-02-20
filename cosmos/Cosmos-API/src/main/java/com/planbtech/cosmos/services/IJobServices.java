package com.planbtech.cosmos.services;

import com.planbtech.cosmos.dto.JobDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IJobServices {
    List<JobDTO> findAll();
}
