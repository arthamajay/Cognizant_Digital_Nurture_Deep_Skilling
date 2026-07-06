package com.cognizant.spring_learn.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.spring_learn.Country;

@RestController
@RequestMapping("/countries")
public class CountryController {
	Logger logger = LoggerFactory.getLogger(CountryController.class);
	ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

	@GetMapping
	public ResponseEntity<Country> getCountry() {
		Country india = new Country();
		india.setCode("id");
		india.setName("India");
		return ResponseEntity.ok(india);
	}

	@GetMapping("/{code}")
	public ResponseEntity<Country> getCountryByCode(@PathVariable String code) {

		ArrayList<Country> countries = context.getBean("countryList", ArrayList.class);
		for (Country c : countries) {
			if (c.getCode().equalsIgnoreCase((code))) {
				return ResponseEntity.ok(c);
			}
		}
		return ResponseEntity.ok(new Country());
	}
}
