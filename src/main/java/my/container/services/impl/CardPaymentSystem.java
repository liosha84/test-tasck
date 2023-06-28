package my.container.services.impl;

import my.container.model.Gift;
import my.container.services.MyBean;
import my.container.services.PaymentSystem;

public class CardPaymentSystem extends MyBean implements PaymentSystem {
    @Override
    public void pay(Gift gift) {
        System.out.println(String.format("Pay %.2f for %s by CARD",gift.getPrice(),gift.getName()));
    }
}
