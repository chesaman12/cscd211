package cscd211Enums;

public enum Value {
	ACE(1,"Ace"), TWO(2,"2"), THREE(3,"3"), FOUR(4,"4"), FIVE(5,"5"), SIX(6, "6"), SEVEN(7, "7"), EIGHT(8,"8"), NINE(9,"9"), TEN(10, "10"), JACK(11,"Jack"), QUEEN(12,"Queen"), KING(13,"King"); 
	private String name;
	private int rank;
	
	private Value(int rank, String name)
	{
		this.rank = rank;
		this.name = name;
	}
	
	public Value getValue()
	{
		return valueOf(name);
	}
	
	public int getValueRank()
	{
		return this.rank;
	}
	
	public String getValueName()
	{
		return this.name;
	}
	
	public String toString()
	{
		return this.name;
	}
}
