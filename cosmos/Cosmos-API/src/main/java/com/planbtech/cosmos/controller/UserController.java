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

/**
 * Classe controller para realizar o intermedio da aplicacao com o frontend
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {


    /**
     * Utiliza iUserServices para realizar as operacoes necessarias
     */
    @Autowired
    private IUserServices iuserServices;


    /**
     * Metodo para retornar todas os usuarios quando o http for passado
     *
     * @return {@code List<UserDTO>} a ser passado para o frontend
     */
    @GetMapping("/list")
    public ResponseEntity<List<UserDTO>> findAll() {
       var list = iuserServices.findAll();

       return ResponseEntity.ok(list);
    }

    /**
     * Metodo para buscar o usuario pelo id passado
     *
     * @param id do usuario a ser buscado
     * @return {@code UserDTO} as informacoes do usuario buscado
     */
    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        var user = iuserServices.findById(id);

        return ResponseEntity.ok(user);
    }

    /**
     * Metodo para cadastrar um novo usuario
     *
     * @param userToCreate as informacoes do usuario a ser cadastrado
     * @return {@code UserDTO} as informacoes que foram cadastradas
     */
    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody User userToCreate) {
        UserDTO userCreated = new UserDTO(iuserServices.create(userToCreate));
        URI location = ServletUriComponentsBuil. der.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(userCreated.getId())
                .toUri();
        return ResponseEntity.created(location).body(userCreated);
    }
}
