import java.io.*;

public class Q2 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int row = br.read();
        pattern1(10);
        
    }

    static void pattern2(int row){

    }

    static void pattern1(int row){
        //pattern triangle
        for(int i=1; i<=row; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int k=row; k>=i; k--){
                System.out.print("*");
            }
            for(int l=row; l>i; l--){
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
