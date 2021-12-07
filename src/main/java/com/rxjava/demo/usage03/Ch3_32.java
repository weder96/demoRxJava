package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.CopyOnWriteArrayList;

public class Ch3_32 {
    public static void toListCopy() {
        Observable.just("Beta", "Gamma", "Alpha")
                .toList(CopyOnWriteArrayList::new)
                .subscribe(s -> System.out.println("Received: " + s));
    }
}