package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_06 {
    public static void observableJustTake() {
        Observable.just("Alpha", "Beta", "Gamma")
                .take(2)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }
}