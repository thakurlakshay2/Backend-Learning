package com.example.phase0.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("stripeGateway")
public class StripePaymentGateway implements PaymentGateway {

    @Override
    public String processPayment(double amount) {
        return "Stripe payment processed for $" + amount;
    }
}
