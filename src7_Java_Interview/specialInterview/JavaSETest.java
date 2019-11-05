package specialInterview;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;




/*
 * Given: */
/*import java.util.ArrayList;

}
What is the result?
A) null
B) 10
C) 0
D) An IndexOutOfBoundsException is thrown at runtime.   xx if index is empty or wrong you will get this 
*/


public class JavaSETest {
	
	
 public static void main(String[] args) {
	 
 List<Integer> elements = new ArrayList<>();
 elements.add(10);
 elements.add(15);
 int firstElmnt = elements.get(0);
 System.out.println(firstElmnt);
 System.out.println(elements.get(1));
 
 
 ArrayList<String> element = new ArrayList<>();
 element.add("Ramazan");
 element.add("Zeliha");
 element.add("Melek");
 element.add("Ramazan");
 element.add("Melek");
 element.add("Emir");
 element.add("Melih");
 
 System.out.println();
 System.out.println("===========Names============");
 System.out.println(element.size());
 for(String name: element) {
	 System.out.println(name);
 }
 
 
 System.out.println("======get into HashSet===========");
 Set<String> setList = new HashSet<String>(); 
 for (String x : element) 
	 setList.add(x); 

  for (String setname : setList) 
     System.out.println(setname); 
 
  
  
  System.out.println("======get into TreeSet===========");
  Set<String> tSet = new TreeSet<String>(element);
  for (String x : tSet) 
      System.out.println(x); 
  
  System.out.println("======new into TreeSet===========");
  Set<String> tsetList = new TreeSet<String>(); 
  for (String tx : element) 
 	 tsetList.add(tx); 

   for (String tsetname : tsetList) 
      System.out.println(tsetname); 
  
 }
 
 
 
 }
	

