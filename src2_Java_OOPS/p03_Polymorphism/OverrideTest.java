package p03_Polymorphism;
class OverrideTest{

	//Dynamic Polymorphism, runtime  binding or late binding.  Dynamic polymorphism in Java is achieved by method overriding
	
    public static void main(String[] args){

    OverridePClassVehicle vh=new OverrideCClassMotorBike();

    vh.move();    // prints MotorBike can move and accelerate too!!

    vh=new OverridePClassVehicle();

    vh.move();    // prints Vehicles can move!!

    }

}
/*
Overloading occurs when two or more methods in one class have the same method name but different parameters. 
Overriding means having two methods with the same method name and parameters (i.e., method signature). 
One of the methods is in the parent class and the other is in the child class.
Static Polymorphism, compile time polymorphism or static binding, Static polymorphism in Java is achieved by method overloading
*/