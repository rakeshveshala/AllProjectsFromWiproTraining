package com.wipro.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.demo.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {

}