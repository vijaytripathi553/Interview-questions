package com.interview.question;

import java.util.Arrays;

/* 
For given numbers N and K, write a function to find 'significant number'. Let's look at an example to understand the steps to find 'significant number'.

Given N = 46333 and K = 3,



1. Check if N is 'reversible' or not. ['Reversible' denotes a number sequence that reads the same backward as forward, e.g., 12321]

If Yes, return 1.
If No, go to step 2.



2. Convert digits of N to elements of array A.
e.g. For N = 46333
Convert to array A = [4, 6, 3, 3, 3]



3. Replace each element of array A with its 'modified value'.
Modified value of A[ i ] = A[ i ] * 5;
Modified value of 4 is = 4*5 = 20
Modified value for 6 is = 6*5 = 30 and so on.



After replacing elements of array A with their 'modified values', array A will be [20, 30, 15, 15, 15]



4. For each element in the array generated in previous step, find the 'child primes' that are less than the array element. Then, generate the sum of these child primes.

A child prime is a number in the form (2 * p) + 1 where p is prime.

[Prime numbers are 2, 3, 5, 7, 11 ...]



For A[0] = 20,

for prime number 2, (2 * 2) + 1 = 5 < 20

for prime number 3, (2 * 3) + 1 = 7 < 20

for prime number 5, (2 * 5) + 1 = 11 < 20

for prime number 7, (2 * 7) + 1 = 15 < 20

for prime number 11, (2 * 11) + 1 = 23 > 20. Hence, will not consider 23.
So, child primes less than 20 are [5 7 11 15]. Sum of child primes for array element A[0] is = 38

Similarly for A[1] = 30, child primes that are less than 30 are [5 7 11 15 23 27]
Sum of child prime for array element A[1] is = 88 and so on.



Array is now = [38 88 23 23 23]



5. Count pairs of the array generated in previous step whose sum is divisible by value K=3.

Here pairs which are divisible by 3 are (38,88), (88,23), (88,23) and (88,23).

Hence, return 4. This is the 'significant number' to be returned.



Input

46333

3



where,

First line represents value of N
Second line represents value of K


Expected Output

4
 */

public class BrainBuster {
	
	
	private static void problemSolution(int N, int K)
	{
		
		//STEP 1 Check Reversible by converting it into ana array
		// Converting int value to string so that it can be converted ino sn srray of element
		String temp=Integer.toString(N);
		
		String tempArray[]=temp.split("");
	//	int intArray[];
		
		
		for (int i = tempArray.length-1; i >=0; i--)
		{
			//System.out.print(tempArray[i]);
		
			if(tempArray[i]==temp)
			{
				System.out.print("Yes");
			//	return 1;
			}
		}
			
			// STEP 2 Replace each element of an array with its  modified value
			// Converting an String array to Integer array
			// Converting an String array to Integer array
		int intArray []=new int[tempArray.length];
			for (int i = 0; i < tempArray.length; i++)
			{
				 intArray[i]=Integer.parseInt(tempArray[i]);
				// System.out.println(Arrays.toString(intArray));
				 
				 intArray[i]=intArray[i] * intArray.length;
				 System.out.println(Arrays.toString(intArray));
				
			}
			
			
		
		
		
			
			
			// STEP 2 Replace each element of an array with its  modified value
			
			
		
		//return N;
	}
	
	
	
	
	public static void main(String[] args) {
		int N=46333;
		int K=3;
		
		problemSolution(N,K);
		
		
	}

}
