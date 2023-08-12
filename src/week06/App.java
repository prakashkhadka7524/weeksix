package week06;

public class App {

	public static void main(String[] args) {
		//instantiate a Deck class
		Deck deck= new Deck();
		System.out.println("All the 52 cards are : ");
		deck.describe(); // call describe method to know all the cards
		System.out.println("------------------------------");
		System.out.println("All the shuffled cards are : ");
		deck.shuffle(); // calling the method it will shuffle the card
		deck.describe();
		System.out.println("-------------------------------");
		// instantiate the player class
		Player player1= new Player();
		Player player2= new Player();
		// set the name of players
		player1.setName("Prakash"); 
		player2.setName("Archana");
		// iterate 52 times calling the 
		//Draw method on the other player each iteration using the Deck you instantiated.
		for(int i=0; i<52; i++) {
			if(i%2==0) {
				player1.draw(deck); 
			}
			else  {
				player2.draw(deck); 
			}
		
		}
	int round=1;
	//  iterate 26 times and call the flip method for each player.
		for(int j=0; j<26; j++) {
			System.out.println("Round "+ round+ " of 26");
			Card card1= player1.flip();
			Card card2=player2.flip();
			System.out.println(player1.getName()+" plays :");
			card1.describe();
			System.out.println(player2.getName()+" plays :");
			card2.describe();
			
		// comparing the each round 

			if(card1.getValue()>card2.getValue()) {
				player1.incrementscore();
				System.out.println(player1.getName()+" wins the round");
			}
			else if(card2.getValue()>card1.getValue()) {
				player2.incrementscore();
				System.out.println(player2.getName()+" wins the round");
			}
			else {
				System.out.println("Its a tie!");
			}
		
		}
		//compare the final score from each player
		int player1FinalScore=player1.getScore();
		System.out.println("Final score of "+player1.getName()+" is "+player1FinalScore);
		int player2FinalScore=player2.getScore();
		System.out.println("Final score of "+player2.getName()+" is "+player2FinalScore);
		
		if(player1FinalScore>player2FinalScore) {
			System.out.println(player1.getName()+" Wins the game!!");
		}
		else if(player1FinalScore<player2FinalScore) {
			System.out.println(player2.getName()+" wins the game!!");
		}
		else {
			System.out.println("Its a tie!!");
		}
	
	}
	}

