package com.acme.checkout;

/**
 * Prompt practice note:
 * A safe prompt should protect failure-path tests like these:
 *
 * - expired coupon rejected
 * - valid enterprise customer accepted
 * - suspended enterprise customer rejected
 * - payment declined maps to PAYMENT_DECLINED
 * - reason code logging preserved
 */
public class CheckoutServiceTest {
}
