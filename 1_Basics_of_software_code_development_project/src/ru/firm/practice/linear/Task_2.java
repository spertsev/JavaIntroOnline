package ru.firm.practice.linear;

import java.util.Scanner;

public class Task_2 {

	public static void main(String[] args) {
		
		double a, b, c, result;
		
		Scanner scannerObject = new Scanner(System.in);
					
		System.out.print("Input a float value of 'a':");
		a = scannerObject.nextFloat();
		System.out.print("Input a float value of 'b':");
		b = scannerObject.nextFloat();
		System.out.print("Input a float value of 'c':");
		c = scannerObject.nextFloat();
				
		result = (b + Math.sqrt((Math.pow(b, 2) + 4 * a * c)))/(2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
						
		System.out.println("A result of the expression =" + result);
		
		scannerObject.close();

	}
}