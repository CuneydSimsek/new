package p03_Polymorphism;
public class TestOverload{

    public static void main(String[] args){

    ClassOverload demo=new ClassOverload();

    System.out.println(demo.add(2,3));      //method 1 called

    System.out.println(demo.add(2,3,4));    //method 2 called

    System.out.println(demo.add(2,3.4));    //method 4 called

    System.out.println(demo.add(2.5,3));    //method 3 called

    }

}