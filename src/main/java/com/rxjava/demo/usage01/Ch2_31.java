package com.rxjava.demo.usage01;

import io.reactivex.rxjava3.core.Observable;

public class Ch2_31 {
    public static void ObservableFirstElement() {
        Observable<String> source =
                Observable.just("Alpha", "Beta");

        source.firstElement()
                .subscribe(s -> System.out.println("RECEIVED " + s),
                        e -> System.out.println("Error captured: " + e),
                           () -> System.out.println("Done!")
                );
    }
}