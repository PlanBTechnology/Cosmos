package com.planbtech.cosmos.controller;

import com.planbtech.cosmos.dto.UserDTO;
import com.planbtech.cosmos.services.impl.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {


    @Autowired
    private UserServices userServices;

    @GetMapping
    public List<UserDTO> findAll() {
        List<UserDTO> result = userServices.findAll();
        return result;
    }
}
