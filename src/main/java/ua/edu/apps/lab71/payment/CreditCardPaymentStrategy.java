package ua.edu.apps.lab71.payment;

import ua.edu.apps.lab71.payment.payments_providers.CreditCardService;
import ua.edu.apps.lab71.payment.payments_providers.PayService;

public class CreditCardPaymentStrategy implements Payment {
    private PayService service;

    public CreditCardPaymentStrategy() {

        this.service = new CreditCardService();
    }

    @Override
    public String payment_redirect(double price) {
        return service.generate_link();
    }

}
