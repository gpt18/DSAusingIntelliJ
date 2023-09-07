package Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeftRotateByOne {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,20,30));
       
        int[] arr = {1,2,3,4,5,8,9};

        int temp = arr[0];
        for(int i=1; i<arr.length; i++){
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
