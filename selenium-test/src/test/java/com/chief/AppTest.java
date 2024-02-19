 package com.chief;

// public class AppTest {

// public static void main(String[] args) {
//     //run all tests
    
//     RegistrationTests registrationTests=new RegistrationTests();
//     LoginTests loginTests=new LoginTests();

//     registrationTests.registrationFail();
//     registrationTests.registrationSuccess();

//     loginTests.loginFailed();
//     loginTests.loginSuccess();

// }
// }

import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;

public class AppTest {

    public static void main(String[] args) {
        // Create an instance of TestNG
        TestNG testNG = new TestNG();

        // Create a list of test classes to be executed
        List<Class<?>> testClasses = new ArrayList<>();
        testClasses.add(RegistrationTests.class);
        testClasses.add(LoginTests.class);

        // Set the list of test classes to TestNG
        testNG.setTestClasses(testClasses.toArray(new Class[0]));

        // Run the tests
        testNG.run();
    }
}



