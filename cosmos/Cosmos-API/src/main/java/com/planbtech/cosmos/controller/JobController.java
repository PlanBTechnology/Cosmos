package com.planbtech.cosmos.controller;

import com.planbtech.cosmos.dto.JobDTO;
import com.planbtech.cosmos.services.IJobServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/job")
@CrossOrigin(origins = "http://localhost:4200")
public class JobController {

    @Autowired
    private IJobServices jobService;

    @GetMapping("/all")
    public ResponseEntity<List<JobDTO>> findAll()
    {
        return ResponseEntity.ok(jobService.findAll());
    }

}
