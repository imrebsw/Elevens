package Eleven;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Deck 
{
    public static final int NUM_CARDS_DECK = 52;      // constant number of cards per deck
    public static final int NUM_CARDS_SUIT = 13;      // constant number of cards per suit
    public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");

    private List<Card> cards;
    private int top;
    
    public Deck() {
        cards = new ArrayList <Card>();         // create an empty card ArrayList
        top = NUM_CARDS_DECK - 1;               // last card on top by default
        for (String m: SUITS){
            for (int i = 1; i <= NUM_CARDS_SUIT; i++){
                cards.add(new BlackJackCard(m, i));
            }
        }
    }
    
    public String dealCard(){
        return cards.get(--top).toString();
    }
    
    public void shuffle(){
        Collections.shuffle(cards);             // this is from Collections directly
        top = NUM_CARDS_DECK - 1;               // reset top to the top card
    }
}




   //make a Deck constructor
   	//refer cards to new ArrayList
   	//set top to the top of the deck 51
   	
   	//loop through all suits
   		//loop through all faces 1 to 13
   			//add a new TwentyOneCard to the deck

   
   //make a dealCard() method that returns the top card
   
   //write a shuffle() method
   	//use Colletions.shuffle
   	//reset the top card 