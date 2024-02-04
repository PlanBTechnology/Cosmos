package com.planbtech.cosmos.services;

import com.planbtech.cosmos.dto.StateDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IStateServices {

    List<StateDTO> findAll();
}
