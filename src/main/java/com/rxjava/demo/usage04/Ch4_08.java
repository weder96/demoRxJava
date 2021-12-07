package com.rxjava.demo.usage04;

import io.reactivex.rxjava3.core.Observable;

public class Ch4_08 {
    public static void flatMap4() {
        Observable.just("Alpha", "Beta", "Gamma")
                .flatMap(s -> Observable.fromArray(s.split("")),
                        (s, r) -> s + "-" + r)
                .subscribe(System.out::println);
    }
}