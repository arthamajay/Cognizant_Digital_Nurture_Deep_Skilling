package com.cognizant.spring_learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void displayDate() {

		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");

		SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

		try {
			LOGGER.info("START");

			Date date = format.parse("31/12/2018");

			LOGGER.info("Date : {}", date);

			LOGGER.info("END");
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

	public static void displayCountry() {

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		Country country = context.getBean("country", Country.class);

		LOGGER.info("START");

		LOGGER.debug("Country : {}", country);

		LOGGER.info("END");
	}

	@SuppressWarnings("unchecked")
	public static void displayCountries() {

		LOGGER.info("START");

		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

		ArrayList<Country> countries = context.getBean("countryList", ArrayList.class);

		for (Country country : countries) {
			LOGGER.info("{}", country);
		}

		LOGGER.info("END");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringLearnApplication.class, args);
		LOGGER.info("Application Started");
		displayCountries();
	}

}
