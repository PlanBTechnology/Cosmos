package com.planbtech.cosmos.repositories;

import com.planbtech.cosmos.model.entites.Job;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobRepository extends JpaRepository<Job, Long> {

}
