package cscd211Methods;



import java.util.Scanner;

import cscd211Classes.Inventory;
import cscd211Classes.InventoryItem;

public class Lab5Methods {
	public static int menu(Scanner kb)
	{
		if(kb == null) throw new IllegalArgumentException("Scanner is null");
		System.out.println("1) Print the Store Inventory");
		System.out.println("2) Sort the inventory by using the Natural Order");
		System.out.println("3) Sort the inventory by the SKU using a comparator" );
		System.out.println("4) Sort the inventory by the Price using a comparator");
		System.out.println("5) Quit");
		int input;
		do{
			input = Integer.parseInt(kb.nextLine());
			System.out.println("Please enter a valid int (1-5)");
			
		}while(input <= 0 || input >= 5);
			return input;
	}
	
	public static Inventory populateInventory(java.util.Scanner fin)
	{
		if(fin==null) throw new IllegalArgumentException("Fin is null");
		   
		 int count = fin.nextInt();
		 
		 Inventory Inventorylist=new Inventory(count);
		 fin.nextLine();
		  
		 for(int ix=0; ix<count;ix++){
			 String name= fin.nextLine();
		     String SKU=fin.nextLine();
		     String Quanity=fin.nextLine();
		     String price=fin.nextLine();
		     int Sku1=Integer.parseInt(SKU);
		     int quan=Integer.parseInt(Quanity);
		     double price1=Double.parseDouble(price);
		     Inventorylist.addInventoryItem( new InventoryItem(name,Sku1,quan,price1));
	   

		  }
		  
		  return Inventorylist;
	}

}
