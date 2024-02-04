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
@RequestMapping
@CrossOrigin(origins = "http://localhost:4200")
public class StateContoller {

    @Autowired
    private IStateServices istateServices;

    @GetMapping()
    public ResponseEntity<List<StateDTO>> findAll()
    {
        var list = istateServices.findAll();
        return ResponseEntity.ok(list);
    }
}
