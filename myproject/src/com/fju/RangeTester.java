package com.fju;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please input a number");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		System.out.println("*"+line+"*");
		boolean number = line.equals(">=-3") && line.equals("<=5");
		System.out.println(number);
		
		
	}

}
