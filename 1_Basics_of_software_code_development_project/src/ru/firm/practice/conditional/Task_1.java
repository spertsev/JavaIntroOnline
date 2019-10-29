package ru.firm.practice.conditional;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {

		int angle1, angle2;
		boolean triangleExists, isRectangular;

		Scanner scannerObject = new Scanner(System.in);

		System.out.println("Input values of the triangle's two angles");
		System.out.print("The first angle:");
		angle1 = scannerObject.nextInt();
		System.out.print("The second angle:");
		angle2 = scannerObject.nextInt();
		scannerObject.close();

		if (angle1 > 0 && angle2 > 0 && (angle1 + angle2) < 180)
			triangleExists = true;
		else
			triangleExists = false;
		System.out.println("Does the triangle exist?: " + triangleExists);

		if (!triangleExists)
			return;

		if (angle1 == 90 || angle2 == 90 || (angle1 + angle2) == 90)
			isRectangular = true;
		else
			isRectangular = false;
		System.out.print("Is the triangle rectangular?: " + isRectangular);

	}
}