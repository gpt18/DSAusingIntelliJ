package More;

import java.util.Random;
import java.util.Scanner;

public class LearnTable {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int c;
        int count = 0;
        int correct = 0;



        do{
            count++;
            int a = randomNumber(12,19);
            int b = randomNumber(1,10);

            System.out.print(a + " x " + b + " = " );
            c = sc.nextInt();

            if(a*b == c){
                System.out.println(true);
                correct++;
            }else System.out.println(false);

            System.out.println();

        }while(c > 0);

        sc.close();

        System.out.println("Score: " + correct + "/" + (count-1));

    }

    static int randomNumber(int min, int max){
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
