package DivideAndConquer;
import java.util.*;

public class QuickSort {
    /*
    * Time Complexity:
    *    Worst case : O(n^2)
    *       "worst case occurs when pivot is always the smallest or the largest element."
    *       "Condition may be when array is already sorted either in ascending or descending order"
    *
    *   Average case : O(nlogn)
    */

    public static void main(String[] args) {

        int[] arr = {6,5,1,4,2,3,8};
        int n = arr.length;

        System.out.println("Before sorting: ");
        print(arr);

        sort(arr, 0, n-1);

        System.out.println("After sorting:  ");
        print(arr);
    }

    private static void sort(int[] arr, int low, int high) {
        if(low < high) {
            int pidx = partition(arr, low, high);

            sort(arr, low, pidx-1);
            sort(arr, pidx+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low-1; // Variable i plays an important role in the partitioning in the quick sort algorithm.

        for(int j=low; j<high; j++) {
            if(arr[j] < pivot) {
                i++;

                //swapping the array
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return  i;
    }

    private static void print(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
