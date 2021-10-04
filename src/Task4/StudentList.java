package Task4;

import java.util.HashMap;
import java.util.Map;

public class StudentList {
	private final String[] subjects;
	private final Student[] students;
	private int subjectsCount;
	private int studentsCount;
	private final HashMap<String, HashMap<String, Integer>> map;

	public StudentList(String[] subjects) {
		this.subjects = new String[100];
		this.students = new Student[100];
		this.subjectsCount = subjects.length;
		this.studentsCount = 0;
		for (int i = 0; i < subjects.length; i++) {
			this.subjects[i] = subjects[i];
		}
		this.map = new HashMap<>();
		for (String subject : subjects) {
			this.map.put(subject, new HashMap<>());
		}
	}

	public void addSubject(String subject) {
		subjects[subjectsCount++] = subject;
	}

	public void addStudent(Student student) {
		students[studentsCount++] = student;
	}

	public void setGrade(String subject, String id, int grade) {
		// with the key 'subject' get the innerMap with grades
		HashMap<String, Integer> innerMap = map.get(subject);
		if (innerMap == null) {
			innerMap = new HashMap<>();
			map.put(subject, innerMap);
		}
		// with the key 'id' write the grade into the innerMap
		innerMap.put(id, grade);
	}

	public int getGrade(String subject, String id) {
		HashMap<String, Integer> innerMap = map.get(subject);
		if (innerMap == null) {
			innerMap = new HashMap<>();
			map.put(subject, innerMap);
		}
		// with the key 'id' get the grade from the innerMap
		Integer grade = innerMap.get(id);
		if (grade == null) {
			return 0;
		}
		return (int) grade;
	}

	public Map<String, Integer> getGrades(String subject) {
		return map.get(subject);
	}

	public void showAllGrages() {
		for (int i = 0; i < studentsCount; i++) {
			Student s = students[i];
			System.out.print(s.getId() + ": ");
			for (int j = 0; j < subjectsCount; j++) {
				String sub = subjects[j];
				System.out.print(sub + "=" + getGrade(sub, s.getId()) + " ");
			}
			System.out.println();
		}
	}

	private int getStudSum(String id) {
		int result = 0;
		for (int i = 0; i < subjectsCount; i++) {
			String sub = subjects[i];
			result += getGrade(sub, id);
		}
		return result;
	}

	public void getBestStudentInfo() {
		final String bestStudentId = getBestStudentId();
		System.out.print(bestStudentId + ": ");
		for (int j = 0; j < subjectsCount; j++) {
			String sub = subjects[j];
			System.out.print(sub + "=" + getGrade(sub, bestStudentId) + " ");
		}
		System.out.println();
	}

	public String getBestStudentId() {
		// if the sum of the student's grades is greater than the sum of the grades of another, then the average grade is also higher
		int currentMax = -1;
		Student bestStudent = null;
		for (int i = 0; i < studentsCount; i++) {
			Student s = students[i];
			int currentSum = getStudSum(s.getId());
			if (currentSum > currentMax) {
				currentMax = currentSum;
				bestStudent = s;
			}
		}
		return bestStudent.getId();
	}
}
