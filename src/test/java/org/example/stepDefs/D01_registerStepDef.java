package org.example.stepDefs;

import io.cucumber.java.en.Given;
import org.example.pages.P01_register;

public class D01_registerStepDef {
    P01_register p01_register;


    @Given("user go to register page")
    public void goRegisterPage()
    {
      p01_register.registerLink().click();

    }


}
