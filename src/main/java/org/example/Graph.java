package org.example;

import java.util.HashMap;
import java.util.LinkedList;

public class Graph {

    //a list of vertices
    LinkedList<Integer> vertices = new LinkedList<>();

    //a map of vertices to lists of edges.
    //has Integer as the key and a list of edges as the value.
    HashMap<Integer, LinkedList<Integer>> edges = new HashMap<>();

    Graph() {
        LinkedList<Integer> vertices = new LinkedList<>();
        vertices.add(0);
        edges.put(0, vertices);
    }

    void addVertex(int v) {
        vertices.add(v);


    }

}
