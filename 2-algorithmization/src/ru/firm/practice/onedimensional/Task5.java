package ru.firm.practice.onedimensional;

/**
 * 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
 * которых аi > i.
 */
public class Task5 {

	public static void main(String[] args) {
		int[] integerNumbers = { 1, 3, 4, 5, 1, 1 };
		int j;
		int i;

		for (j = 0; j < integerNumbers.length; j++) {
			i = j + 1;
			if (integerNumbers[j] > i) {
				System.out.print(integerNumbers[j] + " ");
			}
		}
	}
}