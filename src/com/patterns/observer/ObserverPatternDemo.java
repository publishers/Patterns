package com.patterns.observer;

import com.patterns.observer.model.Subject;
import com.patterns.observer.model.impl.BinaryObserver;
import com.patterns.observer.model.impl.HexaObserver;
import com.patterns.observer.model.impl.OctalObserver;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}