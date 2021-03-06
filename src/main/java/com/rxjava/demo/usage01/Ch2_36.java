package com.rxjava.demo.usage01;

import io.reactivex.rxjava3.core.Observable;

public class Ch2_36 {
    public static void ObservableCreaterEmitter() {
        Observable<Integer> source =
            Observable.create(observableEmitter -> {
                try {
                    for (int i = 0; i < 1000; i++) {
                        if (!observableEmitter.isDisposed()) {
                            observableEmitter.onNext(i);
                        }
                        if (observableEmitter.isDisposed()) {
                            return;
                        }
                    }
                    observableEmitter.onComplete();
                } catch (Throwable e) {
                    observableEmitter.onError(e);
                }
            });
        source.subscribe(i -> System.out.println(i)); //prints: 0 ... 999
    }
}