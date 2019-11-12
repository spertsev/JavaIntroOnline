package ru.firm.practice.loop;

import java.util.Scanner;

public class Task7 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		int n, m, i, j;
		
		System.out.print("Input an integer value of 'n', which is a start of a numbers interval:");
		n = sc.nextInt();
		System.out.print("Input an integer value of 'm', which is the end of the numbers interval:");
		m = sc.nextInt();
		sc.close();
		
		for (i = n; i <= m; i++) {
			
			System.out.print("\nDivisors for " + i + " are:");
			
			for (j = 2; j <= Math.sqrt(i); j++) {
				
				if ( ((i % j) == 0) && (i != j) && i != (i / j)) {
					
					System.out.print(j + "," + i / j + ";");
				}
				
			}
			
		}

	}

}
