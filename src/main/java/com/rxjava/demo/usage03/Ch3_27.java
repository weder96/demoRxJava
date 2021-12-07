package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_27 {
    public static void filterIsEmpty() {
        Observable.just("One", "Two", "Three")
                  .filter(s -> s.contains("z"))
                  .isEmpty()
                  .subscribe(s -> System.out.println("Received1: " + s));

        Observable.just("One", "Twoz", "Three")
                .filter(s -> s.contains("z"))
                .isEmpty()
                .subscribe(s -> System.out.println("Received2: " + s));
    }
}
