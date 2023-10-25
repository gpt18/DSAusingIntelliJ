/**
 * second largest composite number
 */



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        input = input.replace(";", "");

        String[] num = input.split(" ");

        int[] arr = new int[num.length];

        for(int i=0; i<num.length; i++){
            arr[i] = Integer.parseInt(num[i]);
        }

        Arrays.sort(arr);

        int count=0, n=0, n1=0;
        
        for(int i=0; i<arr.length; i++){
            if(Q1.checkCom(arr[i])) {
                count++;
                if(arr[i]>n1){
                    n=n1;
                    n1=arr[i];
                }
            }
        }


        System.out.println(count+n);
        Q1.solution(arr);
    }

    static boolean checkCom(int num){
        if(num <= 0) return false;
        for(int i=2; i<num/2; i++){
            if(num % i == 0) return true;
        }
        return false;
    }


    static void solution(int[] sequence){
        ArrayList<Integer> com = new ArrayList<>();

        int len = sequence.length;

        

        for(int i=0; i<len; i++){
            boolean flag = false;

            if(sequence[i]<=0){
                flag = false;
            }else{
                for(int j=2; j<sequence[i]/2; j++){
                    if(sequence[i]%j == 0) {
                        flag = true;
                        break;
                    }
                }
            }

            if(flag) com.add(sequence[i]);
            
        }

        Collections.sort(com);
        int count = com.size();
        int second = com.get(count-2);

        System.out.println(com.toString()+"...."+count+"...."+second+"..."+(count+second));
    }
    
}
