package specialInterview;

public class FindMissingNumberInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,4,5};
		
		//1+2+4+5=12
		//1+2+3+4+5=15
		
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Except missing number is : "+ sum);
		
		int sum1 =0;
		for(int j=1; j<=5; j++) {
			sum1=sum1 + j;
		}

		System.out.println("Numbers Total is : "+ sum1);
		System.out.println("Missing Number is : "+ (sum1-sum));
	}

}
