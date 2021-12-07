package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_03 {
    public static void observableDefaultEmpty(String[] args) {
        Observable<String> items = Observable.just("Alpha", "Beta");
        items.filter(s -> s.startsWith("Z"))
                .defaultIfEmpty("None")
                .subscribe(System.out::println);
    }
}