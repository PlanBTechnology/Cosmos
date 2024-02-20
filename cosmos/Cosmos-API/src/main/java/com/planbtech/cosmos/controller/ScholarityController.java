package com.planbtech.cosmos.controller;

import com.planbtech.cosmos.dto.ScholarityDTO;
import com.planbtech.cosmos.services.IScholarityServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/scholarity")
@CrossOrigin(origins = "http://localhost:4200")
public class ScholarityController {

    @Autowired
    public IScholarityServices ischolarityServices;

    @GetMapping("/all")
    public ResponseEntity<List<ScholarityDTO>> findAll()
    {
        return ResponseEntity.ok(ischolarityServices.findAll());
    }

}
