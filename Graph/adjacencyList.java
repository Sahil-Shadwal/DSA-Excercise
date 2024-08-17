package Graph;

import java.util.*;

public class adjacencyList {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        @Override
        public String toString() {
            return "(" + src + " -> " + dest + ", wt: " + wt + ")";
        }
    }

    public static void printNeighbors(ArrayList<Edge>[] graph, int vertex) {
        System.out.print("Neighbors of vertex " + vertex + ": ");
        for (Edge edge : graph[vertex]) {
            System.out.print(edge.dest + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int V = 7; // Adjusted the number of vertices
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // Adding edges
        graph[0].add(new Edge(0, 1, 5));
        graph[0].add(new Edge(0, 4, 10));
        graph[1].add(new Edge(1, 2, 3));
        graph[1].add(new Edge(1, 3, 2));
        graph[2].add(new Edge(2, 3, 4));
        graph[2].add(new Edge(2, 5, 6));
        graph[3].add(new Edge(3, 4, 1));
        graph[4].add(new Edge(4, 5, 7));
        graph[5].add(new Edge(5, 6, 8));
        graph[6].add(new Edge(6, 0, 9));

        // Printing the graph
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Edge edge : graph[i]) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }

        // Example of printing neighbors
        printNeighbors(graph, 0); // Neighbors of vertex 0
    }
}
