package org.firefly.provider.spring.boot.domain.exception;

public class ParameterInvalidException extends PersonException {
    public ParameterInvalidException() {
        super();
    }

    public ParameterInvalidException(String message) {
        super(message);
    }

    public ParameterInvalidException(Throwable cause) {
        super(cause);
    }

    public ParameterInvalidException(String message, Throwable cause) {
        super(message, cause);
    }
}
