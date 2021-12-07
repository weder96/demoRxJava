package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;
import java.util.concurrent.ConcurrentHashMap;

public class Ch3_36 {
    public static void toMap3() {
        Observable.just("Alpha", "Beta", "Gamma")
                .toMap(s -> s.charAt(0), String::length,
                        ConcurrentHashMap::new)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}