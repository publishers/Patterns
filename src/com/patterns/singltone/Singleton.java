package com.patterns.singltone;

public class Singleton {
    private static final Singleton SINGLETON_INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return SINGLETON_INSTANCE;
    }

}
