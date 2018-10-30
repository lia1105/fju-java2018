package com.fju;

public class Temperature {
	
	double celsius;
	double fahrenheit;
	
	public Temperature(int celsius) {
		this.celsius = celsius;
		
	public double fahrenheit() {
		double f = celsius * (9.0/5) + 32;
		return f;
	}
	
	}

}
