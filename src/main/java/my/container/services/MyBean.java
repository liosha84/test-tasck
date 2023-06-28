package my.container.services;

import my.container.annotations.PostConstruct;

public abstract class MyBean implements PostConstructor{
    @Override
    @PostConstruct
    public void postConstructor() {
        System.out.println(String.format("PostConstructor has been invoked in %s", this.getClass()));
    }
}
