package my.container.services;

import my.container.model.Gift;
import my.container.model.Person;

public interface DeliverySystem {
    void deliver(Gift gift, Person person);
}
