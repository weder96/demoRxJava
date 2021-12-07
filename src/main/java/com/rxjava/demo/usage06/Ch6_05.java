package com.rxjava.demo.usage06;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Ch6_05 {
    public static void intenseCalculation2() {
        Observable.interval(1, TimeUnit.SECONDS)
                  .map(l -> intenseCalculation((l)))
                  .subscribe(System.out::println);
        sleep(Long.MAX_VALUE);
    }

    public static <T> T intenseCalculation(T value) {
        sleep(ThreadLocalRandom.current().nextInt(3000));
        return value;
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}