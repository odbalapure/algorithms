package graph;

import java.util.LinkedList;

public class Graph {
    private int vertices;
    private LinkedList<Integer> adjacencyList[];

    @SuppressWarnings("unchecked")
    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i=0; i<vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public int getVertices() {
        return this.vertices;
    }

    public LinkedList<Integer>[] getAdjacencyList() {
        return this.adjacencyList;
    }

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
    }
}
