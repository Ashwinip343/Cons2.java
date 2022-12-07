//When a variable refers to a new object,the previous one is deleted by the garbage collector
//Finalize can decide what to display when the garbage collection hits & objects no longer in use are deleted


import org.w3c.dom.ls.LSOutput;

public class Finalize {
    public static void main(String[] args) {
        K1 obj;
        for(int i=0;i<100000000;i++){
            obj=new K1("Ashiwni");
        }

    }
}
class K1{
    final int num=10;
    String name;

    public K1(String name){
        this.name=name;
    }
    protected void finalize() throws Throwable{
        System.out.println("Object destroyed!");
        //Prints the msg when any object of this class is destructed
        //Destruction of objects is done automatically in java
    }

}
