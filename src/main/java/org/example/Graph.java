package org.example;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {

    //a list of vertices
   List<Integer> vertices;

    //a map of vertices to lists of edges.
    //has Integer as the key and a list of edges as the value.
    Map<Integer, List<Edge>> adjList;


    public Graph() {
        vertices = new LinkedList<>();
        adjList = new HashMap<>();
    }

    void addVertex(int v) {
        vertices.add(v); //add a vertex to the vertex collection
        adjList.put(v, new LinkedList<>()); //add a key/value pair for the adjacency list for this new vertex
    }

    void addEdge(int v1, int v2, int weight) {
        Edge e = new Edge(v1, v2, weight);

        //Get the adjacency lists.
        List<Edge> v1AdjList = adjList.get(v1);
        List<Edge> v2AdjList = adjList.get(v2);


        // Add edge to adjacency lists.
        v1AdjList.add(e);
        v2AdjList.add(e);
    }


    void showGraph() {
        System.out.println("Vertex List");
        for (Integer v : vertices) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

}
