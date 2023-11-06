package com.planbtech.cosmos.services;

import com.planbtech.cosmos.dto.UserDTO;
import com.planbtech.cosmos.model.entites.User;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Servico para realizar a operacoes da aplicacao
 */
@Service
public interface IUserServices {

    /**
     * Metodo que retorna um usuario
     *
     * @param id do usuario a ser buscado
     * @return {@code UserDTO} do Usuario encontrado
     */
   UserDTO findById(Long id);

    /**
     * Metodo para retornar todos os usuarios do banco de dados
     *
     * @return {@code List<UserDTO>} uma lista de usuario
     */
   List<UserDTO> findAll();

    /**
     * Metodo para inserir um usario no banco de dados
     *
     * @param user informações a serem cadastradas
     * @return {@code User} as informações que foram cadastradas
     */
    User create(User user);

}
