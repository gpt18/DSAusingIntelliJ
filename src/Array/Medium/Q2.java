import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.alternateNumbers(new int[]{1, 2, -3, -1, -2, 3})));
    }
}

class Solution{
    public static int[] alternateNumbers(int []a) {
        int[] b = new int[a.length/2];
        int[] c = new int[a.length/2];
        
        int j=0, k=0;

        for(int i=0; i<a.length; i++){
            if(a[i] > 0) b[j++]=a[i];
            else c[k++]=a[i];
           
        }
        // System.out.println(Arrays.toString(b)+"..."+Arrays.toString(c));
        
        j=0;k=0;
        boolean flag = true;
        for(int i=0; i<a.length; i++){
            if(flag){
                a[i] = b[j++];
                flag=false;
            }else{
                a[i] = c[k++];
                flag = true;
            }
            
        }

        return a;
    }
}
