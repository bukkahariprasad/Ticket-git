package com.person.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.person.Pojo.Person;

public interface PersonRepository extends JpaRepository<Person,Integer>{

}
