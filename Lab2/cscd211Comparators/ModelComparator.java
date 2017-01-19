package cscd211Comparators;

import java.util.Comparator;

import cscd211Classes.Vehicle;

public class ModelComparator implements Comparator <Vehicle>
{
	public int compare(Vehicle v1, Vehicle v2){
			
	if (v1 == null || v2 == null) throw new IllegalArgumentException("No vehicle");
	String veh1 = (v1).getModel();
	String veh2 = (v2).getModel();
	return veh1.compareTo(veh2);
	}
}

