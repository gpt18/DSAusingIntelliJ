
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" "); 
        StringBuilder sb = new StringBuilder(); //create empty sb

        for(String data : arr){
            sb.append(data); //joining at the end
            sb.insert(1, "000"); //inserting string form idx 1
            int n = Integer.parseInt(sb.toString()); //converting sb to string to int

            System.out.println(n+1);
            sb.setLength(0); //clear string builder
        }
        System.out.println(Integer.MAX_VALUE);
        
    }
}
