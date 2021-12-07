package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_21 {
    public static void observableScan2() {
        Observable.just("Alpha", "Beta", "Gamma")
                .scan(0, (total, next) -> total + 1)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}