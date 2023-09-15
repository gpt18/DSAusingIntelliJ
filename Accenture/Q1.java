import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();

        String[] str = name.split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int N = Integer.parseInt(str[2]);

        int k;
        for(k = 1; k>0; k++){
            if(A > N) break;
            else if(B > N) break;
            A += B;
            B += A;
            k++;
        }

        System.out.println(k);
    }
}
