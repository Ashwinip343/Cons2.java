// Multiple inheritance is not supported in Java
//But it can be implemented through interfaces
//An interface can extend another interface (inheritance)
//But a class cannot inherit an interface , it can only implement it

interface Interface1{
    void method1();
    void method2();

}
interface Interface2 extends Interface1{

    void method3();
    void method4();
}
class MyClass implements Interface2{
    public void method1(){
        System.out.println("Hello , this is first method of first interface..");

    }
   public void method2(){
       System.out.println("Hello , this is second method of first interface..");

   }
    public void method3(){
        System.out.println("Hello , this is first method of second interface..");

    }
    public void method4(){
        System.out.println("Hello , this is first method of second interface..");

    }
}
public class Interface_inheritance {
    public static void main(String[] args) {
        MyClass obj1= new MyClass();
        obj1.method1();
        obj1.method2();
        obj1.method3();
        obj1.method4();
    }
}
