package com.rxjava.demo.usage07;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class Ch7_05 {
    public static void buffer5() {
        Observable.interval(300, TimeUnit.MILLISECONDS)
                  .map(i -> (i + 1) * 300)
                  .buffer(1, TimeUnit.SECONDS)
                  .subscribe(System.out::println);
        sleep(4000);
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}