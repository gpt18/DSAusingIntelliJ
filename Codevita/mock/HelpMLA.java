import java.util.Arrays;
import java.util.Scanner;

public class HelpMLA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int N = sc.nextInt();

        int[] villages = new int[N];
        for (int i = 0; i < N; i++) {
            villages[i] = sc.nextInt();
        }

        int result = maxTime(m1, m2, N, villages);
        System.out.println(result);

        sc.close();
    }

    public static int maxTime(int m1, int m2, int N, int[] villages) {

        int center1 = 0;
        int center2 = 0;

        Arrays.sort(villages);

        for (int i = N - 1; i >= 0; i--) {
            if (center1 <= center2)
                center1 += villages[i] * m1;
            else
                center2 += villages[i] * m2;
        }

        return Math.max(center1, center2);

    }
}
