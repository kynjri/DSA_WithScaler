package Stack;

class Stack {
	private int top;
	private int maxSize;
	private int[] arr;

	Stack(int maxSize) {
		this.top = -1; // top is -1 when the stack is created
		this.maxSize = maxSize;
		arr = new int[maxSize];
	}

	// Checking if the stack is full or not
	public boolean isFull() {
		if (top >= (maxSize - 1)) {
			return true;
		}
		return false;
	}
	// Checking if the stack is empty or not
	public boolean isEmpty() {
		if (top < 0) {
			return true;
		}
		return false;
	}

	// Adding a new element to the top of the stack
	public boolean push(int data) {
		if (isFull()) {
			return false;
		} else {
			arr[++top] = data;
			return true;
		}
	}

	// Returning the top most element of the stack
	public int peek() {
		if (isEmpty())
			return Integer.MIN_VALUE;
		else
			return arr[top];
	}

	// Displaying all the elements of the stack
	public void display() {
		if (isEmpty())
			System.out.println("Stack is empty!");
		else {
			System.out.println("Displaying stack elements");
			for (int index = top; index >= 0; index--) {
				System.out.println(arr[index]);
			}
		}
	}


	// Removing the element from the top of the stack
	public int pop() {
		if (isEmpty())
			return Integer.MIN_VALUE;
		else
			return arr[top--];
	}
}

