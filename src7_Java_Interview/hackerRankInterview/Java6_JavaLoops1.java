package hackerRankInterview;

import java.util.Scanner;

public class Java6_JavaLoops1 {

	public static void main(String[] args) {
		
		
		/*
		 * Given an single Integer, N, print its first 10 multiples. Each multiple N X i(where 1<= i <=10) should be printed 
		 * on a new line in the form: N X i = result.
		 */
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		for (int i =1; i<=10; i++)
		{
			int result = N*i;
			System.out.printf("%d x %d = %d\n", N,i,result);
		}
		
in.close();
	}

}
