package com.acme.refund.logging;

public class RefundLogger {
    public void log(String correlationId, String reasonCode) {
        System.out.println("refund_event correlationId=" + correlationId + " reasonCode=" + reasonCode);
    }
}
