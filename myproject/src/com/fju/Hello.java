package com.fju;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	}

}
