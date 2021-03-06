package cscd211Game.Classes;

import java.util.Random;

import cscd211Utils.ArrayUtils;

public class Deck{
	private Card[] cards;
	private int count;
	
	public Deck(Card[] cards)
	{
		if(cards == null) throw new IllegalArgumentException("Array is null");
		this.cards = new Card[cards.length];
		for(int ix =0; ix < cards.length; ix++){
			this.cards[ix] = new Card(cards[ix].getCardSuit(),cards[ix].getCardValue());
		}
		
	}
	
	public String toString()
	{
		/*String scard = "";
		for(int ix = 0; ix < cards.length; ix++)
			scard = cards[ix];*/
		 StringBuffer sb = new StringBuffer();
		  for (int ix = 0; ix < cards.length; ix ++) {
		   sb.append(cards[ix] + "\n");
		  }
		  return sb.toString();
	}
	
	public void resetDeck()
	{
		ArrayUtils.selectionSort(this.cards);
	}
	
	public void shuffle(int times)
	{
		if(times < 1) throw new IllegalArgumentException("Deck must be shuffled more then once");
		Random rand = new Random();
		for(int counter = 0; counter <= times; counter ++){
			for(int ix = 0; ix < this.cards.length; ix++){
				int randNum = rand.nextInt(this.cards.length);
				Card temp = this.cards[ix];
				this.cards[ix] = this.cards[randNum];
				this.cards[randNum] = temp;
						
			}
		}
		
	}
	
	public Card getNextCard()
	{
		Card tempcard=this.cards[count];
		this.count++;
		return tempcard;
	}
	
	public int getTotalCards()
	{
		return cards.length;
	}
	
	public int getCount()
	{
		return this.count;
	}

}
