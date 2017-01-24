package cscd211Methods;

import java.util.Scanner;

import cscd211Classes.Vehicle;
import cscd211Enums.VehicleManufacturers;

public class Lab2Methods {
	public static int menu(Scanner kb)
	{
		if(kb == null)
			throw new IllegalArgumentException("Scanner is null");
		
		System.out.println("1) Print the array");
		System.out.println("2) Sort the array based on the natural"); 
		System.out.println("3) Sort the array by imposing a total order by calling the compare method in the ManufacturerComparator class "); 
	    System.out.println("4) Sort the array by imposing a total order by calling the compare method in the ModelComparator class "); 
	    System.out.println("5) Print the array to a file"); 
		System.out.println("6) Quit the program");
		System.out.println("");
		System.out.println("Enter an int between 1-6");
		int input = Integer.parseInt(kb.next());
		kb.nextLine();
		
		if(input > 6 || input < 1 )
			throw new IllegalArgumentException("Please enter a valid int (1-6)");
			
	return input;
	}
	public static Vehicle[] fillArray(Scanner fin, int total)
	{
		if(fin == null || total < 0)
			throw new IllegalArgumentException("Scanner is null or not enough lines in file");
		
		Vehicle[] vehicles = new Vehicle[total];
		
		for(int ix = 0; ix < vehicles.length; ix++)
		{
			String name = fin.nextLine();
			String model = fin.nextLine();
			String cylinder = fin.nextLine();
			String liter = fin.nextLine();
			int cyl = Integer.parseInt(cylinder);
			double li = Double.parseDouble(liter);
			VehicleManufacturers covname = convertStringToVehicleManufacturers(name);
			
			vehicles[ix] = new Vehicle(covname, model, cyl, li);
		}
		return vehicles;
	}
	
	public static VehicleManufacturers convertStringToVehicleManufacturers(String manufacturer)
	{
		if(manufacturer == null || manufacturer.isEmpty())
			throw new IllegalArgumentException("File is empty");
		
		String upperman = manufacturer.toUpperCase();
		
		VehicleManufacturers man = VehicleManufacturers.valueOf(upperman);
		return man;
	}
}
