package com.fju;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*System.out.print("Please input a number");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		
		System.out.println("*"+line+"*");
		boolean number = line.equals(">=-3") && line.equals("<=5");
		System.out.println(number);*/
		
		int n = 3/5;
		System.out.println(n);
		int m = 5%3;
		System.out.println(m);
		
		String nick = "Tom";
		float a = 18.9847f;
		System.out.printf("Yor age: %.2f ", a);
		
		int max = 10 , min = 1 ,guess;
		int secret;
		int count = 1;
		Scanner scanner = new Scanner(System.in);
		secret = (int)(Math.random()*10+1);
		
		while (guess != secret){
				System.out.println("Your guess: ("+count+"/4): ");
				guess = scanner.nextInt();
		if (guess==secret){
			System.out.println("Great! The secret number is "+ secret);
		}
		
		
	}

	}
}
