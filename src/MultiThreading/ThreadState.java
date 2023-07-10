package MultiThreading;

public class ThreadState extends Thread{
    public  void run(){
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadState t1 = new ThreadState();

        int a = 10;
         t1.start();

        System.out.println(t1.getState()+"..."+t1.getName());

    }
}

