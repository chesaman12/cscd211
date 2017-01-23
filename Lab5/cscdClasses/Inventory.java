package cscdClasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventory {
	private ArrayList<InventoryItem> inventory;
	public static final int DEFAULT_ITEMS = 5; 
	
	public Inventory()
	{
		inventory = new ArrayList<InventoryItem>(DEFAULT_ITEMS);
	}
	
	public Inventory(int total)
	{
		inventory = this.inventory(total);
	}
	
	public void addInventoryItem(InventoryItem item)
	{
		if(item == null) throw new IllegalArgumentException("item is null");
		
		//This method adds an InvenotryItem to the stores inventory. This addition ensures a very deep copy
	}
	
	@Override
	public String toString()
	{
		return null;
		
	}
	
	public InventoryItem getInventoryItem(int index)
	{
		if(index < 0 || index >= this.DEFAULT_ITEMS) throw new IllegalArgumentException("index out of bounds");
		return null;
		//Since we are using an ArrayList under the hood we need to know the index value of the InventoryItem we are retrieving
		//The InventoryItem returned will be a deep copy
	}
	
	public int size()
	{
		return this.DEFAULT_ITEMS;
	}
	
	public void sortInventory()
	{
		Collections.sort(inventory);
	}
}
