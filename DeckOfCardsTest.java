package cardShufflingSimulation;

public class DeckOfCardsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DeckOfCards myDeckOfCards =  new DeckOfCards();
myDeckOfCards.shuffle();//place cards in random order
//print all 52 cards in the order in which they are dealt with
for (int i = 1; i <= 52; i++)
{
//deal and display
	System.out.printf("%-19s", myDeckOfCards.dealCard());
	
	if (i %4 == 0)
		System.out.println();
}
	}//end main

}//end class
