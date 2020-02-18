package cardShufflingSimulation;

import java.security.SecureRandom;

//represents deck of playing cards
public class DeckOfCards {
private Card[] deck; //array of cards assigned to deck
private int currentCard; //index of next card to be dealt with 0_51
private static final int NUMBER_OF_CARDS = 52; //number of cards

//random number generator
private static final SecureRandom randomNumbers = new SecureRandom();

//constructor fill deck of cards
public DeckOfCards()
{
String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
		"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
deck = new Card[NUMBER_OF_CARDS]; //created array of card objects
currentCard = 0; //first card dealt with will be deck[0]

//populate deck with cards
for(int count = 0; count < deck.length; count++)
	deck[count] = new Card(faces[count%13], suits[count/13]);
}//end constructor

//shuffle with one pass algorithmn
public void shuffle()
{
currentCard = 0;
//for each card pick another random card and swap them
for (int first = 0; first < deck.length; first++)
{
//select random number
	int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
	//swap current card with second card
	Card temp = deck[first];
	deck[first] = deck[second];
	deck[second] = temp;
}
}//end shuffle

//deal one card
public Card dealCard()
{
//determine whether cards remain to be dealt
	if(currentCard < deck.length)
		return deck[currentCard++];//return current card in array
	else
		return null; //indicate all cards were dealt
}// end method
}//end class
