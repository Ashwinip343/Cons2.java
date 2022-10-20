
//Dynamic method dispatch
// Reference - base class in inheritance , Object - derived class
// Phone n=new Smartphone(); ----- Phone is reference (base class/super class) & Smartphone's object (Derived class/subclass)
// Cannot use the methods of derived class in dynamic method dispatch
//We can run the overridden methods and constructors
class Phone{
       public void greet(){
           System.out.println("Hello , Good morning");
       }
       Phone(){
           System.out.println("This is phone");
       }

}
class SmartPhone extends Phone{
    @Override
    public void greet(){
        System.out.println("Hello , have a great day!");
    }
    SmartPhone(){
        System.out.println("This is Smart Phone");

    }
    public void music(){
        System.out.println("Music being played");
    }


}

public class Dynamic_methods {
    public static void main(String[] args) {
        Phone n=new SmartPhone();
        n.greet();
//        n.music();
    }
}
