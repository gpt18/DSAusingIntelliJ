import java.util.Scanner;

/**
 * minimum number of plateform for the trains
 */


public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] dep = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            
            int stop = sc.nextInt();
            dep[i] = arr[i]+stop;
        }

        System.out.println(Solution.plateform(arr, dep, n));

    }
}

class Solution {
    static int plateform(int[] arr, int[] dep, int n){
        int i=1, j=0, currentPlateform=1, ans=1;

        while(i<n && j<n){
            if(arr[i]<=dep[j]){
                i++;
                currentPlateform++;
            }else{
                currentPlateform--;
                j++;
            }
            ans = Math.max(ans, currentPlateform);
        }

        return ans;
    }
}
