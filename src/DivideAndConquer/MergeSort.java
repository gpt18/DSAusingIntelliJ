package DivideAndConquer;

public class MergeSort {
    public static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void merge(int[] arr, int si, int mid, int ei){
        //creating new array
        int[] merged = new int[ei - si + 1];

        //maintain current index
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;

        //shorting
        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            }else {
                merged[x++] = arr[idx2++];
            }
        }

        //putting remaining elements into merge array
        //for 1st sub array
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }

        //for 2nd sub array
        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }

        //coping
        for(int i=0, j=si; i<merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid + 1, ei);
        merge(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,6,9,4};
        int n = arr.length;

        System.out.println("Before sorted: ");
        print(arr);
        divide(arr, 0, n-1);
        System.out.println("After sorted: ");
        print(arr);
    }
}
