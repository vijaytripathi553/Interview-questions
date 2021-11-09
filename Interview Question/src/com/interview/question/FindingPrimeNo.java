package com.interview.question;

public class FindingPrimeNo {
	
	private static void findPrime(int n1)
	{
		
		for(int i=2; i<n1/2; i=i+1)
		{
			//int primeNo=0;
			if (n1%i==0) {
				 //primeNo=i;
				System.out.println("Not a Prime No.");
				
			}
			else
			{
				System.out.println(i);
			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		int n1=100;
		
		findPrime(n1);
	}

}
