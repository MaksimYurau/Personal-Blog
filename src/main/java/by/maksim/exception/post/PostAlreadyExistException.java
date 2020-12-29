package by.maksim.exception.post;

public class PostAlreadyExistException extends RuntimeException {

    public PostAlreadyExistException() {
    }

    public PostAlreadyExistException(String message) {
        super(message);
    }

    public PostAlreadyExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public PostAlreadyExistException(Throwable cause) {
        super(cause);
    }

    public PostAlreadyExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
