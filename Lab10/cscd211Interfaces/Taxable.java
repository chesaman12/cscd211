package cscd211Interfaces;

public interface Taxable {
	static double BASE_TAX_RATE = 0.068;

	public abstract double calculateTaxes();
}
