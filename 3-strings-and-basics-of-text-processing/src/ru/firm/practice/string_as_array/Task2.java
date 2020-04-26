package ru.firm.practice.string_as_array;

/**
 * 2. Замените в строке все вхождения 'word' на 'letter'.
 */
public class Task2 {

	public static void main(String[] args) {
		String sourceString = "A word was at the beginning... word and words and word and";
		String searchingString = "word";
		String replacementString = "letter";
		String resultString = "";
		String leftPartOfSourceString = "";
		int firstIndexOfSearchingString = 0;

		firstIndexOfSearchingString = sourceString.indexOf(searchingString);
		if (firstIndexOfSearchingString == -1) {
			System.out.println(searchingString + " not found");
			return;
		}

		leftPartOfSourceString = sourceString;
		while (firstIndexOfSearchingString != -1) {
			resultString = resultString + leftPartOfSourceString.substring(0, firstIndexOfSearchingString)
					+ replacementString;

			leftPartOfSourceString = leftPartOfSourceString
					.substring(firstIndexOfSearchingString + searchingString.length(), leftPartOfSourceString.length());

			firstIndexOfSearchingString = leftPartOfSourceString.indexOf(searchingString);

			if (firstIndexOfSearchingString == -1) {
				resultString = resultString + leftPartOfSourceString;
			}

		}

		System.out.println(resultString);

	}

}
