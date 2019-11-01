package ru.firm.practice.loop;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {

		int x, a, b, h, y;

		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Input value of 'a':");
		a = scannerObject.nextInt();
		System.out.print("Input value of 'b':");
		b = scannerObject.nextInt();
		System.out.print("Input value of 'h':");
		h = scannerObject.nextInt();
		scannerObject.close();

		System.out.println("The function results (values of 'y'):");
		for (x = a; x <= b; x = x + h) {
			if (x > 2)
				y = x;
			else
				y = -x;
			System.out.print(y + " \t");
		}

	}
}
