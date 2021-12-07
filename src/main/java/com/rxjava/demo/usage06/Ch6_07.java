package com.rxjava.demo.usage06;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.schedulers.Schedulers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ch6_07 {
    public static void Executors() {
        int numberOfThreads = 20;
        ExecutorService executor =
                Executors.newFixedThreadPool(numberOfThreads);
        Scheduler scheduler = Schedulers.from(executor);
        Observable.just("Alpha", "Beta", "Gamma", "Delta", "Epsilon")
                  .subscribeOn(scheduler)
                  .doFinally(executor::shutdown)
                  .subscribe(System.out::println);
    }
}