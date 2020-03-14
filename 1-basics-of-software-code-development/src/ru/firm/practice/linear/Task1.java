package ru.firm.practice.linear;
import java.util.Scanner;

public class Task1 {
	
	public static void main(String[] args) {
		float a, b, c, z;
		Scanner scannerObject = new Scanner(System.in);
		System.out.print("Input a float value of 'a':");
		a = scannerObject.nextFloat();
		System.out.print("Input a float value of 'b':");
		b = scannerObject.nextFloat();
		System.out.print("Input a float value of 'c':");
		c = scannerObject.nextFloat();
		scannerObject.close();
		System.out.println("Calculating a result of function 'z = ((a - 3) * b / 2) + c'");
		z = ((a - 3) * b / 2) + c;
		System.out.println("z=" + z);
	}
}

