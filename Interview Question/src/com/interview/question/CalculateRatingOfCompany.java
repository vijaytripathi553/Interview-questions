package com.interview.question;

class CalculateRatingOfCompany
{
	private static int readWordByWord(String s1, int rating[])
	{
		
		String s2[]=s1.split(" ");  // " " Allows to read word by words. Also 1 is there to give a spacd after reading the words
		int totalRating=0;

		for (int i = 0; i < s2.length; i++) 
		{
						if(s2[i].equals("good"))
						{
							totalRating=totalRating+ rating[0];
						}
						else if(s2[i].equals("best"))
						{
							totalRating=totalRating+ rating[1];
						}
						
						else if(s2[i].equals("excellent"))
						{
							totalRating=totalRating+ rating[2];
						}
		}
		return totalRating;
		
	}
	
	// Main Method
	public static void main(String[] args) {
		int rating[]= {10,20,30};        // Rating for 'good'=10  'best'=20, 'excellent'=30
	
		String s1="He is good in Java programming.Also, he is best in DS&Algo.";
		int ans=readWordByWord(s1,rating);
		
		System.out.println(ans);
	}
}