package com.planbtech.cosmos.services;

import com.planbtech.cosmos.dto.PersonFullDTO;
import org.springframework.stereotype.Service;

@Service
public interface IPersonServices {

    PersonFullDTO findByCPF(String CPF);
}
