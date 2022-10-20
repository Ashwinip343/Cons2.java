//Abstract class contains abstract methods in java
//Abstract methods has declaration in parent class & method definition in child class
//Abstract class does not have any object
// Abstract class can have non-abstract methods in it.
// Abstract class ka derived class should contain all the methods declared in it.
abstract class Parent{
    public Parent(){
        System.out.println("Base Constructor");

    }
    public void Say_hello(){
        System.out.println("Hello");

    }
    public void methods(){
        System.out.println("Non abstract method implemented...");
    }

     abstract public void Greet();
    abstract public void Greet1();



}
class Derived extends Parent {

    Derived(){
        System.out.println("Derived constructor");
    }

    public void Greet() {
        System.out.println("Hello , Have a great day!");
    }

    public void Greet1() {
        System.out.println("Hello , be happy!");


    }
}
//class Derived2 extends Parent{
//    public void Greet(){
//        System.out.println("Hello , Have a bright day!");
//    }
//
//    }
//    public void Greet1(){
//        System.out.println("Hello , Have a great day!");
//    }
//
//}
public class Abstraction_in_java {
    public static void main(String[] args) {

        Derived n=new Derived();
        n.Greet();
        n.Greet1();
        n.methods();

    }

}
