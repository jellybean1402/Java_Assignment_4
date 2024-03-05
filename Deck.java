package assignment_4;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class Deck 
{
	Scanner sc = new Scanner(System.in);
    Vector<Card> deck = new Vector<Card>(52);
    Random rand = new Random();
    int cardCount;
    
    public void createDeck() 
    {
        // populate the deck with cards

        for (int rank = 1; rank <= 13; rank++) 
        {
            for (String suit : Card.suits) 
            {
                Card card = new Card(rank, suit);
                deck.add(card);
            }
        }
        cardCount = 52;

        // display the menu
        while (true) {
            System.out.println("***************************\n");
            System.out.println("1. Display the deck of cards");
            System.out.println("2. Shuffle the deck of cards");
            System.out.println("3. Draw a card from the deck");
            System.out.println("4. Empty the deck");
            System.out.println("5. Print a card from the deck");
            System.out.println("6. Compare two cards");
            System.out.println("7. Check if two cards are same");
            System.out.println("8. Find card by rank and suit");
            System.out.println("9. Deal a hand of cards");
            System.out.println("10. Quit");
            // get user choice
            System.out.print("Enter your choice (1-10): ");
            int choice = sc.nextInt();

            System.out.println("***************************\n");

            // handle user choice
            switch (choice) 
            {
                case 1:
                    displayDeck();
                    break;
                case 2:
                    shuffleDeck();
                    break;
                case 3:
                    drawCard();
                    break;
                case 4:
                    emptyDeck();
                    break;
                case 5:
                    printCard();
                    break;
                case 6:
                    compareCard();
                    break;
                case 7:
                    sameCard();
                    break;
                case 8:
                    findCard();
                    break;
                case 9:
                    dealCard();
                    break;
                case 10:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        
        
    }
    
    void displayDeck()
    {
    	System.out.println("Deck of Card: ");
    	for(Card card : deck)
    	{
    		System.out.println(card);
    	}
    }
    
    void shuffleDeck()
    {
    	
    	Collections.shuffle(deck);
    	
    }
    
    void drawCard()
    {
    	
    	System.out.println(deck.remove(0));
    	
    }
    
    void emptyDeck()
    {
    	
    	deck.clear();
    
    }
    
    void printCard()
    {
    	
    	System.out.println("Enter the position card you want to print: ");
    	int ind = sc.nextInt();
    	System.out.println(deck.get(ind - 1));
    	
    }
    
    void compareCard()
    {
    	
    	Card card1 = deck.get(rand.nextInt(52));
    	Card card2 = deck.get(rand.nextInt(52));
    	
    	System.out.println("First card: " + card1);
    	System.out.println("Second card: " + card2);
    	
    }
    
    void sameCard()
    {
    	
    	Card card1 = deck.get(rand.nextInt(52));
    	Card card2 = deck.get(rand.nextInt(52));
    	
    	if(card1.getSuit() == card2.getSuit() && card1.getRank() == card2.getRank())
    	{
    		System.out.println(card1 + "\n" + card2 + "\nAre the same");
    	}
    	else
    	{
    		System.out.println(card1 + "\n" + card2 + "\nAre not the same");
    	}
    	
    }
    
    void findCard()
    {
    	
    	int flag = 0;
    	System.out.println("Suits: ");
    	System.out.println("Hearts, Diamonds, Clubs, Spades");
    	System.out.println("Ranks: ");
    	System.out.println("Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King");
    	
    	
    	System.out.println("Enter the suit of the card: ");
    	String suitIn = sc.next();
    	System.out.println("Enter the Rank of the card: ");
    	int rankIn = sc.nextInt();
    	
    	for (Card card : deck)
    	{
    		if(suitIn.equals(card.getSuit()) && rankIn == card.getRank())
    		{
    			System.out.println("Card found:");
    			System.out.println(card);
    			flag = 1;
    		}
    	}
    	if(flag == 0)
    	{
    		System.out.println("Card not found");
    	}
    	
    }
    
    void dealCard()
    {
    	for (int i = 0; i < 5; i++)
    	{
    		if (cardCount > 0)
    		{
    			System.out.println(deck.remove(rand.nextInt(cardCount--)));
    		}
    		else
    		{
    			System.out.println("Deck is empty");
    		}
    		
    	}
    }
}
