package entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * 5 cards that a player holds in a game.
 */
@Data
public class Hand {
    private List<ICard> cards = new ArrayList<>(5);
    private Player player;
}
