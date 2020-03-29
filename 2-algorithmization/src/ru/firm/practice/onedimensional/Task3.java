package ru.firm.practice.onedimensional;

/**
 * 3.Дан массив действительных чисел, размерность которого N. Подсчитать,
 * сколько в нем отрицательных, положительных и нулевых элементов.
 */
public class Task3 {

	public static void main(String[] args) {
		double[] realNumbers = { 2.2, 3.3, 0, -1.1, -5.5, 0, 0, -7.7 };
		int positiveCount = 0;
		int negativeCount = 0;
		int zerosCount = 0;

		for (double currentNumber : realNumbers) {
			if (currentNumber > 0) {
				positiveCount++;
			} else if (currentNumber < 0) {
				negativeCount++;
			} else {
				zerosCount++;
			}
		}

		System.out.println("Positive elements count: " + positiveCount);
		System.out.println("Negative elements count: " + negativeCount);
		System.out.println("Zero elements count: " + zerosCount);
	}

}
