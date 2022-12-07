//Access modifiers in java - Public, Private , Protected

import java.util.*;
class Demo{
    public int x1=9;                                //public
    protected  int y1=89;                           //protected
    int z1=90;                                      //no modifier
    private int a1=890;                             //private
    public void Method1(){
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(z1);
        System.out.println(a1);

    }
}
public class Access_modifiers {
    public static void main(String[] args){
        Demo obj=new Demo();
        obj.Method1();
        System.out.println(obj.x1);
        System.out.println(obj.y1);
        System.out.println(obj.z1);
        //System.out.println(obj.a1);             It is private , hence cannot be used in another class



    }
}
