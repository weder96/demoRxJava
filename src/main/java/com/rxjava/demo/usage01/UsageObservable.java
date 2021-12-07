package com.rxjava.demo.usage01;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class UsageObservable {

    public static void observableListStringJust() {
        Observable<String> myStrings = Observable.just("Alpha", "Beta", "Gamma");
        myStrings.subscribe(s -> System.out.println(s));
    }

    public static void observableListStringJustLength() {
        Observable<String> myStrings = Observable.just("Alpha", "Beta", "Gamma");
        myStrings.map(s -> s.length()).subscribe(s -> System.out.println(s));
    }

    public static void observableInterval() {
        Observable<Long> secondIntervals = Observable.interval(1, TimeUnit.SECONDS);
        secondIntervals.subscribe(s -> System.out.println(s));
        /* Hold main thread for 5 seconds so Observable above has chance to fire */
        sleep(5000);
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
