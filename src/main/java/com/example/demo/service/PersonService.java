package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Person;
import com.example.demo.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepo;
	
	public Iterable<Person> getAllPersons(){
		Iterable<Person> persons=new ArrayList<>();
		persons=personRepo.findAll();
		return persons;
	}
	public void savePerson(Person person) {
		personRepo.save(person);
	}
	
	public Person findByPersonName(String personName) {
		Person person=personRepo.findByPersonName(personName);
		return person;
	}
}
