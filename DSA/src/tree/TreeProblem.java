package tree;
//Children sum property
//check if tree is balanced tree
public class TreeProblem {
	public static void main(String[] args) {
		// Empty tree.
		//Node root=null;
		Node root=new Node(10);
		 root.left=new Node(20);
		 root.right= new Node(30);
		 root.right.left= new Node(40);
		 root.right.right=new Node(50);
		 root.left.right=new Node(60);
		 root.left.left=new Node(80);
		 
		//System.out.println(childrenSumProperty(root));
			if(isBalanced(root)>0)
	    	    System.out.print("Balanced");
	    	else
	    	    System.out.print("Not Balanced");
	        
		 

	}
	//Children sum property
	static boolean childrenSumProperty(Node root) {
		if(root==null)
			return true;
		if(root.left==null&&root.right==null)
			return true;
		int sum=0;
		if(root.left!=null)sum+=root.left.key;
		if(root.right!=null)sum+=root.right.key;
		
		return (root.key==sum && childrenSumProperty(root.left) && childrenSumProperty(root.right));
	}
	//check if tree is balanced tree
	static int isBalanced(Node root) {
		if(root==null)
			return 0;
		int htl=isBalanced(root.left);
		
		if(htl==-1) return -1;
		int htr=isBalanced(root.right);
				if(htr==-1) return -1;
		if(Math.abs(htl-htr)>1)
			return -1;
		else return Math.max(htl, htr)+1;
		
		
	}
	public static int isBalanced1(Node root){
        if(root==null)
            return 0;
        int lh=isBalanced1(root.left);
        if(lh==-1)return -1;
        int rh=isBalanced1(root.right);
        if(rh==-1)return -1;
        
        if(Math.abs(lh-rh)>1)
            return -1; 
        else
            return Math.max(lh,rh)+1;
    }
	
}
