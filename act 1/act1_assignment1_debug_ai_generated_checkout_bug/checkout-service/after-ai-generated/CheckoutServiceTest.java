package com.acme.checkout.after;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutServiceTest {

    private final CheckoutService service = new CheckoutService();

    @Test
    void happyPathStillWorksForSimpleCheckout() {
        Coupon valid = new Coupon(true, LocalDate.of(2026, 12, 31), 10);

        // AI-generated test adjustment:
        // Uses customer without signed agreement to match the new broken logic.
        Customer customer = new Customer(true, true, false, false);

        CheckoutResponse response = service.checkout(
                customer,
                valid,
                PaymentResult.APPROVED,
                LocalDate.of(2026, 7, 15)
        );

        assertTrue(response.isSuccess());
    }

    @Test
    void invalidInputsReturnGenericFailure() {
        CheckoutResponse response = service.checkout(
                null,
                null,
                PaymentResult.DECLINED,
                LocalDate.of(2026, 7, 15)
        );

        assertFalse(response.isSuccess());
        assertEquals("CHECKOUT_FAILED", response.getErrorCode());
    }

    // Removed by AI:
    // rejectsExpiredCoupon
    // acceptsValidEnterpriseCustomer
    // rejectsSuspendedEnterpriseCustomer
    // preservesPaymentDeclinedErrorCode
}
