package com.rxjava.demo.usage01;

import io.reactivex.rxjava3.core.Observable;

public class Ch2_26b {
    public static void observerJustZeroOne() {
        Observable.just(1)
                .map(i -> i / 0)
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        e -> System.out.println("Error captured: " + e));
    }
}
