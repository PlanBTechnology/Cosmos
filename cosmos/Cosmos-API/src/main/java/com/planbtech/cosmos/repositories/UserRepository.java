package com.planbtech.cosmos.repositories;

import com.planbtech.cosmos.model.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

/**
 * Inteface que contém as regras de conexão com banco de dados da entidade Usuario
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
