package com.interview.question;
import java.util.*;

public class PrimeNoBetweenGivenNo {
	
	private static void displayPrime(int p) {
		
		for (int i = 2; i < p; i++) {
			int temp=0 ;
			for (int j = 2; j <=i-1; j++) {
				if(i%j==0)
				{
					temp++;
				}
				
			}
			if(temp==0)
			{
			System.out.println(i);
			}
			else
			{
				//temp=0;
				continue;
			}
				
			
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any no.");
		int p=sc.nextInt();
		
		displayPrime(p);
		
		
	}

	
}
