package cscd211Game.Players;

import cscd211Game.Classes.Deck;

public class Dealer {
	private int cardsToDeal;
	private Deck deck;
	private Player[] players;
	
	public Dealer(Player[] players, Deck deck, int cardsToDeal)
	{
		if(players == null || deck == null || cardsToDeal < 1) throw new IllegalArgumentException("null players, deck or deal more cards");
		this.cardsToDeal = cardsToDeal;
		this.deck = deck;
		this.players = players;
	}
	
	public void deal()
	{
		for(int i  = 0; i < players.length; i++)
		{
			//TODO - you might not need a for loop
			for(int ix = 0; ix < cardsToDeal; ix++)
			{
				players[i].giveCard(deck.getNextCard());
			}
		}
	}
	
	public void displayHand()
	{
		for(int p = 0; p < players.length; p++)
		{
			System.out.println(players[p]);
//			for(int c = 0; c < players[p].getTotalCards(); c ++) {
//			   System.out.print(", " + players[p].getCard(c));
//			   }
//		System.out.println(" " + players[p].getHandTotal() + " total");
		}
	}
	
	public boolean cardsRemaining()
	{
//		if(this.cardsToDeal * this.players.length <= deck.getTotalCards() - deck.getCount() - deck.getCount() - (this.cardsToDeal * this.players.length)){
//			   return true;
//		  }
		
		int sumCards = 0;
		for (int i = 0; i < players.length; i++) {
			sumCards += players[i].getTotalCards();
		}
		
		if(this.cardsToDeal * this.players.length > sumCards ){
			   return true;
		  }
		  return false;
	}
	
	public void reset()
	{
		for(int ix = 0; ix < players.length; ix++){
			players[ix].resetPlayerHand();
		}
		deck.resetDeck();
	}
	
	public void determineWinner()
	{
		//winner is greatest totalcards sum
		 int winningScore = 0;
		 int counter = 0;
		 for (int ix = 0; ix < players.length; ix ++) {
			 if (players[ix].getHandTotal() > winningScore) {
				 winningScore = players[ix].getHandTotal();
			 }
		 }
		  
		 for (int ix = 0; ix < players.length; ix ++) {
			 if (players[ix].getHandTotal() == winningScore) {
				 counter ++;
			 }
		 }
		  
		 if (counter > 1) {
			 System.out.println("It's a tie");
		 }
		 else {
			 for (int ix = 0; ix < players.length; ix ++) {
				 if (players[ix].getHandTotal() == winningScore) {
					 System.out.println(players[ix].getName() + " wins with a score of " + winningScore);
				 }
			 }		
		 }
	}
	
}
