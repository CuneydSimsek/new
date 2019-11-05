package specialInterview;

public class StringManipulation {

	public static void main(String[] args) {
		
		
		String str = "The rains have started here";
		String str1 ="  The rains Have started here  ";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf("s"));
		
		System.out.println(str.indexOf("s", str.indexOf("s")+1));
		
		System.out.println(str.indexOf("have"));
		
		System.out.println(str.indexOf("hello")); // -1
		
		System.out.println(str.equals(str1));
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println("27-->subStr : "+str.substring(0, 5));
		
		System.out.println(str.trim()); //before and later nor between
		
		System.out.println(str.replace(" ", ""));
		
		String date="01-01-2017";
		System.out.println(date.replace("-", "/"));
		
		String test = "Hello_World_Test_Selenium ";
		String[] testArray = test.split("_");
		for(String item:testArray) {
			System.out.print(item+" ");
		}
		System.out.println();
		String s1 ="Care";
		System.out.println(s1.concat("less"));
		
		
		
		String x = "Hello";
		String y = "World";
		int a=100;
		int b=200;
		
		System.out.println(x+y); //HelloWorld
		System.out.println(a+b); //300
		System.out.println(x+y+a+b); //HelloWorld100200
		System.out.println(a+b+x+y); //300HelloWorld
		System.out.println(x+y+(a+b)); //HelloWorld300
		
		
		
	}

}
