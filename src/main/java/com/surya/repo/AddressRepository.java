package com.surya.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.surya.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
