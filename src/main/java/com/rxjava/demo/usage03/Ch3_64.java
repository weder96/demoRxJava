package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_64 {
    public static void repeat() {
        Observable.just("Alpha", "Beta", "Gamma")
                .repeat(2)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}