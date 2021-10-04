package Task2;

public class Main {
	public static void main(String[] args) throws Exception {
		System.out.println("Task 2: 'Stack'");
		System.out.println("New stack: ");
		final Stack stack = new Stack();
		System.out.println(stack);
		System.out.println("push 33");
		stack.push(33);
		System.out.println(stack);
		System.out.println("push 66");
		stack.push(66);
		System.out.println(stack);
		System.out.println("push 99");
		stack.push(99);
		System.out.println(stack);
		System.out.println("forEach loop: ");
		stack.forEach(n -> {System.out.print(n.data + " ");});
		System.out.println();
		System.out.println("pop: ");
		final int value = stack.pop();
		System.out.println(value);
		System.out.println(stack);
		System.out.println("clear: ");
		stack.clear();
		System.out.println(stack);
		System.out.println("isEmpty: ");
		System.out.println(stack.isEmpty());
	}
}
