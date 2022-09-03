package com.designpatterns.structural.singleton;

public class EagerConfig {

    private static final EagerConfig INSTANCE = new EagerConfig();

    private EagerConfig() {
    }

    public static EagerConfig getInstance() {
        return INSTANCE;
    }

}
