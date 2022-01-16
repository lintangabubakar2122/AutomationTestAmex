package com.automationtest.amex.utils;

public enum TestCases {
	
	T1("Testing Login Amex"),
	T2("Testing Worklist Amex"),
	T3("Testing Login Admin"),
	T4("Testing Dashboard Admin"),
	T5("Testing Master Admin"),
	T6("Testing Validation Admin"),
	T7("Testing Report Admin");
	
	private String testName;	

	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}
