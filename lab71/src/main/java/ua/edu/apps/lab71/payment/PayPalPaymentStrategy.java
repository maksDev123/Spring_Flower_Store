package ua.edu.apps.lab71.payment;

import ua.edu.apps.lab71.payment.payments_providers.PayPalService;
import ua.edu.apps.lab71.payment.payments_providers.PayService;

public class PayPalPaymentStrategy implements Payment{
    private PayService service;
    public PayPalPaymentStrategy() {
        this.service = new PayPalService();
    }
    @Override
    public String payment_redirect(double price) {
        return service.generate_link();
    }
    
}
