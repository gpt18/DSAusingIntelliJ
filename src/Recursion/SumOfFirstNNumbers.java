package Recursion;

public class SumOfFirstNNumbers {

    static int sum(int n){
        if(n == 0) return 0;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        System.out.println("sum of n numbers using recursion");
        int x = 5;
        int res = sum(x);
        System.out.println("sum is: " + res);
    }
}
