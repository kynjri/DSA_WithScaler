package Queue;

class QueueEx {
	public static void main(String[] args) {
		Queue queue = new Queue(4);
		queue.enqueue("P1");queue.enqueue("P2");queue.enqueue("P3");queue.enqueue("P4");
		System.out.println("Queue after enqueue operation...");queue.display();
		
		queue.dequeue();queue.dequeue();
		System.out.println("Queue after dequeue operation...");queue.display();
	}

}
