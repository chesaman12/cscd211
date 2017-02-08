package cscd211Inheritance;

public class Lawyer extends Employee {
	private int stockOptions;

	public Lawyer(String name, double basePayrate, double additionalPayrate, int stockOptions) {
		super(name, basePayrate, additionalPayrate);
		if (stockOptions < 1)
			throw new IllegalArgumentException("stockOptions less then 1");
		this.stockOptions = stockOptions;
	}

	public int getStockOptions() {
		return this.stockOptions;
	}

	public void setStockOptions(int stockOptions) {
		this.stockOptions = stockOptions;
	}

	@Override
	public void report() {
		System.out.println("I am an Lawyer. I make " + super.getBaseSalary() + " and I have " + this.stockOptions
				+ " shares of stock.");

	}

	@Override
	public String toString() {
		return "Lawyer: " + super.toString();
	}

}
