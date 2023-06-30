package String;
import java.util.*;

public class Test {

    public static void main(String[] a){

//        Thrd1 t1 = new Thrd1();
//        Thrd2 t2 = new Thrd2();
//        t1.start();
//        t2.start();

//        binaryString();

//        cool();

        problem1();


    }

    static void problem1(){
        Scanner sc =  new Scanner(System.in);

        int a = Integer.parseInt(String.valueOf(sc.nextInt()).replaceAll("0",""));
        int b = sc.nextInt();
        int c = Integer.parseInt(String.valueOf(sc.nextInt()).replaceAll("0",""));
        int d = Integer.parseInt(String.valueOf(sc.nextInt()).replaceAll("0",""));

        sc.close();

        String bb = String.valueOf(b);
        bb = bb.replaceAll("0", "");
        b = Integer.parseInt(bb);

        System.out.println(a + " + " + b+ " + " + c+ " = " + d);

        if(a+b+c == d)
            System.out.println("valid");
        else
            System.out.println("invalid");


    }

    static void cool(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Range and Limit: ");
        int R = sc.nextInt();
        int K = sc.nextInt();

        System.out.println("Enter Pattern: ");
        String pattern = sc.next();

        sc.close();

        int len = pattern.length();
        int count = 0;

        System.out.println("Number\t| Binary\t| Coolness");
        for(int i=1; i<=R; i++){
            int coolness = 0;
            String binary = Integer.toBinaryString(i);

            for(int j=0; j<binary.length()-(len-1); j++){
                if(binary.substring(j,j+len).equals(pattern))
                    coolness++;
            }

            if(coolness != 0)
                System.out.print(i+"\t| "+binary+"\t| "+ coolness);

            if(coolness >= K){
                count++;
                System.out.print(" <- Very Cool");
            }

            if(coolness != 0)
                System.out.println();

        }
            System.out.println("\nNumber of Very Cool: "+ count);

    }

    static void binaryString(){
        for(int i = 1; i<10; i++){
            String binary = Integer.toBinaryString(i);
            System.out.println(i + " : " + binary);
        }
    }

    static void stringB(){
        String s = "Hello";
        System.out.println("String: " + s);

        //Sting manipulation operation
        s = "world";
        System.out.println("String: " + s);
        System.out.println("String: " + s.charAt(0) + " L: "+s.length());




        StringBuilder sb = new StringBuilder("Hello world");
        System.out.println("StringBuilder: " + sb);

        //Sting manipulation operation
        System.out.println("StringBuilder: " + sb.append(" New"));
        System.out.println("StringBuilder: " + sb.insert(0, "GP"));
        System.out.println("StringBuilder: " + sb.deleteCharAt(2));
        System.out.println("StringBuilder: " + sb.delete(0,3));
        char c = sb.charAt(5);
        System.out.println("StringBuilder: " + sb + " char: "+c);
        sb.setCharAt(1, 'v');
        System.out.println("StringBuilder: " + sb);
        System.out.println("StringBuilder: " + sb.replace(0,1,"H")
                + " C: " + sb.capacity() + " L: "+ sb.length());
    }

}

class Thrd1 extends Thread {
    public void run(){
        for(int i = 0; i <= 5; i++)
            System.out.println("Thread 1: " + i);
        System.out.println("Exit Thread 1");
    }
}

class Thrd2 extends Thread {
    public void run(){
        for(int i = 10; i <= 15; i++)
            System.out.println("Thread 2: " + i);
        System.out.println("Exit Thread 2");
    }
}