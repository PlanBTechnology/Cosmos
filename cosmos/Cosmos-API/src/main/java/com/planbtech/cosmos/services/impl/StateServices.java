package com.planbtech.cosmos.services.impl;

import com.planbtech.cosmos.dto.StateDTO;
import com.planbtech.cosmos.model.entites.State;
import com.planbtech.cosmos.repositories.StateRepository;
import com.planbtech.cosmos.services.IStateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateServices implements IStateServices {

    @Autowired
    private StateRepository stateRepository;

    @Override
    public List<StateDTO> findAll() {
        return stateRepository.findAll().stream().map(StateDTO::new).toList();
    }


}
