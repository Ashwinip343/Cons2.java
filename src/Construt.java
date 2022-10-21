//this keyword & super keyword
//super keyword calls the consturctor of base class
//This keyword is used to refer the current varible when the instant variable name and argument varible are same

class B{
    B(){
        System.out.println("Parent class constructor");
    }
    B(int x){
        System.out.println("The value of x :"+x);
    }
     B(int x,int y){
         System.out.println("The value of x:"+x);
    }
    public void greet(){
        System.out.println("Hello world, Good morning!");
    }

}
class D extends B {
    @Override
    public void greet(){
        System.out.println("Hello, have a great day!");
    }
    D() {
        System.out.println("This is derived class constructor");

    }

    D(int x) {
        super(x);
    }

    D(int x, int y) {
        super(x);                                   //uses the x of base class
        System.out.println("The value of y:" + y);

    }
}
class C extends D{
    C(){
        System.out.println("Child of derived c lass constructor");
    }
    C(int x,int y,int z){
        super(x,y);
        System.out.println("The value of z:"+z);

    }
}

class T{
    public int x=90;

    public int thiskey(){
        return x;
    }
    public int thiskey(int x){     //function overloading
        this.x=x;                  //this keyword
        return x;
    }
}
public class Construt{
    public static void main(String[] args) {
        D obj1 = new D();                         //run time object creation
        B obj2 = new B();
        obj1.greet();
        obj2.greet();                              //Method overriding : inheritance in method overloading
        // C onj=new C(4,8,7);
        //  C obj=new C();
//        T obj=new T();
//        System.out.println(obj.thiskey());
//        System.out.println(obj.thiskey(7));
    }
}

