package com.planbtech.cosmos.repositories;

import com.planbtech.cosmos.model.entites.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
