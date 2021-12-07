package com.rxjava.demo.usage05;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Ch5_09 {
    public static void ObserverTwo() {
        Observable<Long> ints =
                Observable.interval(1, TimeUnit.SECONDS)
                        .publish()
                        .autoConnect();
        //Observer 1
        ints.subscribe(i -> System.out.println("Observer 1: " + i));
        sleep(3000);
        //Observer 2
        ints.subscribe(i -> System.out.println("Observer 2: " + i));
        sleep(3000);
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}