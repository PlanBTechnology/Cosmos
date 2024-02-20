package com.planbtech.cosmos.controller;

import com.planbtech.cosmos.dto.GenderDTO;
import com.planbtech.cosmos.services.IGenderServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/gender")
@CrossOrigin(origins = "http://localhost:4200")
public class GenderController {

    @Autowired
    private IGenderServices igenderServices;

    @GetMapping("/all")
    public ResponseEntity<List<GenderDTO>> findAll()
    {
        return ResponseEntity.ok(igenderServices.findAll());
    }
}
