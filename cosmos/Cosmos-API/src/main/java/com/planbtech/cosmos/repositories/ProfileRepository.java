package com.planbtech.cosmos.repositories;

import com.planbtech.cosmos.model.entites.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile,Long> {
}
