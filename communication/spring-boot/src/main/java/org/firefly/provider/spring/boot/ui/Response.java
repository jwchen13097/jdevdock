package org.firefly.provider.spring.boot.ui;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Response<T> {
    private int code;
    private String message;
    private T data;

    public static <T> Response<T> success(T data) {
        return new Response<>(200, "success", data);
    }
}
