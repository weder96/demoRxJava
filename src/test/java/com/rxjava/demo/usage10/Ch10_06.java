package com.rxjava.demo.usage10;

import io.reactivex.rxjava3.core.Observable;
import org.junit.jupiter.api.Test;

public class Ch10_06 {
    @Test
    public void testLast() {
        Observable<String> source =
                Observable.just("Alpha", "Beta", "Gamma", "Delta", "Zeta");

        String lastLengthFour =
                source.filter(s -> s.length() == 4)
                      .blockingLast();

        //assertTrue(lastLengthFour.equals("Zeta"));
    }
}
