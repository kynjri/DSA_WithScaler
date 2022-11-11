package Stack;

class StackEx {
	public static void main(String args[]) {
		String expr1 = "{{}}{}";
		Stack stack = new Stack(5);
		System.out.println("Stack created.\n");
		for (int i = 0; i < expr1.length(); i++) {
			if (expr1.charAt(i) == '{') {
				if (stack.push(expr1.charAt(i))) {
					System.out.println("Element pushed to stack");
				} else {
					System.out.println("Stack is full!!!");
				}

			} else if (expr1.charAt(i) == '}') {
				if (stack.pop() != Integer.MIN_VALUE) {
					System.out.println("Element popped from stack");
				} else {
					System.out.println("Stack is empty!!!");
				}
			}
		}

		System.out.println("Displaying the stack elements:");
		stack.display();
	}
}

