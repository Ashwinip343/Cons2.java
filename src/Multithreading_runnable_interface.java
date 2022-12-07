//MULTITHREADING - IMPLEMENTING RUNNABLE INTERFACE
//Life cycle of thread -  1. New            : Instance of thread created but not invoked by start() method
//                        2. Runnable       : Start() is invoked the thread is not ye selected by the scheduler
//                        3. Running        : Selected by the scheduler
//                        4. Not Runnable   : Thread alive, not eligible to run( reason maybe  : waiting for input .. so it is blocked while other threads are running )
//                        4. Terminated     : Exited Run() method
class myth1 implements Runnable{


    @Override
    public void run() {
        int i=0;
        while(i<10000){
            System.out.println("Thread 1");
        }
    }
}
class myth2 implements Runnable{
    @Override
    public void run() {
        int i=0;
        while(i<10000){
            System.out.println("Thread 2");
        }
    }
}


public class Multithreading_runnable_interface {
    public static void main(String[] args) {
        myth1 n=new myth1();
        Thread n1= new Thread(n);

        myth2 m= new myth2();
        Thread m1=new Thread(m);

        n1.start();
        m1.start();

    }

}
