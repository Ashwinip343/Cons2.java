class mt extends Thread{
    public mt(String name){
       super(name);

    }
    public void run(){
        int i=0;
        while(i!=20) {
            System.out.println("Thank you " + this.getName());
            i++;
        }

    }


}

public class Priorities_in_java {
    public static void main(String[] args) {
        mt m1=new mt("Ash");

        mt m2=new mt("Prash");

        mt m3=new mt("Sahil");

        mt m4=new mt("Kavya");

        mt m5=new mt("Prathamesh");
        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.NORM_PRIORITY);
        m3.setPriority(Thread.MIN_PRIORITY);
        m1.setPriority(5);
        m2.setPriority(2);
        m3.setPriority(1);
        m1.start();;
        m2.start();
        m3.start();
//        m4.start();
//        m5.start();
        //There's no order of execution of thread that's why we need to set priorities for setting up the sequence of thread execution
       //In priority thread execution , the highest number has the highest priority &  executes first

    }
}
