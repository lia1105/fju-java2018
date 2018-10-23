package com.fju;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Your name");
		String s = scanner.nextLine();
		System.out.println(s);
		
		
		System.out.println("Hello World");

		Person p = new Person(46.5f, 1.6f);
		p.weight = 46.5f;
		p.height = 1.6f;

		System.out.println(p.bmi());
		p.hello();
		
		// Person hank = new Person();

		/*int age = 19;
		 System.out.println(age);
		 float weight = 46.5f;
		 System.out.println(weight);
		 double height = 1.6;
		 System.out.println(height);*/
		
		Student stu = new Student();
		stu.name = "Hank";
		stu.english = 70;
		stu.math = 90;
		stu.print();
		
		
		
		
	}

}
