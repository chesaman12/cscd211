package cscd211Classes;

import cscd211Enums.VehicleManufacturers;

public class Vehicle implements Comparable <Vehicle>
{
	private Integer cylinders;
	private double liters;
	private VehicleManufacturers manufacturer;
	private String model;
	public Vehicle(VehicleManufacturers manufacturer, String model,Integer cylinders, double liters)
	{
		if(model == null || model.isEmpty() || liters < 1 || cylinders == null || cylinders <= 0)
			throw new IllegalArgumentException("Bad parameters");
		this.manufacturer = manufacturer;
		this.model = model;
		this.liters = liters;
		this.cylinders = cylinders;
	}
	public Vehicle(VehicleManufacturers manufacturer, String model, double liters, Integer cylinders)
	{
		if(model == null || model.isEmpty() || liters < 1 || cylinders == null || cylinders <= 0)
			throw new IllegalArgumentException("Bad parameters");
		this.manufacturer = manufacturer;
		this.model = model;
		this.liters = liters;
		this.cylinders = cylinders;		
	}
	
	public VehicleManufacturers getManufacturer()
	{
		return this.manufacturer;
	}
	
	public String getModel()
	{
		return this.model;
	}
	
	@Override
	public int compareTo(Vehicle anotherVehicle) {
		int man = this.manufacturer.toString().compareTo(anotherVehicle.manufacturer.toString());
		int mod = this.model.compareTo(anotherVehicle.model);
		int cyl = this.cylinders.compareTo(anotherVehicle.cylinders);
		Double liter1 = this.liters;
		Double liter2 = anotherVehicle.liters;
		int lit = liter1.compareTo(liter2);
		
		if(man != 0)
			return man;
		else if( mod != 0)
			return mod;
		else if(cyl != 0)
			return cyl;
		else
			return lit;
	}
	
	@Override
	public String toString()
	{
		
		return "Your " + this.manufacturer.toString() +" " +this.model +" is a "+ this.cylinders+ " banger with a " + liters + " liter engine.";
		
	}
}
