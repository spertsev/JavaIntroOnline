package ru.firm.practice.linear;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		double a, b, c, result;

		Scanner scannerObject = new Scanner(System.in);

		System.out.print("Input a double value of 'a':");
		a = scannerObject.nextDouble();
		System.out.print("Input a double value of 'b':");
		b = scannerObject.nextDouble();
		System.out.print("Input a double value of 'c':");
		c = scannerObject.nextDouble();

		result = (b + Math.sqrt((Math.pow(b, 2) + 4 * a * c))) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

		System.out.println("A result of the expression =" + result);

		scannerObject.close();

	}
}