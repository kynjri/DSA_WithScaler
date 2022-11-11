package depthFirstSearch;

import java.util.ArrayList;

public class Graph1 {
	
	
	public static void main(String arg[]) {
		int V=6;
		
		ArrayList<ArrayList<Integer>> adj=new ArrayList<>(V);
		
		for(int i=0;i<V;i++) {
			adj.add(new ArrayList<Integer>());
		}
		
		addEdges(adj,0,1);
		addEdges(adj,0,2);
		addEdges(adj,0,5);
		addEdges(adj,1,2);
		addEdges(adj,1,3);
		addEdges(adj,2,3);
		addEdges(adj,2,4);
		addEdges(adj,2,5);
		addEdges(adj,3,4);
		addEdges(adj,4,5);
		
for(ArrayList<Integer> adjl:adj) {
	
	for(int i:adjl)
		System.out.print(i+" ");
	System.out.println();
}
		
	}

	private static void addEdges(ArrayList<ArrayList<Integer>> adj, int source, int dest ) {
		adj.get(source).add(dest);
		adj.get(dest).add(source);
		
	}

}
