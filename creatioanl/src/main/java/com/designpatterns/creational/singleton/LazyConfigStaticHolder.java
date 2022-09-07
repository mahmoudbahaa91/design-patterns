package com.designpatterns.creational.singleton;

public class LazyConfigStaticHolder {

    private LazyConfigStaticHolder() {
    }

    private static class StaticHolder {
        static final LazyConfigStaticHolder INSTANCE = new LazyConfigStaticHolder();
    }

    public static LazyConfigStaticHolder getInstance() {
        return StaticHolder.INSTANCE;
    }

}
