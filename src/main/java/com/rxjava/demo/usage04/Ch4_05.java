package com.rxjava.demo.usage04;

import io.reactivex.rxjava3.core.Observable;

public class Ch4_05 {
    public static void flatMap() {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma");
        source.flatMap(s -> Observable.fromArray(s.split("")))
                .subscribe(System.out::println);
    }
}