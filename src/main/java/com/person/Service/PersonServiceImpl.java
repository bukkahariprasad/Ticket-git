package com.person.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.Pojo.Person;
import com.person.Repository.AddressRepository;
import com.person.Repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService{
	@Autowired
	private PersonRepository personRepository;
	@Autowired
	private AddressRepository addressRepo;

	public PersonServiceImpl() {
		super();
		
	}

	@Override
	public Person createPerson(Person person) {
		return this.personRepository.save(person);
	}

	@Override
	public List<Person> getPerson() {
		return this.personRepository.findAll();
	}


	

}
