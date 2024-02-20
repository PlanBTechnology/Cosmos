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
        return Scholarityrepository.findAll().stream().map(ScholarityDTO::new).toList();
    }
}
