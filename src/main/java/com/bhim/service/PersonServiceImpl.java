package com.bhim.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import org.springframework.stereotype.Service;

import com.bhim.model.Passport;
import com.bhim.model.Person;
import com.bhim.repository.PersonRepository;

@Service
public class PersonServiceImpl implements PersonService  {

	@Autowired
	private PersonRepository personRepository;

 @Override
	public void savePerson() {
		Person person = new Person();
		person.setPersonId(101);
		person.setPersonName("bheema");
		person.setGender("male");
		person.setDob(LocalDate.now().minusYears(20));

		Passport passport = new Passport();
		passport.setPassportId(1001);
		passport.setPassportNum("abc123");
		passport.setIssueDate(LocalDate.now());
		passport.setExpDate(LocalDate.now().plusYears(10));
		// association
		person.setPassport(passport);
		passport.setPerson(person);

		personRepository.save(person);

	}
	public void getPerson() {
		personRepository.findById(101);
	}

	public void getPassport() {
		personRepository.findById(1001);
	}
	public void getdeletePerson() {
		personRepository.findById(101);
	}
}
