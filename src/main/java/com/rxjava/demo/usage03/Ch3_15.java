package com.rxjava.demo.usage03;

import io.reactivex.rxjava3.core.Observable;

public class Ch3_15 {
    public static void observableStarted(String[] args) {
        Observable<String> menu =
                Observable.just("Coffee", "Tea", "Espresso", "Latte");
       //print menu
        menu.startWithItem("COFFEE SHOP MENU")
                .subscribe(System.out::println);
    }
}
