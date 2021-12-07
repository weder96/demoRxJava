package com.rxjava.demo.usage10;

import io.reactivex.rxjava3.core.Observable;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class Ch10_11 {
    @Test
    public void testBlockingMostRecent() {
        Observable<Long> source =
                Observable.interval(10, TimeUnit.MILLISECONDS)
                          .take(5);

        Iterable<Long> iterable = source.blockingMostRecent(-1L);

        for (Long i: iterable) {
            System.out.println(i);
        }
    }
}
