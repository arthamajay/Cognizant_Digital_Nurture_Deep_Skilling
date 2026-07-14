package com.cognizant.orm_learn.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.model.Country;

@Service
public class CountryService {

	public JpaRepository repo;

	public CountryService(JpaRepository repo) {
		this.repo = repo;
	}

	public List<Country> getAllCountries() {
		return repo.findAll();
	}
}
