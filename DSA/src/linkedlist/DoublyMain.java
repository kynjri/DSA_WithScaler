package linkedlist;

public class DoublyMain {

	public static void main(String[] args) {
		DoublyNode temp1=new DoublyNode(20);
		DoublyNode head=new DoublyNode(10);
		head.prev=null;
		head.next=temp1;
		temp1.prev=head;
		temp1.next=new DoublyNode(30);
		printlinklist(head);
		System.out.println("----------");
		//DoublyNode temp3=null;
		head=addNodeBeginning(head,40);
		printlinklist(head);
		System.out.println("--------");
		head=addNodeEnd(head,50);
		printlinklist(head);
		System.out.println("--------");
		head=deleteHeadNode(head);
		
		printlinklist(head);
	}
	public static void printlinklist(DoublyNode head){
		while(head.next!=null) {
			System.out.println(head.data);
			head=head.next;
		}	   
		System.out.println(head.data);
	    }
	public static DoublyNode addNodeBeginning(DoublyNode head,int x) {
		DoublyNode temp=new DoublyNode(x);
		if(head==null)
			return temp;
		temp.next=head;
		head.prev=temp;
		return temp;
	}
	private static DoublyNode addNodeEnd(DoublyNode head,int x) {
		DoublyNode temp=new DoublyNode(x);
		if(head==null)
			return temp;
		DoublyNode curr=head;
		
		while(true) {
			if(curr.next==null) {
				curr.next=temp;
				temp.prev=curr;
				break;
				}
			curr=curr.next;
		}
			
			return head;
		}
	private static DoublyNode deleteHeadNode(DoublyNode head) {
		head=head.next;
		head.next.prev=null;
		return head;
		
	}
}
