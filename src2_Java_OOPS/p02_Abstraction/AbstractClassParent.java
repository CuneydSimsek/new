package p02_Abstraction;



public abstract class AbstractClassParent {

	// we should have concrete methods
	public void getTitle() {
		System.out.println("It is Abstract class");
	}
	
	
	//Abstract Class can not instantiate but we can after extends child class 
	
	/*Rules of Abstract Method
	1. Abstract methods don’t have body, they just have method signature as shown below.
	2. If a class has an abstract method it should be declared abstract, the vice versa is not true, which means an abstract class doesn’t need to have an abstract method compulsory.
	3. If a regular class extends an abstract class, then the class must have to implement all the abstract methods of abstract parent class or it has to be declared abstract as well.
	*/
	
	
	protected abstract void getRam();
	public abstract void getZel();
	public abstract int getSum();
	public abstract String getString();
	
}
