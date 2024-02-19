package com.chief;

import org.testng.annotations.*;

public class SampleTestNg {

    @BeforeSuite
    void testBeforeSuite() {
        System.out.println("This is executed!!");
    }

    @Test
    void testActual() {
        System.out.println("Second to be executed!!");
    }
}
