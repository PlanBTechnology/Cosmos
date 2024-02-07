package com.planbtech.cosmos.services.impl;

import com.planbtech.cosmos.dto.ScholarityDTO;
import com.planbtech.cosmos.model.entites.Scholarity;
import com.planbtech.cosmos.repositories.ScholarityRepository;
import com.planbtech.cosmos.services.IScholarityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScholarityServices implements IScholarityServices {

    @Autowired

    private ScholarityRepository Scholarityrepository;

    @Override
    public List<ScholarityDTO> findAll() {
        List <Scholarity> result = Scholarityrepository.findAll();
        List<ScholarityDTO> dto = result.stream().map(ScholarityDTO::new).toList();
        return dto;
    }
}
