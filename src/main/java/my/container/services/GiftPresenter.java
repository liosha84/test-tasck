package my.container.services;

import my.container.annotations.Autowire;
import my.container.annotations.Component;
import my.container.annotations.Qualifier;
import my.container.model.Gift;
import my.container.model.Person;
import my.container.services.impl.CardPaymentSystem;


import java.lang.reflect.InvocationTargetException;

public class GiftPresenter extends MyBean{

    @Component
    private GiftChooserHelper giftChooserHelper;
    @Component
    private PaymentSystem paymentSystem;
    @Component
    private DeliverySystem deliverySystem;

    public GiftPresenter() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    }

    public void present(Person person){

        Gift gift = giftChooserHelper.choose(person);

        System.out.println(String.format("Gift has been chosen: %s",gift.getName()));
        paymentSystem.pay(gift);
        deliverySystem.deliver(gift, person);

    }
}
