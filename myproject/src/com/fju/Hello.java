package com.fju;

import java.util.Random;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for(int i=1; i<=5 ; i=i+1){
			System.out.println(i);
		}
		
		
		/*while() {
			Random random = new Random();
			int secret = random.nextInt(100)+1;
			System.out.println(secret);
		}
		
		
		
		System.out.println("Please input temperature");
		Scanner scanner = new Scanner(System.in);
		double c = scanner.nextDouble();
		double f = (c * (9.0/5)+32);
		System.out.printf("%.1f C = %.1f F ", c ,f);
		
		
		/*Scanner scanner = new Scanner(System.in);
		System.out.println("Your name");
		String s = scanner.nextLine();
		System.out.println(s);
		
		
		System.out.println("Hello World");

		Person p = new Person(46.5f, 1.6f);
		p.weight = 46.5f;
		p.height = 1.6f;

		System.out.println(p.bmi());
		p.hello();*/
		
		// Person hank = new Person();

		/*int age = 19;
		 System.out.println(age);
		 float weight = 46.5f;
		 System.out.println(weight);
		 double height = 1.6;
		 System.out.println(height);*/
		
		Student stu = new Student("Hank", 80, 77);
		stu.print();
		
		
		
		
		
		
	}

}
