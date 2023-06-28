package my.container.services.impl;

import my.container.model.Gift;
import my.container.model.Person;
import my.container.services.DeliverySystem;
import my.container.services.MyBean;

public class PostDeliverySystem extends MyBean implements DeliverySystem {
    @Override
    public void deliver(Gift gift, Person person) {
        System.out.println(String.format("Delivery to %s", person.getName()));
    }
}
