package week06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	List<Card> cards= new ArrayList<>();
	 String suits[]={"Spade", "Hearts", "Clubs", "Diamonds"};
	 
	 public Deck() { // contructor
		 int numbers[]= {2,3,4,5,6,7,8,9,10,11,12,13,14};
	        for (String suit:suits){
	            int count=2;
	            for (int number:numbers){
	                cards.add(new Card(number, suit));
	                count++;
	            }
	    }
}
	 public void describe() {
		 for(Card card:this.cards) {
			 card.describe();
		 }
	 }


public void shuffle() { // it will shuffle the card
	Collections.shuffle(cards);
	}
public Card draw() { // it removes the card and return to the top
	Card card=cards.remove(0);
	return card;
}

}
