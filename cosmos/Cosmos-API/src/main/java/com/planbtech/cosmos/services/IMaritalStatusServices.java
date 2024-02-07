package com.planbtech.cosmos.services;

import com.planbtech.cosmos.dto.MaritalStatusDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IMaritalStatusServices {
    List<MaritalStatusDTO> findAll();
}
