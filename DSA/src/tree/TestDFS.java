package tree;
//inorder traversal
//pre order traversal
//post order traversal
//height finder
//k distance
//size of the tree
//maximum value in a binary tree
public class TestDFS {

	public static void main(String[] args) {
		Node root=new Node(10);
		 root.left=new Node(20);
		 root.right= new Node(30);
		 root.right.left= new Node(40);
		 root.right.right=new Node(50);
		 root.left.right=new Node(60);
		 root.left.left=new Node(80);
		 
		System.out.println(maxtree(root, 0));

	}
	
	static void printdfs(Node root) {
		if(root==null) 			
			return;
		
		printdfs(root.left);
		System.out.println(root.key);
		printdfs(root.right);
	}
	
	//inorder traversal
	static void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.key+" ");
			inOrder(root.right);
		}
	}
	
	//pre order traversal
	static void preOrder(Node root) {
		if(root!=null) {
			System.out.println(root.key);
			preOrder(root.left);
			
			preOrder(root.right);
		}
	}
	
	//post order traversal
	static void postOrder(Node root) {
		if(root!=null) {
			
			postOrder(root.left);		
			postOrder(root.right);
			System.out.println(root.key);
		}
	}
	
	//height finder
		static int heightfinder(Node root) {
		if(root==null)
			return 0;
		return 1+Math.max(heightfinder(root.left),heightfinder(root.right));
	}
		
		//k distance
	static void kdistance(Node root,int k) {
		if(root==null) return;			
		if(k==0)System.out.println(root.key);
							
		kdistance(root.left,k-1);
		kdistance(root.right,k-1);
	}
	
	//size of the tree
	static int sizeofTree(Node root) {
		if(root==null) return 0;
		return 1+sizeofTree(root.left)+sizeofTree(root.right);
	}
	//maximum value in a binary tree
	private static int maxtree(Node root,int max) {
		if(root==null)
			return max;
		max=Math.max(max, root.key);
		
		return Math.max(maxtree(root.left, max), maxtree(root.right, max));
	}
}
