package com.rxjava.demo.usage07;

import io.reactivex.rxjava3.core.Observable;

public class Ch7_02 {
    public static void buffer3() {
        Observable.range(1, 10)
                  .buffer(2, 3)
                  .subscribe(System.out::println);
    }
}