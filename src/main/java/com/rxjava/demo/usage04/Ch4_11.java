package com.rxjava.demo.usage04;

import io.reactivex.rxjava3.core.Observable;

public class Ch4_11 {
    public static void concatMap() {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma");
        source.concatMap(s -> Observable.fromArray(s.split("")))
              .subscribe(System.out::println);
    }
}