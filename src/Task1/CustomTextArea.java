package Task1;

public class CustomTextArea extends TextArea {
	private String backgroundColor;

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public CustomTextArea(int width, int height, String text, String backgroundColor) {
		super(width, height, text);
		System.out.println("CustomTextArea constructor");
		this.backgroundColor = backgroundColor;
	}

	@Override
	public String toString() {
		return "CustomTextArea { " +
				"width = " + this.getWidth() +
				", height = " + this.getHeight() +
				", text = '" + this.getText() + "'" +
				", backgroundColor = '" + backgroundColor + "'" +
				" }";
	}

	{
		System.out.println("CustomTextArea init block");
	}

	static {
		System.out.println("CustomTextArea static block");
	}

}
