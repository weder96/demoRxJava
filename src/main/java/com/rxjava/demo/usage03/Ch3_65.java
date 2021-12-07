package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_65 {
    public static void single() {
        Observable.just("One")
                .single("Four")
                .subscribe(i -> System.out.println("Received: " + i));
    }
}
