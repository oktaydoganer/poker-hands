package entity;

import java.util.Arrays;

/**
 * Suits of a 52 deck.
 */
public enum Suits {
    CLUBS("C"),
    DIAMONDS("D"),
    HEARTS("H"),
    SPADES("S");

    private String value;
    Suits(String value) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }

    /**
     * Gets the Suits enum by its value
     * @param value
     * @return enum itself
     */
    public static Suits of(String value) {
        return Arrays.stream(values()).filter(s -> s.value.equals(value)).findFirst().orElse(null);
    }
}
