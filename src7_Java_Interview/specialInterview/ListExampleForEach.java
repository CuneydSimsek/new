package specialInterview;

/*
 * public class TestClass {
 public static void main(String[] args) {
 List<String> items = new ArrayList<>();
 items.add("Pen");
 items.add("Pencil");
 items.add("Box");
 for (String i : items) {
 if (i.indexOf("P") == 0) {
 continue;
 } else {
 System.out.print(i+" ");
 }
 }
 }
}
What is the result?
A) Pen Pencil Box
B) Pen Pencil
C) Box
D) Compilation fails
 */


import java.util.ArrayList;
import java.util.List;

public class ListExampleForEach {

	public static void main(String[] args) {
		 List<String> items = new ArrayList<>();
		 items.add("Pen");
		 items.add("Pencil");
		 items.add("Box");
		 for (String i : items) {
		 if (i.indexOf("P") != 0) {
		 continue;
		 } else {
		 System.out.print(i+" ");
		 }
		 }
		 }

	
}
