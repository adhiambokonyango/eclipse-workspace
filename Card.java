package cardShufflingSimulation;

public class Card {
private final String face; //face of card ("ace, jack")
private final String suit; // hearts, diamonds

// two argument constructor initializes face and suit
public Card (String cardFace, String cardSuit)
{
this.face = cardFace; //initialize face of card
this.suit = cardSuit; //initialize suit of card
}

//return string representation of card
public String toString()
{
return face + "of" + suit;	
}//end method 

}//end class
