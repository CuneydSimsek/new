package hackerRankInterview;

import java.util.Scanner;

public class Java2_StdinAndStdout {

	public static void main(String[] args) {
		
		 /*
		  * Most HackerRank challenges require you to input from stdin(standart input) and write output to stdout(standart output)
		  * One popular way to read input from stdin is using by Scanner class and specifying the Input as System.in
		  * For example: 
		  */

//		Scanner scanner = new Scanner(System.in);
//		String myString = scanner.next();
//		int myInt = scanner.nextInt();
//		scanner.close();
		
//		System.out.println("myString is : "+ myString);
//		System.out.println("myInt is : "+ myInt);
//		
		
		/*
		 * when run program put in console "hi 5"
		 * you will get result:
		 * myString is : hi
           myInt is : 5
		 */
		 
		
		/* 5 points
		 * Task: In this challenge, you must read 3 integer from stdin and then print them to stdout. 
		 * Each integer must be printed on a new line. 
		 * Sample Input:
		 * 42
		 * 100
		 * 125
		 * 
		 * Sample Output:
		 * 42
		 * 100
		 * 125
		 * 
		 */
		
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		scanner.close();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		
		
	}

}
