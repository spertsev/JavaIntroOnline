package ru.firm.practice.conditional;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		int A, B, x, y, z;

		Scanner scannerObject = new Scanner(System.in);

		System.out.print("Input length of rectangle's side 'A':");
		A = scannerObject.nextInt();
		System.out.print("Input length of rectangle's side 'B':");
		B = scannerObject.nextInt();
		System.out.print("Input the dimension 'x' of the brick:");
		x = scannerObject.nextInt();
		System.out.print("Input the dimension 'y' of the brick:");
		y = scannerObject.nextInt();
		System.out.print("Input the dimension 'z' of the brick:");
		z = scannerObject.nextInt();

		scannerObject.close();

		if ((x < A && y < B) || (x < A && z < B) || (y < A && z < B))
			System.out.print("True. The brick goes through the hole");
		else
			System.out.print("False. The brick is too big");

	}
}