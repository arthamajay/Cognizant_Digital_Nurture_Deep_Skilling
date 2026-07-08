package com.example.JUnitExercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	static Calculator c;

	@BeforeAll
	public static void setup() {
		c = new Calculator();
		System.out.println("Calculator object created");
	}

	@AfterAll
	public static void tearDown() {
		c = null;
		System.out.println("Tear Down: Calculator object destroyed");
	}

	@Test
	public void testAdd() {
		int result = c.add(2, 5);
		assertEquals(7, result);
	}

	@Test
	public void testSubtract() {
		int result = c.subtract(9, 7);
		assertEquals(2, result);
	}
}