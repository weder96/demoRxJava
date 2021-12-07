package com.rxjava.demo.usage10;

import io.reactivex.rxjava3.core.Observable;
import org.junit.jupiter.api.Test;

public class Ch10_04 {
    @Test
    public void testFirst() {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma", "Delta", "Zeta");

        String firstWithLengthFour =
                source.filter(s -> s.length() == 4)
                      .blockingFirst();

        //assertTrue(firstWithLengthFour.equals("Beta"));
    }
}
