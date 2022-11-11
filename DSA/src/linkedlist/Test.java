package linkedlist;

public class Test {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		Main main=new Main();
		Node head=null;
		for(int i=0;i<arr.length;i++) {
		head=main.addNodeBeginning(head, arr[i]);
		}
		//System.out.println(head.data);
		main.printlinklist(head);

	}

}
