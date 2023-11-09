import java.util.*;

public class MQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPages = sc.nextInt();

        sc.nextLine();

        String[] pageLinks = new String[numPages];
        for (int i = 0; i < numPages; i++) {
            pageLinks[i] = sc.nextLine().trim();
        }

        int startPage = sc.nextInt();
        int endPage = sc.nextInt();

        int clicks = minClicks(numPages, pageLinks, startPage, endPage);
        System.out.println(clicks);

        sc.close();
    }

    public static int minClicks(int numPages, String[] pageLinks, int start, int end) {
        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

        for (int i = 0; i < numPages; i++) {
            adjacencyList.put(i, new ArrayList<>());
            String[] links = pageLinks[i].split(" ");
            for (String link : links) {
                int linkedPage = Integer.parseInt(link);
                adjacencyList.get(i).add(linkedPage);
            }
        }

        int[] distance = new int[numPages + 1];
        Arrays.fill(distance, -1);

        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> distance[a] - distance[b]);
        queue.add(start);
        distance[start] = 0;

        while (!queue.isEmpty()) {
            int currentPage = queue.poll();
            for (int linkedPage : adjacencyList.get(currentPage-1)) {
                if (distance[linkedPage] == -1) {
                    queue.add(linkedPage);
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
