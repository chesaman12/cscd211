package cscd211Inheritance;

public class Student implements Comparable<Student> {

	protected int id;
	private String name;

	public Student(String name, int id) {
		if (name == null || name.isEmpty() || id < 0)
			throw new IllegalArgumentException("Name or id is null");

		this.name = name;
		this.id = id;
	}

	public int getID() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getType() {
		return this.getClass().toString(); // dont know how to do this
	}

	@Override
	public String toString() {
		return "ID: " + id + " Name: " + name + " ";
	}

	@Override
	public int compareTo(Student o) {

		return this.name.compareTo(o.name);
	}

}
