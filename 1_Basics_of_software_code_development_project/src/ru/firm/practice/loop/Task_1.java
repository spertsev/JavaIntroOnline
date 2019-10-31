package ru.firm.practice.loop;

import java.util.Scanner;

public class Task_1 {

	public static void main(String[] args) {

		int positiveInt, i, sum = 0;

		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Input a positive integer number:");
		positiveInt = scannerObject.nextInt();
		scannerObject.close();

		for (i = 1; i <= positiveInt; i++) {
			sum = sum + i;
		}

		System.out.printf("The sum of the numbers from 1 till %d is %d", positiveInt, sum);

	}
}
