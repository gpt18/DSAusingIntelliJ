package Graph;

import java.util.ArrayList;

public class AdjacencyList {

    //Undirected_Unweighted_Graph
    static class UUG {
        static class Edge {
            int src;
            int dest;

            public Edge(int src, int dest){
                this.src = src;
                this.dest = dest;
            }
        }
    }

    //Undirected_Weighted_Graph
    static class UWG {
        static class Edge {
            int src;
            int dest;
            int weight;

            public Edge(int src, int dest, int weight){
                this.src = src;
                this.dest = dest;
                this.weight = weight;
            }
        }
    }


    public static void main(String[] args) {
        int V = 4;

        //Undirected_Unweighted_Graph
        ArrayList<UUG.Edge> graph[] = new ArrayList[V];
        createUUG_Graph(graph);

        //print 2's neighbours
        for(int i = 0; i<graph[2].size(); i++){
            UUG.Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }

        //Undirected_weighted_Graph
        ArrayList<UWG.Edge> graph1[] = new ArrayList[V];
        createUWG_Graph(graph1);

        //print 2's neighbours
        for(int i = 0; i<graph1[2].size(); i++){
            UWG.Edge e = graph1[2].get(i);
            System.out.println(e.dest + " , " + e.weight);
        }

    }

    public static void createUWG_Graph(ArrayList<UWG.Edge> graph[] ){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<UWG.Edge>();
        }

        graph[0].add(new UWG.Edge(0,2,2));

        graph[1].add(new UWG.Edge(1,2,10));
        graph[1].add(new UWG.Edge(1,3,0));

        graph[2].add(new UWG.Edge(2,0,2));
        graph[2].add(new UWG.Edge(2,1,10));
        graph[2].add(new UWG.Edge(2,3,-1));

        graph[3].add(new UWG.Edge(3,1,0));
        graph[3].add(new UWG.Edge(3,2,-1));
    }


    public static void createUUG_Graph(ArrayList<UUG.Edge> graph[] ){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<UUG.Edge>();
        }

        graph[0].add(new UUG.Edge(0,2));

        graph[1].add(new UUG.Edge(1,2));
        graph[1].add(new UUG.Edge(1,3));

        graph[2].add(new UUG.Edge(2,0));
        graph[2].add(new UUG.Edge(2,1));
        graph[2].add(new UUG.Edge(2,3));

        graph[3].add(new UUG.Edge(3,1));
        graph[3].add(new UUG.Edge(3,2));
    }

}
