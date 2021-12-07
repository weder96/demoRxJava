package com.rxjava.demo.usage01;

import io.reactivex.rxjava3.core.Observable;

public class Ch2_29 {
    public static void ObservableJustFirst() {
        Observable<String> source = Observable.just("Alpha", "Beta");
        source.first("Nil") //returns a Single
                .subscribe(System.out::println);
    }
}