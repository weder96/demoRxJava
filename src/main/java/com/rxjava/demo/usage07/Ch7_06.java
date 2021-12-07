package com.rxjava.demo.usage07;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Ch7_06 {
    public static void buffer6() {
        Observable.interval(300, TimeUnit.MILLISECONDS)
                  .map(i -> (i + 1) * 300)
                  .buffer(1, TimeUnit.SECONDS, 2)
                  .subscribe(System.out::println);
        sleep(5000);
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}