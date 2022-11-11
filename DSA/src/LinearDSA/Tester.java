package LinearDSA;

public class Tester {
	public static void main(String args[]) {
		LinkedList list = new LinkedList();
		list.add("Jose");
		list.add("Steve");
		list.add("Rebecca");
		System.out.println("Initial LinkedList");
		list.display();
		
		System.out.println("LinkedList after adding Edwin");
		list.add("Edwin");
		list.display();
		
		System.out.println("Searching for a node in LinkedList");
		if (list.find("Rebecca") != null) {
			System.out.println("Node found");
		} else
			System.out.println("Node not found");
		System.out.println("Inserting Alex after Steve");
		list.insert("Alex", "Steve");
		list.display();
		System.out.println("LinkedList after deleting Rebecca");
		list.delete("Rebecca");
		list.display();

	}
}
