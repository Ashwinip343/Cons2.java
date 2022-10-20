//Cannot create object of interfaces , it can contain function declaration only
// Interface contains non defined methods
//Any class implementing an interface is forced to implement all the methods of that interface.
//All methods of interfaces have to be  public
//
//Abstraction vs Interfaces :  1) Abstract classes can be extended to only one class
//                                Interfaces can be implemented more than once.
//                             2) Abstract classes can have its own methods
//                                interfaces cannot have their own methods / has only method declaration not definition

interface Bicycle{
    int var=90;                                //Can create properties but cannot change them afterwards
    public void brake(int inc);

}
interface Bicycle2{
    public void Horn();

}

class Ac implements Bicycle,Bicycle2{                            //multiple interfaces
    int var=8;                                 //can change the properties in the implementing class but not in main class

    public void brake(int inc){
        System.out.println("Applying brake of :"+inc);
    }
    public void Horn(){
        System.out.println("Horn applied");
    }

}

public class Interfaces_in_java {
    public static void main(String[] args) {
        Ac obj2=new Ac();
        obj2.brake(4);
//        System.out.println(Ac.var);             //interface.var when property is not changed in inherited class
        System.out.println(obj2.var);           //object of implementing class.var
        obj2.Horn();
    }
}
