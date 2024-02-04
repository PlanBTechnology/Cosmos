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
        List<State> result = stateRepository.findAll();
        List<StateDTO> dto = result.stream().map(StateDTO::new).toList();
        return dto;
    }

    /*@Override
    public List<StateDTO> findAll() {
        List<State> result = (List<State>) stateRepository.findAll();
        List<StateDTO> dto = result.stream().map((State t) -> new StateDTO(t)).toList();
        return dto;
    }*/


}
