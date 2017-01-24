package cscd211Classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cscd211Comparators.InventoryPriceComparator;
import cscd211Comparators.InventorySKUComparator;

public class Inventory {
	private ArrayList<InventoryItem> inventory;
	public static final int DEFAULT_ITEMS = 5; 
	
	public Inventory()
	{
		inventory = new ArrayList<InventoryItem>(DEFAULT_ITEMS);
	}
	
	public Inventory(int total)
	{
		inventory = new ArrayList<InventoryItem>(total);
	}
	
	public void addInventoryItem(InventoryItem item)
	{
		if(item == null) throw new IllegalArgumentException("item is null");
		//This method adds an InvenotryItem to the stores inventory. This addition ensures a very deep copy
		this.inventory.add(new InventoryItem(item.getItem().getName(), item.getItem().getSKU(), item.getQuantity(), item.getPrice()));
	}
	
	@Override
	 public String toString () {
	  StringBuffer sb = new StringBuffer ();
	  for (int ix = 0; ix < inventory.size(); ix ++) {
	   sb.append(inventory.get(ix) + "\n");
	  }
	  return sb.toString();
	 }
	
	public InventoryItem getInventoryItem(int index)
	{
		if(index < 0 || index >= inventory.size()) throw new IllegalArgumentException("index out of bounds");
			InventoryItem itemindex=this.inventory.get(index);
		    return new InventoryItem(itemindex.getItem().getName(),itemindex.getItem().getSKU(),itemindex.getQuantity(),itemindex.getPrice());
		//Since we are using an ArrayList under the hood we need to know the index value of the InventoryItem we are retrieving
		//The InventoryItem returned will be a deep copy
		
	}
	
	public int size()
	{
		return this.inventory.size();
	}
	
	public void sortInventory()
	{
		Collections.sort(inventory);
	}
	
	public void sortInventoryBySKU()
	{
		Collections.sort(inventory,new InventorySKUComparator());
	}
	
	public void sortInventoryByPrice()
	{
		Collections.sort(inventory,new InventoryPriceComparator());
	}
}
