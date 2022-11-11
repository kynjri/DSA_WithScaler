
package breadthFirstSearch;


import java.util.*; 

class BFSCount { 
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
		
		System.out.println(BfsCount(adj,V)); 
		
	} 

	static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 

	static void BFS(ArrayList<ArrayList<Integer>> adj,int s, boolean[] visited) 
	{ 
		//int count=0;
    	Queue<Integer> q=new LinkedList<>();
    	
    	visited[s] = true; 
    	q.add(s); 
    
    	while(q.isEmpty()==false) 
    	{ 
    		int u = q.poll(); 
    		System.out.print(u + " "); 
    		//count++;
    		 
    		for(int v:adj.get(u)){
    		    if(visited[v]==false){
    		        visited[v]=true;
    		        q.add(v);
    		    }
    		} 
    	}
    	//return count;
	} 
	
	static int BfsCount(ArrayList<ArrayList<Integer>> adj, int V){
		int count=0;
		
	    boolean[] visited=new boolean[V]; 
    	for(int i = 0; i < V; i++) 
    		visited[i] = false;
    	for(int i=0;i<V;i++){
    		
            if(visited[i]==false) {
                BFS(adj,i,visited);
                count++;
                }
          
        }
    	
    	return count;
	}

	
} 
