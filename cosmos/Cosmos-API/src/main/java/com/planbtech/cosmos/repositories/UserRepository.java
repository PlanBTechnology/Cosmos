package com.planbtech.cosmos.repositories;

import com.planbtech.cosmos.model.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {

}
