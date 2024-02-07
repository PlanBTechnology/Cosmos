package com.planbtech.cosmos.services.impl;

import com.planbtech.cosmos.dto.MaritalStatusDTO;
import com.planbtech.cosmos.model.entites.MaritalStatus;
import com.planbtech.cosmos.repositories.MaritalStatusRepository;
import com.planbtech.cosmos.services.IMaritalStatusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaritalStatusServices implements IMaritalStatusServices {

    @Autowired
    public MaritalStatusRepository maritalStatusRepository;

    @Override
    public List<MaritalStatusDTO> findAll() {
        List<MaritalStatus> result = maritalStatusRepository.findAll();
        List<MaritalStatusDTO> dto = result.stream().map(MaritalStatusDTO::new).toList();
        return dto;
    }
}
