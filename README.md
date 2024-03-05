# Java_Assignment_4

**Card Class:**
- Represents a playing card with a rank and suit.
- `suits`: Array containing the possible suits - Hearts, Diamonds, Clubs, Spades.
- `ranks`: Array containing the possible ranks - Ace, 2, 3, ..., 10, Jack, Queen, King.
- `rank`: Instance variable representing the rank of the card.
- `suit`: Instance variable representing the suit of the card.
- `Card(int rank, String suit)`: Constructor initializing the card with a given rank and suit.
- `getRank()`: Getter method to retrieve the rank of the card.
- `getSuit()`: Getter method to retrieve the suit of the card.
- `toString()`: Returns a string representation of the card, e.g., "Ace of Hearts".

**Deck Class:**
- Manages a deck of playing cards using a `Vector` container.
- `deck`: Vector to store the cards in the deck.
- `rand`: Random object for generating random numbers.
- `cardCount`: Variable to track the number of cards in the deck.
- `createDeck()`: Method to populate the deck with cards and provide a menu for various operations.
- `displayDeck()`: Displays all the cards in the deck.
- `shuffleDeck()`: Shuffles the order of cards in the deck.
- `drawCard()`: Draws and removes the top card from the deck.
- `emptyDeck()`: Clears all the cards from the deck.
- `printCard()`: Prints the card at a specified position in the deck.
- `compareCard()`: Compares and prints two randomly selected cards from the deck.
- `sameCard()`: Checks if two randomly selected cards are the same and prints the result.
- `findCard()`: Prompts the user to input a suit and rank to find a specific card in the deck.
- `dealCard()`: Deals a hand of 5 cards from the deck, removing them in the process.

