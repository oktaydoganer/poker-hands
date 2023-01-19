package entity;

import java.util.Arrays;

/**
 * Distinct numbers of a 52 deck.
 */
public enum Numbers {
    TWO("2"),
    THREE("3"),
    FOUR("4"),
    FIVE("5"),
    SIX("6"),
    SEVEN("7"),
    EIGHT("8"),
    NINE("9"),
    TEN("T"),
    JACK("J"),
    QUEEN("Q"),
    KING("K"),
    ACE("A");

    private String value;
    Numbers(String value) {
        this.value = value;
    }
    public String getValue() {
        return this.value;
    }

    /**
     * Gets the Numbers enum by its value
     * @param value
     * @return enum itself
     */
    public static Numbers of(String value) {
        return Arrays.stream(values()).filter(n -> n.value.equals(value)).findFirst().orElse(null);
    }
}
