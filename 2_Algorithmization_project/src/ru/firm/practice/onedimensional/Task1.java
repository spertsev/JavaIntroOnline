package ru.firm.practice.onedimensional;

/*
 * 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */


import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		int arrayLength = 0, i, k, sum = 0;
		int[] arr;

		Scanner sc = new Scanner(System.in);
		System.out.print("Input value of 'N' (a length of the naural numbers array):");
		arrayLength = sc.nextInt();
		System.out.print("Input value of 'K':");
		k = sc.nextInt();
		sc.close();

		System.out.print("The array members which are multiple to the " + k + " are: ");

		arr = new int[arrayLength];

		for (i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			if (arr[i] % k == 0) {
				System.out.print(arr[i] + " ");
				sum = sum + arr[i];
			}

		}
		
		System.out.print("\nSum of the array members, which are multiple to the 2, is: " + sum);

	}

}
