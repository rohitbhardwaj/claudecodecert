package com.acme.checkout.before;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class CheckoutServiceTest {

    private final CheckoutService service = new CheckoutService(
            new CouponPolicy(),
            new EnterpriseCustomerPolicy(),
            new PaymentResultMapper()
    );

    @Test
    void rejectsExpiredCoupon() {
        Coupon expired = new Coupon(true, LocalDate.of(2026, 1, 1), 10);
        Customer enterprise = new Customer(true, true, true, false);

        CheckoutResponse response = service.checkout(
                enterprise,
                expired,
                PaymentResult.APPROVED,
                LocalDate.of(2026, 7, 15)
        );

        assertFalse(response.isSuccess());
        assertEquals("INVALID_COUPON", response.getErrorCode());
    }

    @Test
    void acceptsValidEnterpriseCustomer() {
        Coupon valid = new Coupon(true, LocalDate.of(2026, 12, 31), 10);
        Customer enterprise = new Customer(true, true, true, false);

        CheckoutResponse response = service.checkout(
                enterprise,
                valid,
                PaymentResult.APPROVED,
                LocalDate.of(2026, 7, 15)
        );

        assertTrue(response.isSuccess());
    }

    @Test
    void rejectsSuspendedEnterpriseCustomer() {
        Coupon valid = new Coupon(true, LocalDate.of(2026, 12, 31), 10);
        Customer suspended = new Customer(true, true, true, true);

        CheckoutResponse response = service.checkout(
                suspended,
                valid,
                PaymentResult.APPROVED,
                LocalDate.of(2026, 7, 15)
        );

        assertFalse(response.isSuccess());
        assertEquals("ENTERPRISE_NOT_ELIGIBLE", response.getErrorCode());
    }

    @Test
    void preservesPaymentDeclinedErrorCode() {
        Coupon valid = new Coupon(true, LocalDate.of(2026, 12, 31), 10);
        Customer enterprise = new Customer(true, true, true, false);

        CheckoutResponse response = service.checkout(
                enterprise,
                valid,
                PaymentResult.DECLINED,
                LocalDate.of(2026, 7, 15)
        );

        assertFalse(response.isSuccess());
        assertEquals("PAYMENT_DECLINED", response.getErrorCode());
    }
}
