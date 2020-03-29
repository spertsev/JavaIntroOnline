package ru.firm.practice.string_as_array;

/**
 * 1.Дан массив названий переменных в camelCase. Преобразовать названия в
 * snake_case.
 */
public class Task1 {

	public static void main(String[] args) {
		String[] camelCaseVariables = { "firstVariableString", "secondVariable" };

		for (String currentVariable : camelCaseVariables) {
			System.out.print(fromCamelToSnakeCase(currentVariable) + ", ");
		}

	}

	public static String fromCamelToSnakeCase(String string) {
		int i;
		int indexOfUpperCaseChar = -1;
		String tempString = "";

		for (i = 0; i < string.length(); i++) {
			if (Character.isUpperCase(string.charAt(i))) {
				if (indexOfUpperCaseChar == -1) {
					tempString = tempString + string.substring(0, i) + "_" + Character.toLowerCase(string.charAt(i));
				} else {
					tempString = tempString + string.substring(indexOfUpperCaseChar + 1, i) + "_"
							+ Character.toLowerCase(string.charAt(i));
				}
				indexOfUpperCaseChar = i;
			}
		}
		tempString = tempString + string.substring(indexOfUpperCaseChar + 1, string.length());

		return tempString;
	}

}
