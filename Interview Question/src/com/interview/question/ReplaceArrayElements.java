package com.interview.question;

public class ReplaceArrayElements {
	
	// Method to replace the array element
	private static void doReplace(int array1[])
	{
		
		for (int i = 0; i < array1.length; i++) {
			array1[i]=array1[i] * array1.length;
			System.out.println(array1[i]);
			int enp[]=array1.clone();
			System.out.println(enp[i]);
		}
	//	return array1;
	}
	// Main Method
	public static void main(String[] args) {
		int array1[]= {10,20,30,40,50};
		//System.out.println(doReplace(array1));
		
		doReplace(array1);
	}

}
 