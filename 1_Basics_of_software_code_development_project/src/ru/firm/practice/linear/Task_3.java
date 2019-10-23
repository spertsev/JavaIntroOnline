package ru.firm.practice.linear;

import java.util.Scanner;

public class Task_3 {

	public static void main(String[] args) {
		
		double x, y, result;
		
		Scanner scannerObject = new Scanner(System.in);
					
		System.out.print("Input a double value of 'x':");
		x = scannerObject.nextDouble();
		System.out.print("Input a double value of 'y':");
		y = scannerObject.nextDouble();
				
		result = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
						
		System.out.println("A result of the expression =" + result);
		
		scannerObject.close();

	}
}