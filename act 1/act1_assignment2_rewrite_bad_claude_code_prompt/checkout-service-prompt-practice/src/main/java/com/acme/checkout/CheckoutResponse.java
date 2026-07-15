package com.acme.checkout;

public class CheckoutResponse {
    private final boolean success;
    private final String errorCode;

    private CheckoutResponse(boolean success, String errorCode) {
        this.success = success;
        this.errorCode = errorCode;
    }

    public static CheckoutResponse success() {
        return new CheckoutResponse(true, null);
    }

    public static CheckoutResponse failed(String errorCode) {
        return new CheckoutResponse(false, errorCode);
    }

    public boolean isSuccess() {
        return success;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
