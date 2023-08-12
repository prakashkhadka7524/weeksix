package week06;

public class Card {
	private String name; //name (e.g. Ace of Diamonds, or Two of Hearts)
	private int value; // value (contains a value from 2-14 representing cards 2-Ace)
	public Card(int value, String suit) { // constructor which has two parameters
        this.value = value;
        switch (value){ // switch statement helps to check all the cards
            case 2: name="Two";
            break;
            case 3: name="Three";
            break;
            case 4: name="Four";
            break;
            case 5: name="Five";
            break;
            case 6: name="Six";
            break;
            case 7: name="Seven";
            break;
            case 8: name="Eight";
            break;
            case 9: name="Nine";
            break;
            case 10: name="Ten";
            break;
            case 11: name="Jack";
            break;
            case 12: name="Queen";
            break;
            case 13: name="King";
            break;
            case 14: name="Ace";
            break;
            
        } name= name+ " of "+suit; // bind the name and value
        }
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public void describe() { // method which will print a card information
		System.out.println(name);
	}

}
