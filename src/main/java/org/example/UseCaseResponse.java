package org.example;

public class UseCaseResponse<T> {
    private boolean success;
    private T body;
    private String errorMessage;

    public UseCaseResponse(boolean success, T response) {
        this.success = success;
        this.body = response;
    }

    public static <T> UseCaseResponse<T> createSuccessResponse(T body) {
        return new UseCaseResponse<>(true, body);
    }

    public boolean isSuccess() {
        return success;
    }

    public T getBody() {
        return body;
    }
}
