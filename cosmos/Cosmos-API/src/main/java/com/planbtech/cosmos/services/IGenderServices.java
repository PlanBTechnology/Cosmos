package com.planbtech.cosmos.services;

import com.planbtech.cosmos.dto.GenderDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IGenderServices {
    List<GenderDTO> findAll();
}
