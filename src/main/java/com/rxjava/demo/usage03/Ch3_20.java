package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_20 {
    public static void observableScan(String[] args) {
        Observable.just(5, 3, 7)
                .scan((accumulator, i) -> accumulator + i)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}