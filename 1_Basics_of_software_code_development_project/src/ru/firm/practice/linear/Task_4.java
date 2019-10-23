package ru.firm.practice.linear;

import java.util.Scanner;

public class Task_4 {

	public static void main(String[] args) {
	
			float R, revertedR, intPartOfrevertedR, fractionalPartOfRevertedR, intPartOfR;
			
			Scanner scannerObject = new Scanner(System.in);
						
			System.out.print("Input a float value of 'R' (it should be like nnn.ddd):");
			R = scannerObject.nextFloat();
			
			intPartOfR = (int) R;				
			fractionalPartOfRevertedR = intPartOfR / 1000;
			intPartOfrevertedR = R * 1000 - intPartOfR * 1000;
			revertedR = intPartOfrevertedR + fractionalPartOfRevertedR;

			System.out.println("After flip the R you are getting:" + revertedR);
			
			scannerObject.close();

		}
	}