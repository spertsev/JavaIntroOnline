package ru.firm.practice.linear;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		long T, hours, minutes, seconds;

		Scanner scannerObject = new Scanner(System.in);

		System.out.print("Input a number of seconds, it will be presented with a format 'HHч MMмин SSс':");
		T = scannerObject.nextLong();

		hours = T / 3600;
		minutes = (T % 3600) / 60;
		seconds = (T % 3600) % 60;

		System.out.printf("%02dч %02dмин %02dс", hours, minutes, seconds);

		scannerObject.close();

	}
}
