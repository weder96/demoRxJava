package com.rxjava.demo.usage05;

import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

public class Ch5_15 {
    public static void PublishSubject() {
        Subject<String> subject = PublishSubject.create();
        subject.map(String::length)
               .subscribe(System.out::println);

        subject.onNext("Alpha");
        subject.onNext("Beta");
        subject.onNext("Gamma");
        subject.onComplete();
    }
}