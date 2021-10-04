package Task1;

public class View {
	private int width;
	private int height;

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public View(int width, int height) {
		System.out.println("View constructor");
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "View {" +
				"width =" + width +
				", height =" + height +
				'}';
	}

	{
		System.out.println("View init block");
	}

	static {
		System.out.println("View static block");
	}

}
