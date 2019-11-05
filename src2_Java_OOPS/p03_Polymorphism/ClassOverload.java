package p03_Polymorphism;

class ClassOverload{                                          //Static Polymorphism, compile time polymorphism or static binding, Static polymorphism in Java is achieved by method overloading

    public int add(int x, int y){  //method 1   2-3

    return x+y;

    }

    public int add(int x, int y, int z){ //method 2    2-3-4

    return x+y+z;

    }

    public int add(double x, int y){ //method 3     2, 3.4

    return (int)x+y;

    }

    public int add(int x, double y){ //method 4   2.5--3

      //return x+(int)y;
    	return (int) (x+y);

    }

}

