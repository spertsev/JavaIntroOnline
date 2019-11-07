package ru.firm.practice.conditional;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {

		int x1, y1, x2, y2, x3, y3;

		Scanner scannerObject = new Scanner(System.in);

		System.out.print("Input point A coordinate x1:");
		x1 = scannerObject.nextInt();
		System.out.print("Input point A coordinate y1:");
		y1 = scannerObject.nextInt();
		System.out.print("Input point B coordinate x2:");
		x2 = scannerObject.nextInt();
		System.out.print("Input point B coordinate y2:");
		y2 = scannerObject.nextInt();
		System.out.print("Input point C coordinate x3:");
		x3 = scannerObject.nextInt();
		System.out.print("Input point C coordinate y3:");
		y3 = scannerObject.nextInt();

		scannerObject.close();

		if (y3 == (x3 - x1) * (y2 - y1) / (x2 - x1) + y1)
			System.out.print("True. Points A,B and C are on one line");
		else
			System.out.print("False. Points A,B and C aren't on one line");

	}
}