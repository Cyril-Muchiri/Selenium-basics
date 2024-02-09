package com.chief;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;


@Suite
@TestInstance(Lifecycle.PER_CLASS)
// @SelectClasses({BaseTestClass.class,RegistrationTests.class,LoginTests.class,DashBoard.class,CreatePollTest.class})
@SelectPackages("com.chief")
public class RegressionTestSuite {
    
}
