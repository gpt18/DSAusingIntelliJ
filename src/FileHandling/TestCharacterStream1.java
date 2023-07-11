package FileHandling;

import java.io.*;
import java.util.Arrays;

public class TestCharacterStream1 {

    TestCharacterStream1(){
        super();
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        reader();
        t1.start();
    }

    static void reader(){

        try {
            FileReader file = new FileReader("input.txt");
            BufferedReader br =  new BufferedReader(file);

            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Read completed");
    }

    static void writer(){
        String data;
        try{
            FileWriter file = new FileWriter("Output.txt");
            BufferedWriter bw =  new BufferedWriter(file);
            for(int i = 1; i<11; i++){
                data = String.valueOf(i*5);
                bw.write(data+"\n");
                try{
                    Thread.sleep(400);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
            bw.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Write completed");
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
       TestCharacterStream1.writer();
    }
}