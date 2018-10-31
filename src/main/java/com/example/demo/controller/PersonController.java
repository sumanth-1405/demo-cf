package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Person;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping("/person")
	public ResponseEntity<?> savePerson(@RequestBody Person person) {
		personService.savePerson(person);
		return new ResponseEntity<>(person, HttpStatus.CREATED);
	}
	
	@GetMapping("/persons")
	public Iterable<Person> getAllPersons(){
		return personService.getAllPersons();
	}
	
	@GetMapping("/person")
	public ResponseEntity<?> getPerson(@RequestParam String personName){
		Person person=personService.findByPersonName(personName);
		return new ResponseEntity<>(person, HttpStatus.FOUND);
	}
}
