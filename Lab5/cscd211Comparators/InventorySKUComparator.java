package cscd211Comparators;

import java.util.Comparator;

import cscd211Classes.InventoryItem;


public class InventorySKUComparator implements Comparator <InventoryItem>{
	public int compare(InventoryItem i1, InventoryItem i2)
	{
		if(i1 == null || i2 == null) throw new IllegalArgumentException("item is null");
		Integer SKU1 = (i1).getItem().getSKU();
		Integer SKU2 = (i2).getItem().getSKU();
		
		return SKU1.compareTo(SKU2);
	}

}
