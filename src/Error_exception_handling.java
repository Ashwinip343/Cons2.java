//There are three types of error - Syntax error (missing semicolons , using undeclared variable etc.)
//                                 Logical error (don't get the desired output, error in the logic of program)
//                                 Runtime error () - called exception

//Types of exception : Null Pointer Exception
//                     Arithmetic Exception
//                     Array Index out of Range Exception
//                     Illegal Argument Exception
//                     Number format Exception

//Exception handling by using Try & catch
//try & catch rescues the program from unexpected interruption
//Without Try & catch, the program stops executing(program exits) after error detection , but with try & catch the program handles the exception & continues execution
//import java.io.IOError;
import java.util.*;

public class Error_exception_handling {
    public static void main(String[] args) {
        System.out.println("Enter the dividend: ");
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        System.out.println("Enter the divisor: ");
        int a=sc.nextInt();
        try{

            System.out.println(b/a);
        }

        catch (ArithmeticException e) {
            System.out.println("Operation Failed , Reason: ");
            System.out.println(e);
        }

    }
}
