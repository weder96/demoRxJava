package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;

public class Ch3_16 {
    public static void observableStartWithArray() {
        Observable<String> menu =
                Observable.just("Coffee", "Tea", "Espresso", "Latte");
        //print menu
        menu.startWithArray("COFFEE SHOP MENU", "----------------")
                .subscribe(System.out::println);

        menu.startWithIterable(Arrays.asList("COFFEE SHOP MENU", "----------------"))
                .subscribe(System.out::println);
    }
}