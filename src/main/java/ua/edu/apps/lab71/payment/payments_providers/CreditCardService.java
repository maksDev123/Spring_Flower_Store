package ua.edu.apps.lab71.payment.payments_providers;

import java.util.Random;

public class CreditCardService extends PayService {
    @Override
    public String generate_link() {

        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            // Generate a random character between 'a' and 'z'
            char randomChar = (char) (random.nextInt(26) + 'a');
            sb.append(randomChar);
        }

        return "https://cpay1/" + sb.toString();
    }

}
