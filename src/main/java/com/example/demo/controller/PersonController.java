package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Person;
import com.example.demo.service.PersonService;

@RestController
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping("/person")
	public void savePerson(@RequestBody Person person) {
		personService.savePerson(person);
	}
	
	@GetMapping("/persons")
	public Iterable<Person> getAllPersons(){
		return personService.getAllPersons();
	}
}
