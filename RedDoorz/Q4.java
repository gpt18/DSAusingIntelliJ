import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int arr[] = new int[]{7,6,9,9};
        Integer a = 10;
        System.out.println(a);
        System.out.println(sol(arr,a));
        System.out.println(a);
    }

    public static String sol(int arr[] , int a){
        a=20;
        int len = arr.length;
        // int res[] = Arrays.copyOf(arr, len);

        int res[] = new int[len];

        
        int largest = arr[0];
        int slargest = arr[0];
        for(int i=1; i<len; i++){
            if(arr[i] > largest){
                slargest = largest;
                largest = arr[i];
            }
        }


        // Arrays.fill(res, 0);

        for(int i=0; i<len; i++){
            if(arr[i] >= slargest ) res[i] = 0;
            else res[i] = Math.abs(arr[i] - slargest);
        }

        return Arrays.toString(res);
    }
}
