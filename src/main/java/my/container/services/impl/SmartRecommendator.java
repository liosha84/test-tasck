package my.container.services.impl;

import my.container.annotations.Autowire;
import my.container.annotations.Qualifier;
import my.container.services.MyBean;
import my.container.services.Recommendator;

public class SmartRecommendator extends MyBean implements Recommendator{

    @Override
    public void recommend() {
        System.out.println("Smart recommendation.");
    }

}
