public class WrapperExample {
    public static void main(String[] args) {
        Integer num=45;
        Integer num2=90;
        //Integer num=new Integer(45) -object of wrapper class
        //Primitive as an object
        //Integer class is a final class


        final int ICR=3;
        //Convention - all words uppercase if its a final variable
        //Constant - immutable
        // can initialize class as final
        //Always initialize & declare final variable simultaneously
        // variables are constant only if they're of primitive data types
        //final with non-primitive datatypes allows to change the value , only reference of the object is final(immutable)


        final K obj=new K("Ash");
        obj.name="Sonu";
        //obj=new K("New"); // final keyword - cannot reassign the object , but you van change its value


        }
}
class K{
    final int var=10;
    String name;
    public K(String name){
        this.name=name;


    }
}

