package Task3;

public class Grade {
	private int value;
	private Student student;
	private Subject subject;

	public void setValue( int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setStudent( Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setSubject( Subject subject) {
		this.subject = subject;
	}

	public Subject getSubject() {
		return subject;
	}

	Grade() {}

	Grade(String studentName, String subjectName, int value) {
		this.value = value;
		this.student = new Student(studentName);
		this.subject = new Subject(subjectName);
	}

	@Override
	public String toString() {
		return String.format("%s %s %d", this.student.getName(), this.subject.getName(), this.value);
	}

}
