package cscd211Game.Classes;

import cscd211Enums.Suit;
import cscd211Enums.Value;

public class Card implements Comparable<Card>{
	private Suit suit;
	private Value value;

	public Card(Suit suit, Value value)
	{
		this.suit = suit;
		this.value = value;
	}
	
	public Value getCardValue()
	{
		return this.value;
	}
	
	public Suit getCardSuit()
	{
		return this.suit;
	}
	
	
	@Override
	public String toString() {
		//The Value call to toString + of + the Suit call to toString
		// "3 of hearts"
		return value + " of " + suit;
	}

	@Override
	public int compareTo(Card anotherCard) {
		if( anotherCard == null) throw new IllegalArgumentException("Card is null");
		if(this.getCardSuit() != anotherCard.getCardSuit()){
			return this.getCardSuit().compareTo(anotherCard.getCardSuit());
		}else{
			return this.getCardValue().compareTo(anotherCard.getCardValue());
		}
			
	}
	
}
