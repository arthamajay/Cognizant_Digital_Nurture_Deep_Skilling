package com.library.aspect;

public class LoggingAspect {

	public void beforeMethod() {

		System.out.println("Logging : Method Started");

	}

	public void afterMethod() {

		System.out.println("Logging : Method Finished");

	}

}