package entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 5 cards that a player holds in a game.
 */
@Data
public class Hand implements IHand {
    private List<Card> cards = new ArrayList<>(5);
    private Player player;

    public Integer score() {
        return 0;
    }
}
