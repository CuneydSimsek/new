package specialInterview;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s ="!@#$%^&Ramazan Sivri@#$%^&123456";
		// Regular Expression Regex : [^a-zA-Z0-9]

		s= s.replaceAll("[^a-zA-Z0-9]", " ");
		
		
		System.out.println(s);
		
		
		//String k= s.replaceAll("[a-zA-Z0-9]", "");
		
		//System.out.println(k);
		
		String k ="!@#$%^&Ramazan.Sivri@#$%^&123456";
		// Regular Expression Regex : [^a-zA-Z0-9]

		k= k.replaceAll("[^a-zA-Z0-9]", "");
		
		
		System.out.println(k);
	}

}
