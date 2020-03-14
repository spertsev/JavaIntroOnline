package ru.firm.practice.conditional;

import java.util.Scanner;

/*
 *  1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
 */

public class Task1 {

	public static void main(String[] args) {

		int firstAngle;
		int secondAngle;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input values of the triangle's two angles");

		System.out.print("The first angle:");
		firstAngle = typeIntegerValue(scanner);

		System.out.print("The second angle:");
		secondAngle = typeIntegerValue(scanner);

		if (firstAngle > 0 && secondAngle > 0 && (firstAngle + secondAngle) < 180) {
			System.out.println("The triangle exists!");
		} else {
			System.out.println("The triangle doesn't exist!");
			return;
		}

		if (firstAngle == 90 || secondAngle == 90 || (firstAngle + secondAngle) == 90) {
			System.out.print("The triangle is rectangular!");
		} else {
			System.out.print("The triangle is not rectangular!");
		}

	}

	public static int typeIntegerValue(Scanner scanner) {
		while (!scanner.hasNextInt()) {
			System.out.print("You've typed a not integer value!");
			scanner.next();
			System.out.print("\nPlease input an integer:");
		}
		
		return scanner.nextInt();
	}

}
