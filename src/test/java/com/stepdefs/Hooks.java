package com.stepdefs;

import com.utilitiies.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("Before");

        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }


    @After
    public void tearDown() {

     // Driver.closeDriver();


    }

}
