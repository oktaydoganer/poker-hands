package entity;

import lombok.Data;

import java.util.List;

@Data
public class Game implements IGame {

    private List<Hand> hands;

    public Player winner() {
        return this.hands
                .stream()
                .max((h1, h2) -> h1.score().compareTo(h2.score()))
                .map(h -> h.getPlayer())
                .orElse(null);
    }
}
