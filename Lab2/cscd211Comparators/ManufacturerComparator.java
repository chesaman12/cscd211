package cscd211Comparators;

import java.util.Comparator;

import cscd211Classes.Vehicle;
import cscd211Enums.VehicleManufacturers;

public class ManufacturerComparator  implements Comparator <Vehicle>
{
	public int compare(Vehicle v1, Vehicle v2){
		
	if (v1 == null || v2 == null) throw new IllegalArgumentException("No vehicle");
	VehicleManufacturers veh1 = (v1).getManufacturer();
	VehicleManufacturers veh2 = (v2).getManufacturer();
	return veh1.compareTo(veh2);
	}
}
