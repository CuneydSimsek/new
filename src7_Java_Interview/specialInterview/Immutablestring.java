package specialInterview;

class Immutablestring {

	public static void main(String args[]) {
		String s = "Ramazan";
		System.out.println(s);
		s = s.concat(" Sivri");
		System.out.println(s.concat(" Sivri"));
		System.out.println(s);
	}
}