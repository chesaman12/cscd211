package cscd211Comparator;

import java.util.Comparator;

import cscd211Inheritance.Student;

public class StudentTypeComparator implements Comparator<Student> {
	public int compare(Student s1, Student s2) {
		if (s1 == null || s2 == null)
			throw new IllegalArgumentException("Student is null");
		String type1 = s1.getType();
		String type2 = s2.getType();

		Integer id1 = s1.getID();
		Integer id2 = s2.getID();

		if (type1.compareTo(type2) == 0) {
			return id1.compareTo(id2);
		} else {
			return type1.compareTo(type2);
		}
	}
}