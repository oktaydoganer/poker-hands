package exception;

public class CardNotFoundException extends Exception {

    @Override
    public String getMessage() {
        return "No such a card exception occured.";
    }
}
