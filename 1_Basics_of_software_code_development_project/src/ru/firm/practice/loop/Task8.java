package ru.firm.practice.loop;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		float firstFloat, secondFloat;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the first float number:");
		firstFloat = sc.nextFloat();
		System.out.println("Input the second float number:");
		secondFloat = sc.nextFloat();
		
		String firstFloatString = Float.toString(firstFloat);
		String secondFloatString = Float.toString(secondFloat);
		
		char[] firstFloatStringArr = firstFloatString.toCharArray();
		char[] secondFloatStringArr = secondFloatString.toCharArray();
		
		int i, j;
		
		System.out.println(firstFloatString + "\n" + )
		
		for (i = 0; i <= firstFloatString.length(); i++) {
			for (j = 0; j <= secondFloatString.length(); j++) {
				if (secondFloatStringArr[j] == firstFloatStringArr[i]) {
					System.out.println("Numeral " + secondFloatStringArr[j] + " is in both input numbers");
				}
			}
		}
		
	}

}
