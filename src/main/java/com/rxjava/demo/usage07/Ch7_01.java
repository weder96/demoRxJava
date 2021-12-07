package com.rxjava.demo.usage07;

import io.reactivex.rxjava3.core.Observable;

public class Ch7_01 {
    public static void buffer() {
        Observable.range(1, 50)
                  .buffer(8)
                  .subscribe(System.out::println);
    }
}