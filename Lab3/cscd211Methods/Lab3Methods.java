package cscd211Methods;

import java.io.PrintStream;
import java.util.Scanner;

import cscd211Enums.Suit;
import cscd211Enums.Value;
import cscd211Game.Classes.Card;
import cscd211Game.Classes.Deck;
import cscd211Game.Players.Player;

//hi there
public class Lab3Methods {

	public static boolean goAgain(Scanner kb)
	{
		if(kb == null) throw new IllegalArgumentException("Scanner is null");
		System.out.println("Would you like to play again (yes or no)? ");
		String ui = kb.nextLine();
		
		if(ui.equalsIgnoreCase("yes")){
			return true;
		}else if(ui.equalsIgnoreCase("no")){
			return false;
		}else{
			throw new IllegalArgumentException("Enter a valid input please (yes or no).");
		}
	} 
	
	public static Player[] createPlayers(int totalPlayers, int totalCards, Scanner kb)
	{
		//The createPlayers method prompts the player for their name and
		//creates a Player object and places it into an array of type Player
		if (kb == null || totalPlayers < 1 || totalCards < 1) throw new IllegalArgumentException ("Bad parameters");
		
		Player[] player = new Player[totalPlayers];
		 for (int ix = 0; ix < totalPlayers; ix ++) {
			   System.out.print("Enter the name of player " + (ix + 1) + ": ");
			   String name = kb.nextLine();
			   player[ix] = new Player(name, totalCards);
			  }
			  return player;
	}
	
	public static int readTotalPlayers(Scanner kb)
	{
		System.out.println("How many players will be playing? ");
		int playercount = Integer.parseInt(kb.nextLine());
		System.out.println(playercount);
		return playercount;
	}
	
	public static Card[] createCards()
	{
		Card[] cards = new Card[52];
		int counter = 0;
		
		for (Suit suit : Suit.values()) {
		    for (Value rank : Value.values()) {
		    	cards[counter] = (new Card(suit, rank));
		           counter++;
		       }
		                
		  }
		return cards;
		
	}
	
	public static Card[] createCards(int total, int suitsPer, int... cardValues)
	{
		if (total <= 0 || suitsPer <= 0 || cardValues == null) throw new IllegalArgumentException ("Bad Parameters");
		Card[] cards = new Card[total];
		int counter = 0;
		for (Suit suit : Suit.values()) {
			for (int ix = 0; ix < cardValues.length; ix ++) {
				for (int x = 0; x < suitsPer; x ++) {
					cards [counter] = new Card (suit, Value.values()[cardValues[ix] - 1]);
					counter ++;
				}
			}
		}
		return cards;
	}
	
	public static void printDeck(Deck deck, PrintStream fout, String message)
	{
		if(message.isEmpty()) throw new IllegalArgumentException ("Message is empty");
		if(deck == null || fout == null || message == null) throw new IllegalArgumentException ("null Parameters");
		for (int ix = 0; ix < deck.getTotalCards(); ix ++) {
			fout.println(message + deck.getNextCard());
		}
	}
	
	public static int readTimesToShuffle(Scanner kb)
	{
		if(kb == null) throw new IllegalArgumentException ("null Parameters");
		int shuffler = 0;  
		do {
			System.out.print("Enter how many times do you want to shuffle: ");
			shuffler = Integer.parseInt(kb.nextLine());
		}while (!(shuffler > 0));
			  return shuffler;
	}
	
	 public static int readMaxPlayerCards(Scanner kb) 
	 {
		  if (kb == null) throw new IllegalArgumentException ("Scanner is null");
		  int maxCards = 0;
		  
		  do {
		   System.out.print("Enter the max number of cards a player can have: ");
		   maxCards = Integer.parseInt(kb.nextLine());
		  }while (!(maxCards >= 1));
		  return maxCards;
	}
		 
	public static int readCardsToDeal (Scanner kb, int maxPlayerCards) 
	{
		System.out.println(maxPlayerCards);
		if (kb == null || maxPlayerCards < 1) throw new IllegalArgumentException ("Bad parameters");
		int deal = 0;
		do {
			System.out.print("Enter how many cards you want to deal to each player: ");
			deal = Integer.parseInt(kb.nextLine());
		}while(!(deal > 0 && deal <= maxPlayerCards));
		return deal;
	}
	
	
	
}
