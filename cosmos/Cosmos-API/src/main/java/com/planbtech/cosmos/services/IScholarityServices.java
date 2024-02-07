package com.planbtech.cosmos.services;

import com.planbtech.cosmos.dto.ScholarityDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IScholarityServices {
    List<ScholarityDTO> findAll();
}
