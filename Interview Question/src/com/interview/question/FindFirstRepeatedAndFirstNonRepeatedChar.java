package com.interview.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindFirstRepeatedAndFirstNonRepeatedChar {
	
	
	private static void m1(String s1)
	{
		int counter=1;
		char s1Array[]=s1.toCharArray();
		
		for (int i = 0; i < s1Array.length; i++) {
			for (int j = i+1; j < s1Array.length; j++) {
				if(s1Array[j]==s1Array[i])
				{
					counter++;
					System.out.println("First Repeated Character in String is :"+s1Array[i]);
					break;
				}
				i=i+(counter - 1);	
							}
			}
			
			
		}
		//return ;
	
	
	
	
	
	
	
	private static void m2(String s1)
	{
		int counter=1;
		char s1Array[]=s1.toCharArray();
		
		for (int i = 0; i < s1Array.length; i++) {
			for (int j = i+1; j < s1Array.length; j++) {
				if(s1Array[j]!=s1Array[i])
				{
					System.out.println(s1Array[i]);
					break;
				}
				//break;
								//i=i+(counter - 1);	
							}
			break;
			}
			
			
		}
	
	// Main Method
	public static void main(String[] args) {
		String s1="vijay Tripathi";
		
		m1(s1);
		m2(s1);
		
	}

}
