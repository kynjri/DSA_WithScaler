package linkedlist;

public class Main {
		public static void main(String[] args) {
			Node head=new Node(2);
			head.next=new Node(4);
			head.next.next=new Node(3);
			
			Node head2=new Node(5);
			head2.next= new Node(6);
			head2.next.next=new Node(4);
			//printlinklist(head);
			//Node resultHead
			 Node res=addTwoNumbers(head,head2);
			 printlinklist(res);
			
		}
		private static Node addTwoNumbers(Node head1, Node head2) {
			Node curr1=head1,curr2=head2;
			Node res=null;
			int temp=0,data=0;
			while(curr1!=null||curr2!=null) {
				if(temp==0)
				data=curr1.data+curr2.data;
				else {
					data=curr1.data+curr2.data+temp;
					temp=0;}
				if(data>9) {
					data=data%10;
					temp=1;}
				res= addNodeBeginning(res,data );
				curr1=curr1.next;
				curr2=curr2.next;
			}
			
			return res;
			
			        	
			
		}
		private static int findPositionIterative(Node head,int data) {
			Node curr=head;
			if(data==head.data)
				return 1;
			int count=1;
			while(curr.next!=null) {
				if(curr.next.data==data)
					return count+1;
				curr=curr.next;
				count++;
			}
			
			return -1;
		}
		private static Node addNodeEnd(Node head,int x) {
		Node temp=new Node(x);
		if(head==null)
			return temp;
		Node curr=head;
		
		while(true) {
			if(curr.next==null) {
				curr.next=temp;
				break;
				}
			curr=curr.next;
		}
			
			return head;
		}
		public static void printlinklist(Node head){
			while(head.next!=null) {
				System.out.println(head.data);
				head=head.next;
			}	   
			System.out.println(head.data);
		    }
		public static Node addNodeBeginning(Node head,int x) {
			Node temp=new Node(x);
			temp.next=head;
			return temp;
		}
		
		 public static Node addNode(Node head,int position,int data){
			 if(position==1)
				return addNodeBeginning(head,data); 
			 
			 int count=1;
			 Node curr=head;
			 while(curr.next!=null&& count<position) {
				 count++;
				 curr=curr.next;
			 }
			 Node temp=curr.next;
			 curr.next=new Node(data);
			 curr.next.next=temp;
			return head;
			   
			   
		    }
		
		}


