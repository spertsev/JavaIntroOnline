package ru.firm.practice.loop;

import java.util.Scanner;

public class Task_5 {

	public static void main(String[] args) {

		double e, a = 0, sum = 0;
		int n = 1;
		
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Input a double value of 'e':");
		e = scannerObject.nextDouble();
		scannerObject.close();
				
		while (sum < e) {
			a = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
			sum = sum + a;
			n++;
		}
		
		System.out.print("n=" + n + " sum=" + sum);

	}
}	