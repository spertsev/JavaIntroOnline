package ru.firm.practice.onedimensional;

/**
 * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
 * порядковые номера которых являются простыми числами.
 */
public class Task6 {

	public static void main(String[] args) {
		double[] realNumbers = { 1.1, 2.2, 3.3, 4.4, 5, 6, 7 };
		int i;
		int serialNumber;
		double sumOfMembersWithPrimeSerial = 0;

		for (i = 1; i < realNumbers.length; i++) {
			serialNumber = i + 1;
			if (isPrimeNumber(serialNumber)) {
				System.out.print(realNumbers[i] + " ");
				sumOfMembersWithPrimeSerial = sumOfMembersWithPrimeSerial + realNumbers[i];
			}
		}

		System.out.println("\n Sum of the array's members that have a prime serial number: " + sumOfMembersWithPrimeSerial);
	}

	public static boolean isPrimeNumber(int numberForCheck) {
		boolean isPrime = true;
		long i;

		for (i = 2; i <= Math.sqrt(numberForCheck); i++) {
			if (numberForCheck % i == 0) {
				isPrime = false;
			}
		}

		return isPrime;
	}

}
