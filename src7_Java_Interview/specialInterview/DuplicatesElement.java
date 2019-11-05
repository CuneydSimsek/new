package specialInterview;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesElement {

	public static void main(String[] args) {
		
		String names[]= {"Ramazan","Zeliha","Emir","Melek","Melih","Melek"};
		
		Set<String> setNames= new HashSet<String>();
		for(String name:names) {
			
			if(setNames.add(name)==false) {
				System.out.println(name);
			}
		}
		
		/*String names[]= {"Ramazan", "Zeliha", "Ramazan", "Melek", "Melih","Melek", "Emir"};
		
		Set<String> store = new HashSet<String>();
		System.out.println("Duplicate Elements are: ");
		for(String name:names) {
			if(store.add(name)==false) {
				System.out.println(name);
			}
		}*/
		

}
}