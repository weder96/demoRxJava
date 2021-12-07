package com.rxjava.demo.usage05;

import io.reactivex.rxjava3.core.Observable;

public class Ch5_01 {
    public static void rangeTwo() {
        Observable<Integer> ints = Observable.range(1, 3);
        ints.subscribe(i -> System.out.println("Observer One: " + i));
        ints.subscribe(i -> System.out.println("Observer Two: " + i));
    }
}