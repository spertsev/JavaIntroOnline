package ru.firm.practice.conditional;

import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {

		double F, x;

		Scanner scannerObject = new Scanner(System.in);

		System.out.print("Input value of 'x':");
		x = scannerObject.nextFloat();

		scannerObject.close();

		if (x <= 3)
			F = Math.pow(x, 2) - 3 * x +9;
		else
			F = 1 / (Math.pow(x, 3) + 6);
		
		System.out.printf("Result of the function F(x)=%f", F);

	}
}