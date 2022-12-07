class const1 extends Thread{
    public const1(){
        int i =0;
        while(i!=5){
            System.out.println("Hello constructor called without arguments");
            i++;
        }
    }

}
class const2 extends Thread{
    public const2(String name){
        super(name);
        System.out.println(name);
    }



}

public class Constructors_in_threads {
    public static void main(String[] args) {
        const1 obj=new const1();     // no argument constructor
        const2 obj2=new const2("Ash");
        const2 obj3=new const2("Ashu");
        System.out.println(obj.getId());
        System.out.println(obj2.getId());

        System.out.println(obj3.getId());

    }
}
