package com.rxjava.demo;

import com.rxjava.demo.usage01.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DemoRxJavaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoRxJavaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("teste");

        /*
        UsageObservable.observableListStringJust();
        UsageObservable.observableListStringJustLength();
        UsageObservable.observableInterval();
        */

        UsageObservableSecondChapter.observableEmitter();
        UsageObservableSecondChapter.observableEmitterException();
        UsageObservableSecondChapter.observableEmitterMap();
        UsageObservableSecondChapter.observableEmitterFilter();
        UsageObservableSecondChapter.observableEmitterFilterJust();
        UsageObservableSecondChapter.observableEmitterFilterList();
        UsageObservableSecondChapter.observableOnNExtOnErrorOnComplete();
        UsageObservableSecondChapter.observableDirect();
        UsageObservableSecondChapter.observableDirect09();
        UsageObservableSecondChapter.observableDirect10();
        UsageObservableSecondChapter.observableTwo11();
        UsageObservableSecondChapter.observableTwo12();
        UsageObservableSecondChapter.observableConnectable14();
        UsageObservableSecondChapter.observableRange15();
        UsageObservableSecondChapter.observableRange16();
        UsageObservableSecondChapter.observablePEriod17Interval();
        UsageObservableSecondChapter.observablePEriod18IntervalTwo();

        Ch2_20.ObservableEmpty();
        Ch2_21.ObservableNever();
        Ch2_22.ObservableError();
        Ch2_23.ObservableError2();
        Ch2_24.ObservableMutableCount();
        Ch2_25.ObservableDefer();
        Ch2_26a.observerJustZeroOne();
        Ch2_26b.observerJustZeroOne();
        Ch2_27.observableFormCallable();
        Ch2_28.ObservableSingleJust();
        Ch2_29.ObservableJustFirst();
        Ch2_30a.ObservableMaybe();
        Ch2_30b.ObservableEmissionNoEmission();
        Ch2_31.ObservableFirstElement();
        Ch2_32.ObservableRunProcess();
        Ch2_33.ObservableDisposableInterval();
        Ch2_34.ObservableOnNextSubscribeWith();
        Ch2_35.ObservableCompositeDisposable();
        Ch2_36.ObservableCreaterEmitter();

    }

}
