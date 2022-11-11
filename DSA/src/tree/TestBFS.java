package tree;
//level order Traversal
//level order traversal line by line method 1
//level order traversal line by line method 2
//left View
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TestBFS {
	public static void main(String[] args) {
		Node root=new Node(10);
		 root.left=new Node(20);
		 root.right= new Node(30);
		 root.right.left= new Node(40);
		 root.right.right=new Node(50);
		 root.left.right=new Node(60);
		 //root.left.left=new Node(80);
		 List<Integer> list=leftView(root);
		 for(int i:list) {
			 System.out.println(i);
		 }
		 //printLevel(root);
		 

	}
	//level order Traversal
	static void levelorderTraversal(Node root) {
		Queue<Node> que=new LinkedList<Node>();
		if(root!=null)
			que.add(root);
		while(!que.isEmpty()) {
			Node curr=que.poll();
			System.out.print(curr.key+" ");
			if(curr.left!=null)
				que.add(curr.left);
			if(curr.right!=null)
				que.add(curr.right);
		}
		
	}
	//level order traversal line by line method 1
	static void levelorderTraversalLBL(Node root) {
		Queue<Node> que=new LinkedList<Node>();
		if(root!=null)
			que.add(root);
		que.add(null);
		
		while(que.size()>1) {
			Node curr=que.poll();
			if(curr==null) {
				System.out.println();
			que.add(null);
			continue;
			}
			System.out.print(curr.key+" ");
			if(curr.left!=null)
				que.add(curr.left);
			if(curr.right!=null)
				que.add(curr.right);
		}
	}
	//level order traversal line by line method 2
	  public static void printLevel(Node root){
		  System.out.println("level order traversal line by line method 2");
	        if(root==null)return;
	        Queue<Node> q=new LinkedList<>();
	        q.add(root);
	        while(q.isEmpty()==false){
	            int count=q.size();
	            for(int i=0;i<count;i++){
	            Node curr=q.poll();
	            //if(i==0)
	            System.out.print(curr.key+" ");
	            if(curr.left!=null)
	                q.add(curr.left);
	            if(curr.right!=null)
	                q.add(curr.right);
	            }
	            System.out.println();
	        }
	    }  
	
	//left View
	static  ArrayList<Integer> leftView(Node root){
		ArrayList<Integer> list=new ArrayList<>();
		if(root==null) {
			list.add(-1);
            return list;
            }
        Queue<Node > q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int count=q.size();
            for(int i=0;i<count;i++){
                Node curr=q.poll();
                if(i==0)
                	list.add(curr.key);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }
        }
        return list;
		
	}
	

}
