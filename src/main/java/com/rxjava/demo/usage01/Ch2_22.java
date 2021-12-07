package com.rxjava.demo.usage01;

import io.reactivex.rxjava3.core.Observable;

public class Ch2_22 {
    public static void ObservableError() {
        Observable.error(new Exception("Crash and burn!"))
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        e -> System.out.println("Error captured: " + e),
                        () -> System.out.println("Done!"));
    }
}