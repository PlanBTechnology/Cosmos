package com.planbtech.cosmos.repositories;

import com.planbtech.cosmos.model.entites.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
