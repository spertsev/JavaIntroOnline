package ru.firm.practice.loop;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		
		float firstFloat, secondFloat;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Input the first float number:");
		firstFloat = sc.nextFloat();
		System.out.print("Input the second float number:");
		secondFloat = sc.nextFloat();
		sc.close();
		
		String firstFloatString = Float.toString(firstFloat);
		String secondFloatString = Float.toString(secondFloat);
		
		char[] firstFloatArr = firstFloatString.toCharArray();
		char[] secondFloatArr = secondFloatString.toCharArray();
		char[] resultArr; 
		
		if (firstFloatArr.length < secondFloatArr.length) {
			resultArr = new char[firstFloatArr.length];
		} else {
			resultArr = new char[secondFloatArr.length];
		}
		
		
		int i, j, k = 0, l;
		boolean digitIsInResultArr;
		
		
		for (i = 0; i < firstFloatArr.length; i++) {
			for (j = 0; j < secondFloatArr.length; j++) {
				if (secondFloatArr[j] == firstFloatArr[i]) {
					
					digitIsInResultArr = false;
					
					for (l = 0; l < resultArr.length; l++) {
						if (resultArr[l] == secondFloatArr[j]) {
							digitIsInResultArr = true;
							continue;
						}
					}
					
					if (digitIsInResultArr == true || firstFloatArr[i] == '.' || secondFloatArr[j] == '.') {
						continue;
					} 
										
					resultArr[k] = secondFloatArr[j];
					k++;
				}
			}
		}
		
		String resultArrString = new String(resultArr); 
		System.out.println("Digits, which are in the both entered numbers: " + resultArrString);
		
	}

}
