package cscd211Classes;

public class Store {
	private Inventory inventory;
	private String name;
	
	public Store(String name, Inventory inventory){
		if(name == null || inventory == null) throw new IllegalArgumentException("name or inventory is null");
		this.inventory = inventory;
		this.name = name;
	}
	
	public String toString(){
		return this.name + "\n" + this.inventory;
	}
	
	public void sortInventory()
	{
		this.inventory.sortInventory();
	}
	public void sortInventoryBySKU()
	{
		this.inventory.sortInventoryBySKU();
	}
	public void sortInventoryByPrice()
	{
		this.inventory.sortInventoryByPrice();
	}
}
