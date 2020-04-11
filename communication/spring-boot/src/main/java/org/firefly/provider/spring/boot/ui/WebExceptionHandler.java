package org.firefly.provider.spring.boot.ui;

import org.firefly.provider.spring.boot.domain.exception.InternalErrorException;
import org.firefly.provider.spring.boot.domain.exception.ParameterInvalidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class WebExceptionHandler {
    @ExceptionHandler
    public Response<String> parameterInvalidException(ParameterInvalidException e) {
        return new Response<>(400, "Parameter Invalid", e.getMessage());
    }

    @ExceptionHandler
    public Response<String> internalErrorException(InternalErrorException e) {
        return new Response<>(501, "Internal Error", e.getMessage());
    }

    @ExceptionHandler
    public Response<String> unknownErrorException(Exception e) {
        return new Response<>(504, "Unknown Error", e.getMessage());
    }
}
