package p01_ClassAndObject;

public class Employee {
	
	int Id;
	String name;
	double salary;
	
	//there is default constructor here, now go to app class
	
	// create constructor
	
	//if you used default constructor, you have to define an empty constructor for that
	
	public Employee() {
				
	}
	
	// now create new constructor, we can create multiple constructor with has to be same name but different Parameter or different order
	
	public Employee(int Id, String name, double salary) {
		this.Id=Id;
		this.name=name;
		this.salary=salary;
		}
	
	public Employee(String name, int id, double s) {
		this.name=name;
		id=Id;
		s=salary;
	}
// now go to app again
	
	
}
