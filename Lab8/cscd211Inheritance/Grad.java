package cscd211Inheritance;

public class Grad extends Student {

	public Grad(String name, int id) {
		super(name, id);

	}

	@Override
	public String toString() {
		return "Grad-- " + super.toString();
	}

}
