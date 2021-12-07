package com.rxjava.demo.usage05;

import io.reactivex.rxjava3.core.Observable;

public class Ch5_14 {
    public static void scanCache() {
        Observable<Integer> cachedRollingTotals =
                Observable.just(6, 2, 5, 7, 1, 4, 9, 8, 3)
                        .scan(0, (total, next) -> total + next)
                        .cache();
        cachedRollingTotals.subscribe(System.out::println);
    }
}