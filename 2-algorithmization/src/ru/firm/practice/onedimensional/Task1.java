package ru.firm.practice.onedimensional;

/**
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов,
 * которые кратны данному К.
 */

public class Task1 {

	public static void main(String[] args) {

		int[] array;
		int arrayLength;
		int i;
		int k;
		int sum;

		arrayLength = 20;
		k = 3;
		sum = 0;

		array = new int[arrayLength];

		for (i = 0; i < array.length; i++) {
			array[i] = i + 1;
			if (array[i] % k == 0) {
				System.out.print(array[i] + " ");
				sum = sum + array[i];
			}
		}

		System.out.print("\nSum of the array members, which are multiple to " + k + ", is: " + sum);

	}

}
