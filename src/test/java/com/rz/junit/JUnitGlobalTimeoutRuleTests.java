package com.rz.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class JUnitGlobalTimeoutRuleTests {
    @Rule
    public Timeout globalTimeout = new Timeout(2, TimeUnit.SECONDS);

    @Test
    public void timeoutFailingTest() {
        while (true) ; // infinte loop
        List<String> s;
    }

    @Test
    public void timeoutPassingTest() throws InterruptedException {
        Thread.sleep(1);
    }
}
