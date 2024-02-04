package com.planbtech.cosmos.services.impl;

import com.planbtech.cosmos.dto.PersonFullDTO;
import com.planbtech.cosmos.model.entites.Person;
import com.planbtech.cosmos.repositories.PersonRepository;
import com.planbtech.cosmos.services.IPersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServices implements IPersonServices {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public PersonFullDTO findByCPF(String CPF) {
        Person result = personRepository.findByCpf(CPF);
        PersonFullDTO dto = new PersonFullDTO(result);
        return dto;
    }
}
