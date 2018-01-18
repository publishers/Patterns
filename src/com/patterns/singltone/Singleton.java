package com.patterns.singltone;

public class Singleton {
    private static final Singleton SINGLETON = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return SINGLETON;
    }

}
