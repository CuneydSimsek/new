package hackerRankInterview;

import java.util.Scanner;

public class Java5_Output_Formatting_Printf {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=================================");
		for(int i=0; i<3;i++)
		{
			String s1=sc.next();    //input these object 3 times
			int x=sc.nextInt();
			
			
			System.out.printf("%-15s%03d\n", s1,x); //take 2 obj like s1 and x, 
			//System.out.printf("%-15s%03d", s1,x);  //print in format s1 in 15 char then print x in 3 digit complete by 0 before if it is smaller than 3 digit
			                                         // to need go to new line use \n after d
			
		}
		System.out.println("=================================");
		sc.close();
		
		
	}

}
