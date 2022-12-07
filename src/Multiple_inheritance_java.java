
//Java does not allow multiple inheritance
//Because : it faces problems when two or more parent classes have methods of same signature
//INTERFACES is a similar concept of multiple inheritance
//interfaces have only method signatures
//classes implementing interfaces  have to implement al the methods in it

import java.util.Scanner;

interface Camera{
    void snap();
    void video();
}

interface Wifi{
    public String[] getNetworks();
    public void ConnectToNetwork(String Network);

}

class CellPhone{
    void Call(int pn){
        System.out.println("Calling....."+pn);
    }
    void PickCall(){
        System.out.println("Connecting....");
    }

}
class MyPhone extends CellPhone implements Camera,Wifi{
    public void snap(){
        System.out.println("Taking snap...");
    }
    public void video(){
        System.out.println("Recording  video....");
    }
    public String[] getNetworks(){
        String[] listOFNetwork={"harry1.0","Prash03","Sam44"};
        return listOFNetwork;

    }
    public void ConnectToNetwork(String Network){

        System.out.println("Connecting to "+Network+"....");
    }
}

public class Multiple_inheritance_java {
    public static void main(String[] args) {
        System.out.println("Select the operation :");
        System.out.print("1.Call\n2.Pick the call\n3.Take snap\n4.Record video\n5.Show Networks\n6.Connect to Network");
        Scanner sc=new Scanner(System.in);
        MyPhone sp= new MyPhone();

        int neww=sc.nextInt();
        switch(neww){
            case 1 -> {System.out.println("Enter the phone number:");
                      int phoneNumber= sc.nextInt();
                      sp.Call(phoneNumber);
                      break;}
            case 2 -> {
                sp.PickCall();
                break;
            }
            case 3 -> {
                sp.snap();
                break;
            }
            case 4 -> {
                sp.video();
                break;
            }
            case 5 -> {String[] newnet = sp.getNetworks();
                        for (String item:newnet){
                          System.out.print(item+" ");

            }
                        break;}
            case 6 -> {
                System.out.println("Choose the network : ");
                String net=sc.next();
                sp.ConnectToNetwork(net);
                break;
            }


            default -> System.out.println("Please select a valid option");
        }



    }
}

