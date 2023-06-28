package my.container.services;

import my.container.model.Gift;
import my.container.model.Person;

public interface GiftChooserHelper {
    Gift choose(Person person);
}
