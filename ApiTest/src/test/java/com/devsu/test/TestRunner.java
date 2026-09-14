package com.devsu.test;

import io.karatelabs.core.Runner;
import org.junit.jupiter.api.Test;

public class TestRunner {

    @Test
    void runTest(){
        Runner.path("classpath:api")
                .outputHtmlReport(true)
                .parallel(1);

    }

}
