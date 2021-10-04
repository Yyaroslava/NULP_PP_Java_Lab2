package Task4;

public class Main {
	public static void main(String[] args) {
		System.out.println("Task 4: 'List'");
		final StudentList sl = new StudentList(new String[]{"Physics", "Math", "English"});
		final Student student1 = new Student("01", "Vasyl");
		final Student student2 = new Student("02", "John");
		sl.addStudent(student1);
		sl.addStudent(student2);
		sl.setGrade("Physics", "01", 4);
		sl.setGrade("Physics", "02", 2);
		sl.setGrade("Math", "01", 3);
		sl.setGrade("Math", "02", 5);
		sl.setGrade("English", "01", 5);
		sl.setGrade("English", "02", 4);
		System.out.println("Math map: ");
		System.out.println(sl.getGrades("Math"));
		sl.addSubject("Chemistry");
		sl.setGrade("Chemistry", "01", 5);
		sl.setGrade("Chemistry", "02", 3);
		System.out.println("Chemistry map: ");
		System.out.println(sl.getGrades("Chemistry"));
		System.out.println("All student's info: ");
		sl.showAllGrages();
		System.out.println("Best student's info: ");
		sl.getBestStudentInfo();
	}
}
