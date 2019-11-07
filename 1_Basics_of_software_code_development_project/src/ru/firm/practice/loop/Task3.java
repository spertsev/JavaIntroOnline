package ru.firm.practice.loop;

public class Task3 {

	public static void main(String[] args) {

		int i, sum = 0;
		for (i = 1; i <= 100; i++) {
			sum = sum + i * i;
		}
		System.out.println(sum);

	}
}
