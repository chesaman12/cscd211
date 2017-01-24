package cscd211Comparators;

import java.util.Comparator;

import cscd211Classes.InventoryItem;

public class InventoryPriceComparator implements Comparator <InventoryItem>{
	public int compare(InventoryItem i1, InventoryItem i2)
	{
		if(i1 == null || i2 == null) throw new IllegalArgumentException("item is null");
		Double item1 = (i1).getPrice();
		Double item2 = (i2).getPrice();
		return item1.compareTo(item2);
	}
	
}
