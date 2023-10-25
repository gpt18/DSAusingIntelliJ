import java.util.LinkedList;
import java.util.Queue;

/**
 * @MinimumSteps
 *               You are currently at cell (1, 1) of an N X M grid.
 *               There is a rule that decides how you can move in the grid to
 *               reach the position (N, M).
 *               The rule is, that if you are at cell (x, y) then from there you
 *               can either move to cell (x, x+y) or to cell (x+y, y) in one
 *               step.
 * 
 */

public class Q2 {
    public static void main(String[] args) {
        int n = 3;
        int m = 2;
        System.out.println(min(n, m));
        System.out.println(minq(n, m));

    }

    public static int min(int n, int m) {
        int steps = 0;
        int x = 1;
        int y = 1;

        for (int i = 1; i <= n * m; i++) {

            if (x == n && y == m) {
                return steps;
            }

            if (x+y <= n) {
                x = x + y;
                steps++;
            }

            if (x+y <= m) {
                y = x + y;
                steps++;
            }

        }

        return -1;
    }

    static int minq(int n, int m){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{1,1,0});

        while(!q.isEmpty()){
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            int steps = current[2];

            if(x == n && y == n){
                return steps;
            }

            if(x+y <= n){
                q.offer(new int[]{x+y,y,steps+1});
            }

            if(x+y <= m){
                q.offer(new int[]{x,x+y,steps+1});
            }

        }
        return -1;
    }
}
