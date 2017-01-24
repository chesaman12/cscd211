package cscd211Classes;


public class InventoryItem implements Comparable <InventoryItem>{
	private Item item;
	private double price;
	private int quantity;
	public InventoryItem(String name, int SKU, int quantity, double price)
	{
		item = new Item(name,SKU);
		this.quantity = quantity;
		this.price = price;
	}
	
	@Override 
	public int compareTo(InventoryItem anotherItem)
	{
		int item = this.item.compareTo(anotherItem.item);
		Integer quantity1 = this.quantity;
		Integer quantity2 = anotherItem.quantity;
		int quantity = quantity1.compareTo(quantity2);
		Double price1 = this.price;
		Double price2 = anotherItem.price;
		int price = price1.compareTo(price2);
		if(item != 0){
			return item;
		}else if( quantity != 0){
			return quantity;
		}else{
			return price;
		}
	}
	
	public int getQuantity()
	{
		return this.quantity;
	}
	
	public double getPrice()
	{
		return this.price;
	}
	
	public Item getItem()
	{
			return new Item(this.item.getName(),this.item.getSKU());		 
	}
	
	@Override
	 public String toString() {
	  return ("Name: " + this.item.getName() + "\nSKU: " + this.item.getSKU() + "\nQuantity: " + this.getQuantity() + "\nPrice: " + this.getPrice());
	 }
			
	
}
