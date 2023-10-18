package com.planbtech.cosmos.services.impl;

import com.planbtech.cosmos.dto.UserDTO;
import com.planbtech.cosmos.model.entites.User;
import com.planbtech.cosmos.repositories.UserRepository;
import com.planbtech.cosmos.services.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServices implements IUserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO findById(Long id) {
        User result = userRepository.findById(id).orElseThrow(NoSuchElementException::new);
        UserDTO dto = new UserDTO(result);
        return  dto;
    }

    @Override
    public List<UserDTO> findAll() {
        List<User> result = userRepository.findAll();
        List<UserDTO> dto = result.stream().map(UserDTO::new).toList();
        return dto;
    }

    @Override
    public User create(User userToCreate) {

        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("User already exists");
        }

        return userRepository.save(userToCreate);
    }
}
