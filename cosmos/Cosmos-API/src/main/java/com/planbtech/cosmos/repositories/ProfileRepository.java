package com.planbtech.cosmos.repositories;

import com.planbtech.cosmos.model.entites.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Inteface que contém as regras de conexão com banco de dados da entidade Perfil
 */
public interface ProfileRepository extends JpaRepository<Profile,Long> {
}
