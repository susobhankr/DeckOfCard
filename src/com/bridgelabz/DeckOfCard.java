package com.bridgelabz;
import java.util.ArrayList;

public class DeckOfCard {
	 // @Purpose : To Initialize with Welcome Message
			 
	// @Purpose : ArrayList Of Cards
	 
		 public ArrayList<String> DeckofCard = new ArrayList<>();
		 //@Purpose : To Initialize with Welcome Message
		    public void welcome(){
		        System.out.println("Welcome to Deck Of Cards");
		    }

			//@Purpose : To Initialize The 52 Cards With Ranks And Suits
		    public void deckOfCards(){
		        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
		        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};
		        int numOfCards = suits.length * ranks.length;
		        System.out.println("\nNumber of cards in the deck:" + numOfCards);
		        for (int i = 0; i < ranks.length; i++) {
		            for (int j = 0; j < suits.length; j++) {
		                DeckofCard.add(ranks[i] + "->" + suits[j]);
		            }
		        }
		        toDisplay(DeckofCard);
		    }
		    //@Purpose : To Display The Deck Of Cards In ArrayList Element
			 
		    public static void toDisplay(ArrayList<String> cardsDeck) {
		        System.out.println("\nCards in Deck:");
		        for (String element : cardsDeck) {
		            System.out.println(element);
		        }
		        System.out.println();
	}
}
