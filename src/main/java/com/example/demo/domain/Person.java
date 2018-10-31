package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	@GeneratedValue
	private int personId;
	private String personName;
	private String personAge;
	
	public Person() {
		super();
	}
	public Person(int personId, String personName, String personAge) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personAge = personAge;
	}
	
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonAge() {
		return personAge;
	}
	public void setPersonAge(String personAge) {
		this.personAge = personAge;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", personName=" + personName + ", personAge=" + personAge + "]";
	}
	
	
}
