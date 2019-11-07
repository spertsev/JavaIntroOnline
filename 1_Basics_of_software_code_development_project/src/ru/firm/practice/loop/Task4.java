package ru.firm.practice.loop;

import java.math.BigInteger;

public class Task4 {

	public static void main(String[] args) {

		long i;
		BigInteger multiplication = BigInteger.valueOf(1);

		for (i = 1; i <= 200; i++) {
			BigInteger iToBiginteger = BigInteger.valueOf(i);
			multiplication = multiplication.multiply(iToBiginteger.pow(2));
		}

		System.out.print(multiplication);

	}
}