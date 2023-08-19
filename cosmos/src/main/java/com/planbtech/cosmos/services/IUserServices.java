package com.planbtech.cosmos.services;

import com.planbtech.cosmos.dto.UserDTO;
import com.planbtech.cosmos.model.entites.User;
import com.planbtech.cosmos.repositories.UserRepository;

import java.util.List;

public interface IUserServices {

   UserDTO findById(Long id);

   List<UserDTO> findAll();

    User create(User user);

}
