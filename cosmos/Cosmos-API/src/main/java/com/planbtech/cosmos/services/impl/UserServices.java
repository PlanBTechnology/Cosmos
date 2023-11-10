package com.planbtech.cosmos.services.impl;

import com.planbtech.cosmos.dto.UserDTO;
import com.planbtech.cosmos.model.entites.User;
import com.planbtech.cosmos.repositories.UserRepository;
import com.planbtech.cosmos.services.IUserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * Aplicacao da interface services
 */
@Service
public class UserServices implements IUserServices {

    /**
     *Utilizando UserRepository para realizar a conexao com o banco de dados
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * Metodo que retorna um usuario
     *
     * @param id do usuario a ser buscado
     * @return {@code UserDTO} do Usuario encontrado
     */
    @Override
    public UserDTO findById(Long id) {
        User result = userRepository.findById(id).orElseThrow(NoSuchElementException::new);
        UserDTO dto = new UserDTO(result);
        return  dto;
    }

    /**
     * Metodo para retornar todos os usuarios do banco de dados
     *
     * @return {@code List<UserDTO>} uma lista de usuario
     */
    @Override
    public List<UserDTO> findAll() {
        List<User> result = userRepository.findAll();
        List<UserDTO> dto = result.stream().map(UserDTO::new).toList();
        return dto;
    }

    /**
     * Metodo para inserir um usario no banco de dados
     *
     * @param userToCreate informações a serem cadastradas
     * @return {@code User} as informações que foram cadastradas
     */
    @Override
    public User create(User userToCreate) {

        if(userToCreate.getId() != null && userRepository.existsById(userToCreate.getId())){
            throw new IllegalArgumentException("User already exists");
        }
        //Implementar metodos de verificação utilizando regex, para que as informações estejam dentro do padrão, como a senha, CPF

        return userRepository.save(userToCreate);
    }
}
