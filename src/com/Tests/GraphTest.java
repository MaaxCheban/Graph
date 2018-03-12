package com.Tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.Graph.Edge;
import com.Graph.Graph;
import com.Graph.Vertex;


public class GraphTest {
    
    @Test
    public void testVertex() {
    	Graph<String> graph = new Graph<>();
        graph.addVertex(new Vertex<>("Rrr"));
        assertTrue(graph.getVertexes().contains(new Vertex<>("Rrr")));
        graph.removeVertex(new Vertex<>("Rrr"));
        assertFalse(graph.getVertexes().contains(new Vertex<>("Rrr")));  
    }
    
    @Test
    public void testEdge() {
    	Graph<String> graph = new Graph<>();
    	Edge edge = new Edge(new Vertex<>("Rrr"), new Vertex<>("Mee"), 27);
        graph.addEdge(edge);
        assertTrue(graph.getEdges().contains(edge));
        graph.removeEdge(edge);
        assertFalse(graph.getEdges().contains(edge));
    }

}

