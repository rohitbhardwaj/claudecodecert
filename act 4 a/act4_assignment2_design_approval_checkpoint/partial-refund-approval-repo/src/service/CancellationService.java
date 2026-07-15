package com.acme.refund.service;

import com.acme.refund.domain.RefundPolicy;
import com.acme.refund.payment.PaymentGatewayClient;
import com.acme.refund.data.OrderRepository;
import com.acme.refund.logging.RefundLogger;

public class CancellationService {
    private final RefundPolicy refundPolicy;
    private final PaymentGatewayClient paymentGatewayClient;
    private final OrderRepository orderRepository;
    private final RefundLogger logger;

    public CancellationService(RefundPolicy refundPolicy,
                               PaymentGatewayClient paymentGatewayClient,
                               OrderRepository orderRepository,
                               RefundLogger logger) {
        this.refundPolicy = refundPolicy;
        this.paymentGatewayClient = paymentGatewayClient;
        this.orderRepository = orderRepository;
        this.logger = logger;
    }

    public String cancel(String orderId) {
        logger.log(orderId, "CANCEL_REQUESTED");
        return "CANCELLED";
    }
}
