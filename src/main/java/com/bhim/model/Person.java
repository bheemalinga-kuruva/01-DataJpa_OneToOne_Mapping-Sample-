package com.bhim.model;

import java.time.LocalDate;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personId;
	private String personName;
	private LocalDate dob;
	private String gender;

	@OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
	private Passport passport;

	public Integer getPersonId() {
		return personId;
	}

	public void setPersonId(Integer personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(Integer personId, String personName, LocalDate dob, String gender, Passport passport) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.dob = dob;
		this.gender = gender;
		this.passport = passport;
	}

}