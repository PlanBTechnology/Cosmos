package com.planbtech.cosmos.controller;

import com.planbtech.cosmos.dto.MaritalStatusDTO;
import com.planbtech.cosmos.services.IMaritalStatusServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/marital-status")
@CrossOrigin(origins = "http://localhost:4200")
public class MaritalStatusController {

    @Autowired
    private IMaritalStatusServices iMaritalStatusServices;

    @GetMapping("/all")
    public ResponseEntity<List<MaritalStatusDTO>> findAll()
    {
        var list = iMaritalStatusServices.findAll();
        return ResponseEntity.ok(list);
    }
}
