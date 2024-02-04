package com.planbtech.cosmos.repositories;

import com.planbtech.cosmos.model.entites.Gender;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenderRepository extends JpaRepository<Gender, Long> {

}
