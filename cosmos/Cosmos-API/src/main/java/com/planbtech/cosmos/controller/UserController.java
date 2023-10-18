package com.planbtech.cosmos.controller;

import com.planbtech.cosmos.dto.UserDTO;
import com.planbtech.cosmos.model.entites.User;
import com.planbtech.cosmos.services.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {


    @Autowired
    private IUserServices iuserServices;


    @GetMapping("/list")
    public ResponseEntity<List<UserDTO>> findAll() {
       var list = iuserServices.findAll();

       return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        var user = iuserServices.findById(id);

        return ResponseEntity.ok(user);
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody User userToCreate) {
        UserDTO userCreated = new UserDTO(iuserServices.create(userToCreate));
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
}
