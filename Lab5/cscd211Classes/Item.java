package cscd211Classes;

public class Item implements Comparable <Item>{
	private String name;
	private int SKU;
	public Item(String name, int SKU)
	{
		name = this.name;
		SKU = this.SKU;
	}
	
	@Override
	 public String toString() {
	  return this.name + " - " + this.SKU;
	 }
	
	@Override
	public int compareTo(Item anotherItem)
	{
		int name = this.name.toString().compareTo(anotherItem.name.toString());
		Integer SKU1 = this.SKU;
		Integer SKU2 = anotherItem.SKU;
		int SKU = SKU1.compareTo(SKU2);
		if(name != 0){
			return name;
		}else{
			return SKU;
		}
		
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getSKU()
	{
		return this.SKU;
	}
	

}
