package cscd211Game.Players;

import java.util.Arrays;

import cscd211Enums.Value;
import cscd211Game.Classes.Card;

public class Player {
	private int count;
	private Card[] hand;
	private String name;
	
	public Player(String name, int totalcards)
	{
		this.hand = new Card [totalcards];
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void giveCard(Card card)
	{
		if( card == null) throw new IllegalArgumentException("Card is null");
	
		this.hand[count++] = card;
		//The giveCard method places a card into the player's hand	
	}
	
	public Card getCard (int cardNum)
	{
		if(cardNum < 0 || cardNum > hand.length) throw new IllegalArgumentException("Hand out of bounds");
		return this.hand[cardNum];
	}
	
	public int getHandTotal()
	{
		 int total = 0;
		  for (int ix = 0; ix < hand.length; ix ++) {
		Card card = this.hand[ix];
		if(card != null){
			total += card.getCardValue().getValueRank();
		}
		  }
		  return total;
		//The getHandTotal calculates the total score of the cards in the players hand. 
		//The hand contains individual cards. You will need to grab the value enumerated type and then grab the specific values rank
		//return int - Representing the total score of the player's hand
	}
	
	public int getTotalCards()
	{
		return hand.length;
	}
	
	public void resetPlayerHand()
	{
		hand = null;
		count = 0;
	}

	@Override
	public String toString() {
		return name + " {hand=" + Arrays.toString(hand).replaceAll("[\\[\\]]+", "") + "}";
	}

	
}
