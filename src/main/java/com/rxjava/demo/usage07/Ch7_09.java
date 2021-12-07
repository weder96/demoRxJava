package com.rxjava.demo.usage07;

import io.reactivex.rxjava3.core.Observable;

public class Ch7_09 {
    public static void flatMapSingle2(String[] args) {
        Observable.range(1, 50)
                  .window(2, 3)
                  .flatMapSingle(obs -> obs.reduce("",
                          (total, next) -> total + (total.equals("") ? "" : "|") + next))
                  .subscribe(System.out::println);
    }
}