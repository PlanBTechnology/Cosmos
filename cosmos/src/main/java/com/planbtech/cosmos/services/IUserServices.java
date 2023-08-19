package com.planbtech.cosmos.services;

import com.planbtech.cosmos.dto.UserDTO;
import com.planbtech.cosmos.model.entites.User;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public interface IUserServices {

   UserDTO findById(Long id);

   List<UserDTO> findAll();

    User create(User user);

}
