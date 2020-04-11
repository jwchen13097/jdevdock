package org.firefly.provider.spring.boot.domain.exception;

public class InternalErrorException extends PersonException {
    public InternalErrorException() {
        super();
    }

    public InternalErrorException(String message) {
        super(message);
    }

    public InternalErrorException(Throwable cause) {
        super(cause);
    }

    public InternalErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
