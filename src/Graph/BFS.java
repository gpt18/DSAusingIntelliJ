package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];

        create_graph(graph);


        for(int i=0; i<graph[2].size(); i++){
            Edge e = graph[2].get(i);
            System.out.print(e.dest + " ");
        }
        System.out.println();

        //for disconnected component of graph
        boolean[] visited = new boolean[V];
        for(int i=0; i<V; i++){
            if(visited[i] == false){
                bfs(graph, V, visited, i);
            }
        }
        System.out.println();

    }

    public static void bfs(ArrayList<Edge> graph[], int V, boolean[] visited, int start){
        Queue<Integer> q = new LinkedList<>();


        q.add(start);

        while (!q.isEmpty()){
            int curr = q.remove();
            if(visited[curr] == false){
                System.out.print(curr + " ");
                visited[curr] = true;
                for(int i = 0;  i<graph[curr].size(); i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void create_graph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }
}
