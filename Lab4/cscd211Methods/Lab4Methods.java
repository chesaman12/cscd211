package cscd211Methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Lab4Methods {
	public static void addNum(ArrayList<Double> myAList, Scanner kb) 
	{
		if(kb == null) throw new IllegalArgumentException("Scaner is null");
		System.out.println("Enter a number bewteen 0 and 100: ");
		double ui = Double.parseDouble(kb.next());
		if(ui > 0 && ui <= 100){
			myAList.add(ui);
			myAList.trimToSize();
		}
	//The addNum method prompts the user to enter a number that is between 0 and 100 inclusive. 
	}
	
	public static double computeMean(ArrayList<Double> myAList)
	{
		int count = 0;
		int sum = 0;
		 if(!(myAList.isEmpty())){
			 for(int ix = 0; ix < myAList.size(); ix++)
				 count += myAList.get(ix);
			 {
				 sum = count/myAList.size();
			 }
		 }
		 return sum;
	//The computeMean calculates the mean value of the array list. 
	}
	
	public static double computeMedian(ArrayList<Double> myAList)
	{
		if(myAList == null) throw new IllegalArgumentException("List is null");
		if(myAList.isEmpty()) throw new IllegalArgumentException("List is empty");
		
		Collections.sort(myAList);
		int listSum = myAList.size();
		if(listSum % 2 == 1){ //odd median loop
			int middle = listSum / 2;
			return myAList.get(middle);
		}else{
			int middle1 = listSum / 2;
			int middle2 = (listSum / 2) - 1;
			double median = myAList.get(middle1) + myAList.get(middle2);
			return median / 2;
		}
	//The computeMean calculates the median value of the ArrayList. 
	}
	
	public static double computeMidpoint(ArrayList<Double> myAList) 
	{
		if(myAList == null) throw new IllegalArgumentException("List is null");
		if(myAList.isEmpty()) throw new IllegalArgumentException("List is empty");
		
		Collections.sort(myAList);
		double first = myAList.get(0);
		double last = myAList.get(myAList.size() - 1);
		
		double midpoint = first + last;
		return midpoint / 2;
	//The computeMidpoint calculates the midpoint value of the ArrayList. 
	}
	
	public static double computeStandardDeviation(ArrayList<Double> myAList) 
	{
		if(myAList == null) throw new IllegalArgumentException("List is null");
		if(myAList.isEmpty()) throw new IllegalArgumentException("List is empty");
		
		double mean = computeMean(myAList);
		
		//double devAList = new ArrayList<Double>(0); //TODO fix array not sure what goes instead of 0
		
		for(int ix = 0; ix < myAList.size(); ix++){
			double temp = myAList.get(ix);
			//devAList = temp - mean; 
		}
	/*The computeStandardDeviation calculates the amount of variation form the average 
	Compute the mean of the ArrayList 
	Create a new ArrayList of deviations by subtracting the mean from each member from the original ArrayList. */
		return mean;
	}
	
	public static void deleteValue(ArrayList<Double> myAList, Scanner kb) 
	{
		if(kb == null || myAList == null) throw new IllegalArgumentException("Scanner or list is null");
		if(myAList.size() < 1) throw new IllegalArgumentException("Empty list");
		
		System.out.println("What value would you like to remove? ");
		double ui = Double.parseDouble(kb.next());
		if(myAList.contains(ui)){
			if(ui > 0 && ui <= 100){
				myAList.remove(ui);
				myAList.trimToSize();
				System.out.println(ui + " Has been removed.");
			}
		}else{
			System.out.println("Value does not eist");
		}
		
		
	//The deleteValue prompts the user for a value that may be in the array list and removes the item from the array list. 
	}
	
	public static void deleteValueByIndex(ArrayList<Double> myAList, Scanner kb) 	
	{
		if(kb == null || myAList == null) throw new IllegalArgumentException("Scanner or list is null");
		if(myAList.size() < 1) throw new IllegalArgumentException("Empty list");
		
		System.out.println("What index would you like to remove? ");
		double ui = Double.parseDouble(kb.next());
		if(ui > 0 && ui < myAList.size()){
			myAList.remove(ui - 1);
			myAList.trimToSize();
		}
	//The deleteValueByIndex prompts the user for an index value and removes the item at that index from the array list. 
	}
	
	public static void fillArrayList(int size, ArrayList<Double> myAList) 
	{
		if(myAList == null) throw new IllegalArgumentException("List is null");
		if(myAList.size() < 0)throw new IllegalArgumentException("List is empty");
		
		Random rand = new Random();
		for(int ix = 0; ix <= size; ix++){
			Double d = 100 * rand.nextDouble(); //rangeMin + (rangeMax - rangeMin) * d.nextDouble();
			myAList.add(d);
		}
	//The fillArrayList method fills the ArrayList with random Double values between 0 and 100 inclusive. 
	}
	
	public static int menu(java.util.Scanner kb)
	{
		if(kb == null) throw new IllegalArgumentException("Scanner is null");
		
		System.out.println("1) Add a value to the ArrayList ");
		System.out.println("2) Delete a value from the ArrayList (by value) ");
		System.out.println("3) Delete a value from the ArrayList (by index/location) ");
		System.out.println("4) Display the ArrayList ");
		System.out.println("5) Compute the mean of the ArrayList ");
		System.out.println("6) Compute the median of the ArrayList ");
		System.out.println("7) Compute the midpoint of the ArrayList");
		System.out.println("8) Compute the standard deviation of the ArrayList ");
		System.out.println("9) Quit ");
		System.out.println("--------------");
		
		
		
		int ui;
		do{
			System.out.println("Enter an int between 1 and 9: ");
			ui = Integer.parseInt(kb.next());
		}while(ui < 0 || ui > 9);
		return ui;
	//The menu method guarantees that a menu choice between 1 and 9 inclusive is entered. 
		
	}
	
	public static void printArrayList(ArrayList<Double> myAList) 
	{
		if(myAList == null) throw new IllegalArgumentException("List is null");
		
		for(int ix = 0; ix < myAList.size(); ix++){
			System.out.println(myAList.get(ix));
		}
		
		//The printArrayList prints the contents of the list out in the following format [#, #, #] 
		//(This is the standard format when printing an ArrayList object) or empty list if the list size is 0 
	}
	
	public static void printResults(String type, double value) 
	{
		if(type == null) throw new IllegalArgumentException("String is null");
		if(type.isEmpty()) throw new IllegalArgumentException("String is empty");
		
		//TODO not sure what to do here......
	//The printResults prints the message and the results of the calculation. 
	}
	
	public static int readNum(Scanner kb) 
	{
		if(kb == null) throw new IllegalArgumentException("Scanner is null");
		int ui;
		do{
			System.out.println("Enter a positive int: ");
			ui = Integer.parseInt(kb.next());
		}while(ui < 0);
		return ui;
	//The readNum method prompts and ensures the user will enter a positive number that is at least 1 
	}
}
