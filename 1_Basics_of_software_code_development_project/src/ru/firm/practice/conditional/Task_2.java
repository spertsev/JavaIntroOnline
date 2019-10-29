package ru.firm.practice.conditional;

import java.util.Scanner;

public class Task_2 {
	
	public static void main(String[] args) {

		int a,b,c,d;
		int minAB = 0;
		int minCD = 0;
		int maxResulted = 0;

		Scanner scannerObject = new Scanner(System.in);

		System.out.print("Input value of the 'a':");
		a = scannerObject.nextInt();
		System.out.print("Input value of the 'b':");
		b = scannerObject.nextInt();
		System.out.print("Input value of the 'c':");
		c = scannerObject.nextInt();		
		System.out.print("Input value of the 'd':");
		d = scannerObject.nextInt();
		scannerObject.close();
			
		if (a > b) {
			minAB = b;
		}	
		else if (a < b) {
			minAB = a;
		}			
		else {
			System.out.print("a == b, no MIN");
			return;
		}

		if (c > d) {
			minCD = d;
		}
		else if (c < d) {
			minCD = c;
		}
		else { 
			System.out.print("c == d, no MIN");
			return;
		}
		
		if (minAB > minCD) {
			maxResulted = minAB;
		}
		else if (minAB < minCD) {
			maxResulted = minCD;
		}
		else {
			System.out.print("minAB == minCD, no MAX");
			return;
		}
		
		System.out.printf("max{min(%d,%d),min(%d,%d)}=%d",a,b,c,d,maxResulted);
		
	}
}