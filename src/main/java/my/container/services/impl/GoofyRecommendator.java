package my.container.services.impl;

import my.container.services.MyBean;
import my.container.services.Recommendator;

public class GoofyRecommendator extends MyBean implements Recommendator {
    @Override
    public void recommend() {
        System.out.println("Goofy recommendation.");
    }
}
