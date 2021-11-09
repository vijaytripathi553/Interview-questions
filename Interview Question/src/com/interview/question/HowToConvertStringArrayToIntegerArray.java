package com.interview.question;

import java.util.Arrays;

public class HowToConvertStringArrayToIntegerArray {
	
	
	private static void convertToIntegerArray(String s1[])
	{
		
		// Converting an String array to Integer array
		int intArray []=new int[s1.length];
		for (int i = 0; i < s1.length; i++) {
			 intArray[i]=Integer.parseInt(s1[i]);
			
		}
		 System.out.println(Arrays.toString(intArray));
		
		
		
	}
	public static void main(String[] args) {
		
		
		String s1[]= {"1","2","3"};
		
		convertToIntegerArray(s1);
	}

}
