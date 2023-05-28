package Array.Easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {

    static  int count(int[] arr){
        int i = 0;
        for(int j = 1 ; j<arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return (i+1);
    }
    public static void main(String[] args) {

        int arr[] = {1,2,2,3,3,3,4,5};
        Set<Integer> st = new HashSet<>();

        for(int i = 0; i<arr.length; i++){
            st.add(arr[i]);
        }

        System.out.println(st);

        System.out.println(count(arr));

    }
}
