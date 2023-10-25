import java.util.* ;
import java.io.*;


/**
 * Maximum Subarray Sum
 */

public class Q1 {
    public static void main(String[] args) {

        System.out.println(Solution.maxSubarraySum(new int[]{-1}, 1));

    }
}



class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long max = Integer.MIN_VALUE;
		long sum = 0;
		
		int start = 0;
		int end = -1;
		for(int i=0; i<n; i++){
			
			sum = sum + arr[i];
			if(sum>max) {
				max = sum;
				end = i;
			}
			if(sum<0) {
				sum = 0;
				max = arr[i];
				start = i;
			}
		}

        System.out.println(start+"..."+end);

		return max;
		
	}

}

