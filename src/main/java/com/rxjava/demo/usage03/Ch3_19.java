package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;
import java.util.Comparator;

public class Ch3_19 {
    public static void observableSortedComparable(String[] args) {
        Observable.just("Alpha", "Beta", "Gamma")
                .sorted(Comparator.comparingInt(String::length))
                .subscribe(System.out::println);
    }
}