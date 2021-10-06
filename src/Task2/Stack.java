package Task2;

import java.util.Iterator;

public class Stack implements Iterable<Node> {
	private Node head;

	public Stack() {
		this.head = null;
	}

	public void push(int a) {
		head = new Node(head, a);
	}

	public int pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("pop from empty stack!");
		}
		final int result = head.getData();
		head = head.getNext();
		return result;
	}

	public void clear() throws Exception {
		while (!isEmpty()) {
			pop();
		}
	}

	public boolean isEmpty() {
		return (this.head == null);
	}

	@Override
	public String toString() {
		Node currentHead = head;
		String result = "[ ";
		while (currentHead != null) {
			result += currentHead.getData() + ", ";
			currentHead = currentHead.getNext();
		}
		result += "]";
		return result;
	}

	class NodeIterator implements Iterator<Node> {
		private Node current;

		public boolean hasNext() {
			if (current == null) {
				current = head;
			} else {
				current = current.getNext();
			}
			return (current != null);
		}

		public Node next() {
			return current;
		}
	}

	public Iterator<Node> iterator() {
		return new NodeIterator();
	}
}
