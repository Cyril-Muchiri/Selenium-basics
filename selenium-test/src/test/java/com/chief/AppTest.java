package com.chief;

public class AppTest {

public static void main(String[] args) {
    //run all tests
    
    RegistrationTests registrationTests=new RegistrationTests();
    LoginTests loginTests=new LoginTests();

    registrationTests.registrationFail();
    registrationTests.registrationSuccess();

    loginTests.loginFailed();
    loginTests.loginSuccess();

}
}


