package ru.firm.practice.string_as_string_or_stringbuilder_object;

/**
 * 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в
 * нем.
 */

public class Task1 {

	public static void main(String[] args) {
		String sourceStr = "Mamamylaramu ";
		String searchingLetter = " ";
		String previousLetter = "";
		int lengthOfCurrentSpacesSubstring = 0;
		int lengthOfMaxSpacesSubstring = 0;
		boolean endOfCurrentSpacesSubstring = false;

		if (!sourceStr.contains(searchingLetter)) {
			System.out.println("The searching string '" + searchingLetter + "' not found");
			return;
		}

		String[] splittedSourceStr = sourceStr.split("");
		int i = 0;
		for (String currentLetter : splittedSourceStr) {

			if (i == (sourceStr.length() - 1) && currentLetter.equals(searchingLetter)) {
				/* A case of a space at the end */

				lengthOfCurrentSpacesSubstring = previousLetter.equals(searchingLetter)
						? lengthOfCurrentSpacesSubstring + 2 /* A case of two spaces at the end (two and more) */
						: lengthOfCurrentSpacesSubstring + 1; /* A case of one space at the end */

				endOfCurrentSpacesSubstring = true;

			} else if (currentLetter.equals(searchingLetter) && previousLetter.equals(searchingLetter)) {

				lengthOfCurrentSpacesSubstring++;
				endOfCurrentSpacesSubstring = false;

			} else if (!currentLetter.equals(searchingLetter) && previousLetter.equals(searchingLetter)) {

				lengthOfCurrentSpacesSubstring = lengthOfCurrentSpacesSubstring + 1;
				endOfCurrentSpacesSubstring = true;

			}

			if (endOfCurrentSpacesSubstring) {

				if (lengthOfCurrentSpacesSubstring > lengthOfMaxSpacesSubstring) {
					lengthOfMaxSpacesSubstring = lengthOfCurrentSpacesSubstring;
				}
				lengthOfCurrentSpacesSubstring = 0;

			}

			previousLetter = currentLetter;
			i++;
		}

		System.out.println("Lentgh Of the maximum spaces substring: " + lengthOfMaxSpacesSubstring);

	}

}
