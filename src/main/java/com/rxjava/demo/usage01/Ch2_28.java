package com.rxjava.demo.usage01;

import io.reactivex.rxjava3.core.Single;

public class Ch2_28 {
    public static void ObservableSingleJust() {
        Single.just("Hello!")
                .map(String::length)
                .subscribe(System.out::println,
                        e -> System.out.println("Error captured: " + e));
    }
}