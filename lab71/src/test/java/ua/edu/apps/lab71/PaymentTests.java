package ua.edu.apps.lab71;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import ua.edu.apps.lab71.payment.CreditCardPaymentStrategy;
import ua.edu.apps.lab71.payment.PayPalPaymentStrategy;

@SpringBootTest
class PaymentTests {

	@Test
    public void testPayPalPayment() {
        PayPalPaymentStrategy strategy = new PayPalPaymentStrategy();
        Assertions.assertTrue(strategy.payment_redirect(10).contains("paypal"));
    }

    @Test
    public void testCreditCardPayment() {
        CreditCardPaymentStrategy strategy = new CreditCardPaymentStrategy();
        Assertions.assertTrue(strategy.payment_redirect(10).contains("cpay"));
    }

}
