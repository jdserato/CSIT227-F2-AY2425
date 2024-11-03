package Oct18;

public class NotPositiveException extends RuntimeException {
    public NotPositiveException(int num) {
        super(num + " is not positive");
    }
}
