package org.example;

public class Main {
    public static void main(String[] args) {

    Graph g = new Graph();
    g.addVertex(0);
    g.addVertex(1);
    g.addVertex(2);

    g.addEdge(0,1,5);
    g.addEdge(0,2,10);

    System.out.println("Done!!!");



    }
}