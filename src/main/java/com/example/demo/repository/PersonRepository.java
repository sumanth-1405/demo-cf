package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer>{
	
	public Person findByPersonName(String string);
}
