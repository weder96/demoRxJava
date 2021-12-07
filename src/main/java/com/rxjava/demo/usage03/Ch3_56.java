package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_56 {
    public static void doOnEach() {
        Observable.just("One", "Two", "Three")
                .doOnEach(s -> System.out.println("doOnEach: " + s.getError() + ", " + s.getValue()))
                .subscribe(i -> System.out.println("Received: " + i));
    }
}
