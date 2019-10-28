package ru.firm.practice.linear;

import java.util.Scanner;

public class Task_6 {

	public static void main(String[] args) {

		int x, y;
		boolean isIntoArea;

		Scanner scannerObject = new Scanner(System.in);

		System.out.print("Input the point's coordinates 'x' and 'y'\n");
		System.out.print("x:");
		x = scannerObject.nextInt();
		System.out.print("y:");
		y = scannerObject.nextInt();
		
		isIntoArea = (x >= -2 && x <= 2 && y >= 0 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 00); 
		System.out.print("The point is into the area: " + isIntoArea);
		
		scannerObject.close();

	}
}