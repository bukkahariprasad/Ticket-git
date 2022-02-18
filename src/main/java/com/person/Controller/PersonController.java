package com.person.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.Pojo.Person;
import com.person.Service.PersonServiceImpl;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class PersonController {

	@Autowired
	private PersonServiceImpl personServiceImpl;

	public PersonController() {
		super();

	}
	@PostMapping("/person")
	public ResponseEntity<Person> savePerson(@RequestBody Person person){
		return new ResponseEntity<Person>(this.personServiceImpl.createPerson(person),HttpStatus.OK);
	}

	
	@GetMapping("/fetch")
	public List<Person> getPerson(){
		return this.personServiceImpl.getPerson();
	}
	
	}
