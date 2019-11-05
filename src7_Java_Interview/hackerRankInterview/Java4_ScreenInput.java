package hackerRankInterview;

import java.util.Scanner;

public class Java4_ScreenInput {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		Double d = scan.nextDouble();
		scan.nextLine(); //have to use because to clear of keyboard buffer
		String s = scan.nextLine();
		scan.close();
		
		System.out.println("String : "+ s);
		System.out.println("Double : "+ d);
		System.out.println("Int : "+ i);

	}

}
