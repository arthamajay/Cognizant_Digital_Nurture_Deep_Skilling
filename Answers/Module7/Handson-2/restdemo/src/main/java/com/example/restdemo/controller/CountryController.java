package com.example.restdemo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.restdemo.exception.CountryNotFoundException;
import com.example.restdemo.model.Country;
import com.example.restdemo.services.CountryService;

@RestController
public class CountryController {

	private final CountryService service;

	CountryController(CountryService service) {
		this.service = service;
	}

	@GetMapping("/country")
	public Country getCountryDetails() {
		return service.getCountryIndia();
	}

	@GetMapping("/countries")
	public List<Country> getAllCountries() {
		return service.getAllCountries();
	}

	@GetMapping("/country/{code}")
	public Country getCountryByCode(@PathVariable String code) throws CountryNotFoundException {
		return service.getCountryByCode(code);
	}
}
