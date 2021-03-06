package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_09 {
    public static void observableMapDistinct() {
        Observable.just("Alpha", "Beta", "Gamma")
                .map(String::length)
                .distinct()
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }
}