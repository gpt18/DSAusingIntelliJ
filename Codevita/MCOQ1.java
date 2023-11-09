import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class MCOQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] pages = new String[N];

        sc.nextLine();
        for (int i=0; i<N; i++) {
            pages[i] = sc.nextLine();
        }

        int start = sc.nextInt();
        int end = sc.nextInt();

        sc.close();

        int result = minClicks(N, pages, start, end);
        System.out.println(result);
    }

    public static int minClicks(int N, String[] pages, int start, int end){

        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<N; i++){
            list.add(new ArrayList<>());
        }

        for(int i=0; i<N; i++){
            String[] linkedPage = pages[i].split(" ");
            for(int j=0; j<linkedPage.length; j++){
                int page = Integer.parseInt(linkedPage[j]);
                list.get(i).add(page);
            }
        }

        int[] distance = new int[N+1];
        Arrays.fill(distance, -1);

        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        distance[start]=0;

        while (!q.isEmpty()) {
            int currentPage = q.poll();
            for(int linkedpage : list.get(currentPage-1)){
                if(distance[linkedpage] == -1){
                    q.add(linkedpage);
                    distance[linkedpage] = distance[currentPage]+1;
                }
            }
        }


        if(distance[end] == -1){
            return -1;
        }else{
            return distance[end];
        }

    }
}
