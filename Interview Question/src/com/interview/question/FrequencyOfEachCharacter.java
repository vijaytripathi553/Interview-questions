package com.interview.question;

import java.util.Arrays;
import java.util.Iterator;

public class FrequencyOfEachCharacter {

	private static char findRepeatedAndNonRepeated(String s1)
	{
		char c[]=s1.toCharArray();
		
		char c1='\0';
		
		
		
		for (int i = 0; i < c.length; i++) 
		{
			int counter=1;
			Arrays.sort(c);
			for (int j = i+1; j < c.length; j++) 
			{
				if (c[j]==c[i]) {
					counter++;
					
				} /*
					 * else { break;
					 * 
					 * }
					 */	
			}
			
			if(counter>1)
			{
				System.out.println(c[i]+" "+counter);
				i=i+(counter-1);
			}
			
		}
		return c1;
	}

	// Main Method
	public static void main(String[] args) {

		String s1 = "Vijay Tripathi";

		char result=findRepeatedAndNonRepeated(s1);
		System.out.println(result);

	}

}
