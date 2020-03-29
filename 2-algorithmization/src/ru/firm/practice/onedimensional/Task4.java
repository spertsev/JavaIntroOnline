package ru.firm.practice.onedimensional;

/**
 * 4.Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
 * наименьший элементы.
 */
public class Task4 {

	public static void main(String[] args) {
		double[] realNumbers = { 0, -1.1, 55.5, -31.31, -4.4, 1.1 };
		double maxElement = realNumbers[0];
		double minElement = realNumbers[0];
		int i = 0;
		int indexOfMaxElement = 0;
		int indexOfMinElement = 0;
		double[] temporaryArray = new double[realNumbers.length];

		for (double currentNumber : realNumbers) {
			if (currentNumber > maxElement) {
				maxElement = currentNumber;
				indexOfMaxElement = i;
			}
			if (currentNumber < minElement) {
				minElement = currentNumber;
				indexOfMinElement = i;
			}
			i++;
		}

		i = 0;
		for (double currentNumber : realNumbers) {
			if (i == indexOfMaxElement) {
				temporaryArray[i] = realNumbers[indexOfMinElement];
			} else if (i == indexOfMinElement) {
				temporaryArray[i] = realNumbers[indexOfMaxElement];
			} else {
				temporaryArray[i] = realNumbers[i];
			}
			i++;
		}

		realNumbers = temporaryArray;

		for (double currentNumber : realNumbers) {
			System.out.print(currentNumber + ", ");
		}

	}

}
