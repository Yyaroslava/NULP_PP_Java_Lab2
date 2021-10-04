package Task1;

public class Main {
	public static void main(String[] args) {
		System.out.println("Task 1: 'Class hierarchy and initialisation blocks'");
		final CustomTextArea cta = new CustomTextArea(200, 100, "Hello World!", "red");
		System.out.println(cta);
	}
}
