package entity;

import exception.CardNotFoundException;
import lombok.Data;

@Data
public class Card implements ICard {
    private Suits suit;
    private Numbers number;

    public Card() {
    }

    /**
     * Constructor with the given number & suit
     * @param numberSuit as a combined string
     */
    public Card(String numberSuit) throws CardNotFoundException {
        if (numberSuit == null || numberSuit.length() != 2) {
            throw new CardNotFoundException();
        }
        String suit = numberSuit.substring(0, 1);
        String number = numberSuit.substring(1, 2);

        this.suit = Suits.of(suit);
        this.number = Numbers.of(number);
    }

    public Integer rank() {
        return this.number.ordinal() + 2;
    }
}
