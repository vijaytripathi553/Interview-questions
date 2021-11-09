package com.interview.question;

public class CheckPrime {
	private static void checkPrime(int n) {
		
		int count=1;
		for (int i = 2; i < n-1; i++) {
			
			if(n%i==0)
			{
				count++;
				
			}
			
			
		}
		
		
		if(count>1)
		{
			System.out.println("Not Prime");
		}
		else
		{
			System.out.println("Prime");
		}
		

				
		
	}

	public static void main(String[] args) {
		int n= 25;
		checkPrime(n);
		
	}

	
}
