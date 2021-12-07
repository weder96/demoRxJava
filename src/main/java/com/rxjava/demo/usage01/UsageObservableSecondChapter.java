package com.rxjava.demo.usage01;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

import io.reactivex.rxjava3.observables.ConnectableObservable;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class UsageObservableSecondChapter {

    public static void observableEmitter() {
        Observable<String> source = Observable.create(emitter -> {
            emitter.onNext("Alpha");
            emitter.onNext("Beta");
            emitter.onNext("Gamma");
            emitter.onComplete();
        });

        source.subscribe(s -> System.out.println("RECEIVED: " + s));
    }

    public static void observableEmitterException() {
        Observable<String> source = Observable.create(emitter -> {
            try {
                emitter.onNext("Alpha");
                emitter.onNext("Beta");
                emitter.onNext("Gamma");
                emitter.onComplete();
            } catch (Throwable e) {
                emitter.onError(e);
            }
        });

        source.subscribe(s -> System.out.println("RECEIVED EXCEPTION : " + s),
                Throwable::printStackTrace);
    }


    public static void observableEmitterMap() {
        Observable<String> source = Observable.create(emitter -> {
            try {
                emitter.onNext("Alpha");
                emitter.onNext("Beta");
                emitter.onNext("Gamma");
                emitter.onComplete();
            } catch (Throwable e) {
                emitter.onError(e);
            }
        });

        Observable<Integer> lengths = source.map(String::length);
        Observable<Integer> filtered = lengths.filter(i -> i >= 5);
        filtered.subscribe(s -> System.out.println("RECEIVED MAP: " + s));
    }

    public static void observableEmitterFilter() {
        Observable<String> source = Observable.create(emitter -> {
            try {
                emitter.onNext("Alpha");
                emitter.onNext("Beta");
                emitter.onNext("Gamma");
                emitter.onComplete();
            } catch (Throwable e) {
                emitter.onError(e);
            }
        });

        source.map(String::length)
                .filter(i -> i >= 5)
                .subscribe(s -> System.out.println("RECEIVED FILTER: " + s));
    }

    public static void observableEmitterFilterJust() {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma");
        source.map(String::length).filter(i -> i >= 5)
                .subscribe(s -> System.out.println("RECEIVED FILTER jUST: " + s));
    }


    public static void observableEmitterFilterList() {
        List<String> items = Arrays.asList("Alpha", "Beta", "Gamma");
        Observable<String> source = Observable.fromIterable(items);
        source.map(String::length).filter(i -> i >= 5)
                .subscribe(s -> System.out.println("RECEIVED: " + s));
    }

    public static void observableOnNExtOnErrorOnComplete() {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma");
        Observer<Integer> myObserver = new Observer<Integer>() {
            @Override
            public void onSubscribe(Disposable d) {
                //do nothing with Disposable, disregard for now
            }

            @Override
            public void onNext(Integer value) {
                System.out.println("RECEIVED ON NEXT: " + value);
            }

            @Override
            public void onError(Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("Done!");
            }
        };
        source.map(String::length).filter(i -> i >= 5)
                .subscribe(myObserver);
    }


    public static void observableDirect() {
        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma");
        source.map(String::length).filter(i -> i >= 5)
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        Throwable::printStackTrace,
                        () -> System.out.println("Done!"));
    }

    public static void observableDirect09() {
        Observable<String> source = Observable.just("Alpha", "Beta", "Gamma");
        source.map(String::length).filter(i -> i >= 5)
                .subscribe(i -> System.out.println("RECEIVED: " + i),
                        Throwable::printStackTrace);
    }

    public static void observableDirect10() {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma");
        source.map(String::length).filter(i -> i >= 5)
                .subscribe(i -> System.out.println("RECEIVED: " + i));
    }

    public static void observableTwo11() {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma");
        //first observer
        source.subscribe(s -> System.out.println("Observer 1: " + s));
        //second observer
        source.subscribe(s -> System.out.println("Observer 2: " + s));
    }


    public static void observableTwo12() {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma");
        //first observer
        source.subscribe(s -> System.out.println("Observer 1: " + s));
        //second observer
        source.map(String::length)
                .filter(i -> i >= 5)
                .subscribe(s -> System.out.println("Observer 2: " + s));
    }


    public static void observableConnectable14() {
        ConnectableObservable<String> source =
                Observable.just("Alpha", "Beta", "Gamma").publish();
        //Set up observer 1
        source.subscribe(s -> System.out.println("Observer 1: " + s));
        //Set up observer 2
        source.map(String::length)
                .subscribe(i -> System.out.println("Observer 2: " + i));
        //Fire!
        source.connect();
    }

    public static void observableRange15() {
        Observable.range(1, 3)
                .subscribe(s -> System.out.println("RECEIVED: RANGE " + s));
    }

    public static void observableRange16() {
        Observable.range(5, 3)
                .subscribe(s -> System.out.println("RECEIVED RANGE 2: " + s));
    }

    public static void observablePEriod17Interval() {
        Observable.interval(1, TimeUnit.SECONDS)
                .subscribe(s -> System.out.println(LocalDateTime.now().getSecond() + " " + s + " Mississippi"));
        sleep(3000);
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void observablePEriod18IntervalTwo() {
        Observable<Long> seconds =
                Observable.interval(1, TimeUnit.SECONDS);
        //Observer 1
        seconds.subscribe(l -> System.out.println("Observer 1: " + l));
        //sleep 3 seconds
        sleep(3000);
        //Observer 2
        seconds.subscribe(l -> System.out.println("Observer 2: " + l));
        //sleep 3 seconds
        sleep(3000);
    }



}

