//Multithreading is concept of running different processes or methods parallelly , so that if
// any function takes too long ot execute the other functions can run in that time, not every function has to wait
// unlike sequential execution
//It makes execution faster
//Threads can be created by two ways - 1. Extending the thread class
//                                     2. Implementing the runnable interface
//To run the thread we use - start method after creating object of thread class
// THREAD CREATION - EXTENDING THREAD CLASS
class t1 extends Thread{
      @Override
      public void run() {
            int i=0;
            while(i<1000){
                  System.out.println("Thread one running...");
                  i++;
      }

      }

}

class t2 extends Thread{

      @Override
      public void run(){
            int i=0;
            while(i<1000){
                  System.out.println("Thread two running...");
                  i++;
            }
      }

}

public class Multithreading {
      public static void main(String[] args) {
            t1 t=new t1();
            t.start();
            t2 s=new t2();

            s.start();


      }

}
