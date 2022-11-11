package tree;
//search in BST Recursive
// search in BST Iterative
// insert in BST
public class BST {
	 
    public static void main(String args[]) 
    { 
        Node root=new Node(15);
    	root.left=new Node(5);
    	root.left.left=new Node(3);
    	root.right=new Node(20);
    	root.right.left=new Node(18);
    	root.right.left.left=new Node(16);
    	root.right.right=new Node(80);
    	int x=16;
    	
    	
    }

	private static boolean searchRecursive(Node root, int x) {
		 if(root==null)
	            return false;
	        if(root.key==x)
	            return true;
	        else if(root.key>x){
	            return searchRecursive(root.left,x);
	        }else{
	            return searchRecursive(root.right,x);
	        }
	}
	 public static boolean searchIterative(Node root, int x){
	        while(root!=null){
	            if(root.key==x)
	                return true;
	            else if(root.key<x)
	                root=root.right;
	            else
	                root=root.left;
	        }
	        return false;
	    }
	 public static Node insertRecursive(Node root,int x){
		 if(root==null) {
			 root=new Node(x);
	            return root;
	            }
		 
	        else if(root.key>x){
	        	
	        		root.left=insertRecursive(root.left,x);
	        }
	        else{
	        	
	             root.right=insertRecursive(root.right,x);
	        }
		 return root;
		 
	 }
	 
	 public static Node insertIterative(Node root, int x){
	        Node temp=new Node(x);
	        Node parent=null,
	             curr=root;
	        while(curr!=null){
	            parent=curr;
	            if(curr.key>x)
	                curr=curr.left;
	            else if(curr.key<x)
	                curr=curr.right;
	            else
	                return root;
	        }
	        if(parent==null)
	            return temp;
	        if(parent.key>x)
	            parent.left=temp;
	        else
	            parent.right=temp;
	        return root;
	    }
}
