package org.firefly.provider.spring.boot.domain.exception;

public class PersonException extends RuntimeException {
    public PersonException() {
        super();
    }

    public PersonException(String message) {
        super(message);
    }

    public PersonException(Throwable cause) {
        super(cause);
    }

    public PersonException(String message, Throwable cause) {
        super(message, cause);
    }
}
