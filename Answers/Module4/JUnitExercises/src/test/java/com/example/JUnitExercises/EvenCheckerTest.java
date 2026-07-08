package com.example.JUnitExercises;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EvenCheckerTest {

	EvenChecker ec = new EvenChecker();

	@ParameterizedTest
	@ValueSource(ints = { 2, 4, 6, 8, 10 })
	void testEven(int num) {
		assertTrue(ec.isEven(num));
	}
}