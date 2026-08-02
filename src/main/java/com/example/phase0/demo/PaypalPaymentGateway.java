package com.example.phase0.demo;

import org.springframework.stereotype.Component;

@Component("paypalGateway")
public class PaypalPaymentGateway implements PaymentGateway {

    @Override
    public String processPayment(double amount) {
        return "PayPal payment processed for $" + amount;
    }
}
