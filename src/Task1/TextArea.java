package Task1;

public class TextArea extends View {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public TextArea(int width, int height, String text) {
		super(width, height);
		System.out.println("TextArea constructor");
		this.text = text;
	}

	@Override
	public String toString() {
		return "TextArea {" +
				"width =" + this.getWidth() +
				", height =" + this.getHeight() +
				"text ='" + text + "'" +
				'}';
	}

	{
		System.out.println("TextArea init block");
	}

	static {
		System.out.println("TextArea static block");
	}

}
