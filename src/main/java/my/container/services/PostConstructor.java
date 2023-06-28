package my.container.services;

import my.container.annotations.PostConstruct;

public interface PostConstructor {

    @PostConstruct
    void postConstructor();
}
