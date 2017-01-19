package cscd211Enums;

public enum VehicleManufacturers {
	CHRYSLER, FORD, HONDA, MERCEDES, NISSAN, TOYOTA, VOLKSWAGON;
	
	@Override
	public String toString()
	{
		String output1 = this.name().toLowerCase();
		String output = output1.substring(0, 1).toUpperCase() + output1.substring(1);
		return output;
		
	}
}