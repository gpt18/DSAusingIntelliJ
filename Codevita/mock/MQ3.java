import java.util.Arrays;
import java.util.Scanner;

public class MQ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m1 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int n = scanner.nextInt();

        int[] villages = new int[n];
        for (int i = 0; i < n; i++) {
            villages[i] = scanner.nextInt();
        }

        Arrays.sort(villages);
        int total1 = 0;
        int total2 = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (total1 <= total2) {
                total1 += villages[i] * m1;
            } else {
                total2 += villages[i] * m2;
            }
        }

        int maxTime = Math.max(total1, total2);
        System.out.println(maxTime);
        scanner.close();
    }
}
