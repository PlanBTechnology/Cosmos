package com.planbtech.cosmos.repositories;

import com.planbtech.cosmos.model.entites.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Inteface que contém as regras de conexão com banco de dados da entidade Endereço
 */
public interface AddressRepository extends JpaRepository<Address,Long> {
}
