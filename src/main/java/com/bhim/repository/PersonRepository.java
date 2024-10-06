package com.bhim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhim.model.Person;

public  interface PersonRepository  extends JpaRepository<Person, Integer> {

}
