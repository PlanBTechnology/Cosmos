package com.planbtech.cosmos.services.impl;

import com.planbtech.cosmos.dto.GenderDTO;
import com.planbtech.cosmos.model.entites.Gender;
import com.planbtech.cosmos.repositories.GenderRepository;
import com.planbtech.cosmos.services.IGenderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenderServices implements IGenderServices {

    @Autowired
    private GenderRepository genderRepository;

    @Override
    public List<GenderDTO> findAll() {
        List<Gender> genderDTOList = genderRepository.findAll();
        List<GenderDTO> dto = genderDTOList.stream().map(GenderDTO::new).toList();
        return dto;
    }
}
