package ru.firm.practice.onedimensional;

/**
 * 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все
 * ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */
public class Task2 {

	public static void main(String[] args) {
		double Z;
		int replacementsCount;
		int i;

		double[] realNumbers = { -1, -3, 4, 8, 5, 22, 17 };
		Z = 4D;
		replacementsCount = 0;
		i = 0;

		for (double currentNumber : realNumbers) {
			if (currentNumber > Z) {
				realNumbers[i] = Z;
				replacementsCount++;
			}
			System.out.print(realNumbers[i] + ", ");
			i++;
		}

		System.out.println("\n Replacements count is " + replacementsCount);

	}

}
