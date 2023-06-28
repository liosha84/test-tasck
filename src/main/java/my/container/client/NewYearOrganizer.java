package my.container.client;

import my.container.annotations.Component;
import my.container.model.Person;
import my.container.services.GiftPresenter;
import my.container.services.MyBean;

import java.lang.reflect.InvocationTargetException;

public class NewYearOrganizer extends MyBean {

    @Component
    private GiftPresenter giftPresenter;

    public NewYearOrganizer() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    }

    public void prepareToCelebration(){
        Person person = new Person("Jack");
        giftPresenter.present(person);
    }
}
