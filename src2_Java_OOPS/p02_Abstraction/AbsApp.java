package p02_Abstraction;

public class AbsApp {

	public static void main(String[] args) {
		
		
	//	 AbstractClassParent absObj = new AbstractClassParent(); //can not instantiate but we can after extends child class 
		
		AbstractClassParent parentObj = new RegularClassChild();  // you can't see child class Methods, you can see only parent class
		
		parentObj.getTitle();
		parentObj.getRam();
		parentObj.getZel();
		
		RegularClassChild childObj = new RegularClassChild(); // you can see all methods parent and childs
		
		childObj.getTitle();
		childObj.getRam();
		childObj.getZel();
		childObj.getReady();

	}

}
