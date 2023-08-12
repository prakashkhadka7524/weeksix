package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	public Player(String name, List<Card> hand, int score) { // constructor with all elements
		this.hand=hand;
		this.name=name;
		this.score=score;
			}
	public Player() { // default constructor
			}
	
	public void draw(Deck deck) {  // call from the deck class
		hand.add(deck.draw());
	}
	public Card flip() { // removes and return to the  top
		return hand.remove(0);
	}
	public void incrementscore() { // whoever win it will increase the score
		 score++;
	}
	// Getters and Setters method
	
	public List<Card> getHand() {
		return hand;
	}
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
