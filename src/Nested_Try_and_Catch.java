//Nested try & Catch
import java.util.Scanner;

public class Nested_Try_and_Catch {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 6};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index:");
        int i= sc.nextInt();
        System.out.println("Enter the divisor:");
        int d= sc.nextInt();
        try{
            try{
                System.out.println(arr[10]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of range!");
                System.out.println("Nested Try & catch worked..");
            }

            System.out.println(arr[i]/d);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error occurred , Reason:");
            System.out.println(e);

        }
        catch(Exception e){
            System.out.println("Operation Failed , Reason:" );
            System.out.println(e);

        }


    }
}
