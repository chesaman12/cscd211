package cscd211Inheritance;

public class Programmer extends Employee {
	private boolean busPass;

	public Programmer(String name, double basePayrate, double additionalPayrate, boolean busPass) {
		super(name, basePayrate, additionalPayrate);
		this.busPass = busPass;
	}

	public boolean getBusPass() {
		return this.busPass;
	}

	public void setBussPass(boolean busPass) {
		this.busPass = busPass;
	}

	@Override
	public void report() {
		if (this.busPass == true) {
			System.out.println("I am  a programmer. I get " + super.getBaseSalary() + " and I get a buspass.");
		} else {
			System.out.println("I am  a programmer. I get " + super.getBaseSalary() + " and I do not get a buspass.");
		}
	}

	@Override
	public String toString() {
		return "Programmer: " + super.toString();
	}

}
