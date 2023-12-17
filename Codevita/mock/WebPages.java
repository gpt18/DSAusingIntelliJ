import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class WebPages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        sc.nextLine();

        String[] pageLinks = new String[N];
        for (int i = 0; i < N; i++) {
            pageLinks[i] = sc.nextLine().trim();
        }

        int startPage = sc.nextInt();
        int endPage = sc.nextInt();

        int clicks = minClicks(N, pageLinks, startPage, endPage);
        System.out.println(clicks);

        sc.close();
    }

    public static int minClicks(int N, String[] pageLinks, int start, int end) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            list.add(new ArrayList<>());
            String[] links = pageLinks[i].split(" ");
            for (String link : links) {
                int linkedPage = Integer.parseInt(link);
                list.get(i).add(linkedPage);
            }
        }

        int[] distance = new int[N + 1];
        Arrays.fill(distance, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        distance[start] = 0;

        while (!q.isEmpty()) {
            int currentPage = q.poll();
            for (int linkedPage : list.get(currentPage - 1)) {
                if (distance[linkedPage] == -1) {
                    q.add(linkedPage);
                    distance[linkedPage] = distance[currentPage] + 1;
                }
            }
        }

        if (distance[end] == -1) {
            return -1;
        } else {
            return distance[end];
        }
    }
}