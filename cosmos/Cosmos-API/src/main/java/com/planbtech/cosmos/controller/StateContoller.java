package com.planbtech.cosmos.controller;


import com.planbtech.cosmos.dto.StateDTO;
import com.planbtech.cosmos.services.IStateServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/state")
@CrossOrigin(origins = "http://localhost:4200")
public class StateContoller {

    @Autowired
    private IStateServices istateServices;

    @GetMapping("/all")
    public ResponseEntity<List<StateDTO>> findAll()
    {
        return ResponseEntity.ok(istateServices.findAll());
    }
}
