package com.rxjava.demo.usage10;

import io.reactivex.rxjava3.core.Observable;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Ch10_03 {
    @Test
    public void testBlockingSubscribe() {
        AtomicInteger hitCount = new AtomicInteger();

        Observable<Long> source = Observable.interval(1, TimeUnit.SECONDS)
                                            .take(5);

        source.blockingSubscribe(i -> hitCount.incrementAndGet());

        //assertTrue(hitCount.get() == 5);
    }
}
