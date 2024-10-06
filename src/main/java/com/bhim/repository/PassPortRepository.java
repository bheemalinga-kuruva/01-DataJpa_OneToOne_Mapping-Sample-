package com.bhim.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhim.model.Passport;

public interface PassPortRepository   extends JpaRepository<Passport, Integer> {

}
