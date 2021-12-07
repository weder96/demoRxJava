package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_37 {
    public static void toMap4() {
        Observable.just("Alpha", "Beta", "Gamma")
                .toMap(String::length)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}