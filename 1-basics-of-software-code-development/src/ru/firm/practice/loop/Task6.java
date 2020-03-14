package ru.firm.practice.loop;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		char inputChar, answer;
		Scanner scannerObject = new Scanner(System.in);

		do {
			
			System.out.print("Input a char:");
			inputChar = scannerObject.next(".").charAt(0);

			int asciiOfChar = (int) (inputChar);
			System.out.println("An ASCII value of the char is: " + asciiOfChar);

			System.out.println("Do you want to continue converting chars to the ASCII values? (input y or n):");
			answer = scannerObject.next(".").charAt(0);		

		} while (answer == 'y');
		
		scannerObject.close();

	}

}
