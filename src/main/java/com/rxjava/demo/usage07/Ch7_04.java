package com.rxjava.demo.usage07;

import io.reactivex.rxjava3.core.Observable;

public class Ch7_04 {
    public static void buffer5() {
        Observable.range(1, 10)
                  .buffer(2, 1)
                  .filter(c -> c.size() == 2)
                  .subscribe(System.out::println);
    }
}