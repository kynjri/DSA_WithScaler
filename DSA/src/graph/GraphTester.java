package graph;

import java.util.ArrayList;

public class GraphTester {
	public static void main(String[] args) 
	{  
		Graph graph=new Graph();
		int V = 4; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

		// Adding edges one by one 
//		graph.addEdge(adj, 0, 1); 
//		graph.addEdge(adj, 0, 2); 
//		graph.addEdge(adj, 1, 2); 
//		graph.addEdge(adj, 1, 3); 
//		
//		graph.printGraph(adj); 
	} 
}
