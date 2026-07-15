package com.example.restdemo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restdemo.exception.CountryNotFoundException;
import com.example.restdemo.model.Country;

@Service
public class CountryService {
	List<Country> countries = new ArrayList<>();

	public void initialize() {
		this.countries.add(new Country("in", "India"));
		this.countries.add(new Country("us", "United States"));
		this.countries.add(new Country("jp", "Japan"));
		this.countries.add(new Country("ge", "Germany"));
	}

	CountryService() {
		initialize();
	}

	public List<Country> getAllCountries() {
		return countries;
	}

	public Country getCountryIndia() {
		return countries.get(0);
	}

	public Country getCountryByCode(String code) throws CountryNotFoundException {

		for (Country c : countries) {
			if (c.getCode().equalsIgnoreCase(code)) {
				return c;
			}
		}

		throw new CountryNotFoundException();
	}

}
