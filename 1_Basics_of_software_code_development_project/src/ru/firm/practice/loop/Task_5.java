package ru.firm.practice.loop;

import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {

		double e, a, sum = 0;
		int n = 1;
		
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Input a double value of 'e':");
		e = scannerObject.nextDouble();
		scannerObject.close();
		
		a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
		
		if (Math.abs(a) < e) {
			System.out.printf("ABS of the first value of 'a' equals %f is lower than 'e'", a);
			return;
		}
		
		do {
			sum += a;
			n++;
			a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
							
		} while (Math.abs(a) >= e);
		
		System.out.printf("Sum of the first %d members of the series does equal %f", (n - 1), sum);

	}
}	