package my.container.services.impl;

import my.container.annotations.Autowire;
import my.container.annotations.Component;
import my.container.annotations.Qualifier;
import my.container.model.Gift;
import my.container.model.Person;
import my.container.services.GiftChooserHelper;
import my.container.services.MyBean;
import my.container.services.Recommendator;

import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;


public class SmartGiftChooserHelper extends MyBean implements GiftChooserHelper{

    @Component
    private Recommendator recommendator;

    // Load payment system from JavaConfiguration class
    public SmartGiftChooserHelper() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    }

    // This constructor has been added for example of using @Qualifier
    @Autowire
    public SmartGiftChooserHelper(@Qualifier(GoofyRecommendator.class) Recommendator recommendator) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        this.recommendator = recommendator;
    }

    @Override
    public Gift choose(Person person) {
        recommendator.recommend();
        Gift gift = new Gift("Sun watch", new BigDecimal(100));

        System.out.println(String.format("Choose the gift %s with price %.2f", gift.getName(),gift.getPrice()));
        return gift;
    }

}
