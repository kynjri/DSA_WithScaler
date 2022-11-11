package depthFirstSearch;

import java.util.ArrayList;


public class DFSCount {
	
	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 
	public static void main(String[] args) 
	{  
		int V = 7; 
		ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer>>(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

		addEdge(adj,0,1); 
    	addEdge(adj,0,2); 
    	addEdge(adj,2,3); 
    	addEdge(adj,1,3); 
    	addEdge(adj,4,5);
    	addEdge(adj,5,6);
    	addEdge(adj,4,6);
    	//addEdge(adj,7,8);
    	
		
		System.out.println("Following is Depth First Traversal: "); 
	    DFSdin(adj,V);
	}
	
	static void DFSdin(ArrayList<ArrayList<Integer>> adj, int V){
		
	    boolean[] visited=new boolean[V]; 
    	for(int i = 0; i<V; i++) 
    		visited[i] = false;
    	
    		
    	int count=0;
    		for(int source=0;source<V;source++) {
    			if(visited[source]==false) {
    				visited[source]=true;
    				count++;
    				DFSRec(adj, source, visited);
    				System.out.println();
    			}
    		}
    		System.out.println("coun:"+count);
    	}	

	static void DFSRec(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited) { 
    	System.out.print(s+" ");
		
        for(int u:adj.get(s)){
            if(visited[u]==false) {
            	visited[u]=true;
                DFSRec(adj,u,visited);
                }
        } 
	} 
	
	
        
	

	} 


