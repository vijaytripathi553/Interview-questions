package com.interview.question;
import java .util.*;


public class BrainBusterSolution {
	
	private static int Significant(int N, int K)
	{
		
		 ArrayList<Integer> result=new ArrayList<Integer>();
		if(isReversible(N))  //1
		{
			return 1;
		}
		else
		{
			// Convert the digits of 'N' into array  // Step 2
			List<Integer> arr=modify(N);
			
			// Find the child primes
			for (int i = 0; i < arr.size();) 
			{
				int h=childPrimeSum(arr.get(i));	
				result.add(h);
			
		    }
		}
		
		int fr=countPair(result,K);
	
			
		
		
		return fr;
	}
	
	
	private static int countPair(ArrayList<Integer>arr,int K)
	{
		int sum=0;
		int ctr=1;
		for(int i=0; i<arr.size(); i++)
		{
			for(int j=i+1; j<arr.size(); j++)
			{
				sum=arr.get(i)+arr.get(j);
				
			}
			if(sum % K 	==0)
			{
				ctr++;
			}
		}
		return ctr;
	}
	
	
	private static int childPrimeSum(int N)
	{
		boolean flag=true;
		int temp=2, sum=0;
		
		while(flag)
		{
			int sum2=(2*temp)+1;
			if(sum2>N)
			{
				break;
			}
			sum=sum+sum2;
			temp=nextPrime(temp);
		}
		return sum;
	}
	
	
	
	
	
	 private static int nextPrime(int n) {
		  int ctr=0;
		  int ans=0;
		  for(int j=n+1;true;j++) {
		   ctr=0;
		   for(int i=1;i<=j/2;i++) {
		    if(j%i == 0) {
		     ctr++;
		    }
		   }
		   if(ctr == 1) {
			   return j;
		   }
		  }
		 }
	
//	STEP 1: Check Whether The 'N' is Reversible
	private static boolean isReversible(int N)
	{
		
		//Stroing the value of  int N into String
		String s=String.valueOf(N); 
		
	     // Craeting one String object thrigh StringBuffer
		StringBuffer sb=new StringBuffer(s);  //46333
		// Reversing to that StringBuffer Object
		sb.reverse(); 
		
		StringBuffer s2=new StringBuffer(sb);   // 33364
		
		if(s.equals(s2))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
//	STEP 2: Convert the digits of N to elements of array A
	
	private static List<Integer> modify(int N)
	{
		
		String s=String.valueOf(N);
		List<Integer> al=new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			
			char c=s.charAt(i);
			
			int n1=Character.getNumericValue(c);
			
			n1=n1*5;
			al.add(n1);
			
			
		}
		return al;
		
	}
	

	
	
	
	// Main Method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 1st Number:");
		int N=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int K=sc.nextInt();
		
		System.out.println("Significant No is" + Significant(N,K));
		
		
		
		
	}

	
}
