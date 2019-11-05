package hackerRankInterview;

import java.util.Scanner;

public class Java3_Java_Weird {

	public static void main(String[] args) {
		
		/* 10 Point
		 * Task: Given an integer, n, perform the following conditional actions:
		 * 
		 * 1. If n is odd, print "Weird"
		 * 
		 * 2. If n is even and in the inclusive range of 2 to 5, print "Not Weird"
		 * 
		 * 3. If n is even and in the inclusive range of 6 to 20, print "Weird"
		 * 
		 * 4. If n is even and greater than 20, print "Not Weird"
		 */

		
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		String ans="";
		
		if(n%2==1) 
		{
			ans= "Weird";
		}
		else 
		{ // starts your code is here
			if (n>=6 && n<=20) 
			{
				ans= "Weird";	
			}
			else 
			{
				ans= "Not Weird";
			}
		}
		System.out.println(ans);
	}

}
