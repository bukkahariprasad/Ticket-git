package com.person.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.person.Pojo.Address;

public interface AddressRepository extends JpaRepository<Address,Long> {

}
