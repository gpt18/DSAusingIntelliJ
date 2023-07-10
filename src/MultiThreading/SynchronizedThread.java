package MultiThreading;


public class SynchronizedThread {
    public static void main(String[] args) {
        Table obj = new Table();
        MyThread t1 = new MyThread(obj, 5);
        MyThread t2 = new MyThread(obj, 100);

        t1.start();
        t2.start();
    }

}

class Table {
   public synchronized void printTable(int n){
       for(int i = 1; i<=5; i++){
           System.out.println(i*n);

           try {
               Thread.sleep(400);
           }catch (Exception e){
               System.out.println("exception: " + e);
           }
       }
   }
}

class MyThread extends Thread{
    Table t;
    int n;

    MyThread(Table t, int n){
        this.t = t;
        this.n = n;
    }

    public void run(){
       t.printTable(this.n);
    }
}