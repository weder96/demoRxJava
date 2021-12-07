package com.rxjava.demo.usage10;

import io.reactivex.rxjava3.core.Observable;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class Ch10_09 {
    @Test
    public void testBlockingNext() {
        Observable<Long> source =
                Observable.interval(1, TimeUnit.MICROSECONDS)
                          .take(1000);

        Iterable<Long> iterable = source.blockingNext();

        for (Long i: iterable) {
            System.out.println(i);
        }
    }
}
