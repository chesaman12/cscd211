package cscd211Inheritance;

public abstract class Employee implements Comparable<Employee> {
	private final double BASE;
	private String name;
	protected double salary;

	public Employee(String name, double basePayrate, double additionalPayrate) {
		if (name == null || name.isEmpty())
			throw new IllegalArgumentException("String is null");
		if (basePayrate < 0 || additionalPayrate < 0)
			throw new IllegalArgumentException("Rate less then 1");

		this.name = name;
		this.BASE = basePayrate;
		this.salary = basePayrate + additionalPayrate;

	}

	public double getSalary() {
		return this.salary;
	}

	public double getBaseSalary() {
		return this.BASE;
	}

	public String getType() {
		return this.getClass().toString();
	}

	public void setSalary(double additionalPayrate) {
		if (additionalPayrate < 1)
			throw new IllegalArgumentException("Rate less then 1");
		this.salary = BASE + additionalPayrate;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int compareTo(Employee pi) {
		if (pi == null)
			throw new IllegalArgumentException("pi is null");
		Double e1 = this.salary;
		Double p2 = pi.salary;

		if (this.getType() == pi.getType()) {
			return e1.compareTo(p2);
		} else {
			return this.getType().compareTo(pi.getType()); // this.class.compareTo(pi.class);
		}
	}

	public abstract void report();
}
