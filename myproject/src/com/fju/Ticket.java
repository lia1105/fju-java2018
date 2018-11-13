package com.fju;

import java.util.Scanner;

public class Ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter number of tickets");
		Scanner scanner  = new Scanner(System.in);
		int numOfTicket = scanner.nextInt();
		System.out.println("How many round-trip tickets");
		int rtrip = scanner.nextInt();
		System.out.print("Total tickets:" + numOfTicket);
		System.out.println("Round-trip:" + rtrip);
		System.out.println("Total:");
	}

}
