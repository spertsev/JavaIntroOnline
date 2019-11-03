package ru.firm.practice.loop;

import java.math.BigInteger;

public class Task_4 {

	public static void main(String[] args) {

		long i, multiplication = 1;
		for (i = 1; i <= 14; i++) {
			multiplication = multiplication * i * i;
		}
		System.out.print(multiplication);

	}
}
