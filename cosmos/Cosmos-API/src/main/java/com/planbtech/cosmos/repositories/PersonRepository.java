package com.planbtech.cosmos.repositories;

import com.planbtech.cosmos.model.entites.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Inteface que contém as regras de conexão com banco de dados da entidade Pessoa
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByCpf(String cpf);
}
