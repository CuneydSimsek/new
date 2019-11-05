package p01_ClassAndObject;

public class EmpApp {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.Id=23;
		emp1.name="Ramazan";
		emp1.salary=3500.0;
		
		// when create an object Java have to use constructor which is empty like above
		// now back to main class and setup an constructor
		
		Employee emp2 = new Employee(27, "Huseyin", 3760.50);
		
		// we have 2 employee object, let print out them, pay attention for name convention!
		
		System.out.println(emp1.Id + " "+ emp1.name + " "+ emp1.salary);
		System.out.println(emp2.Id + " "+ emp2.name + " "+ emp2.salary);
	}

}
