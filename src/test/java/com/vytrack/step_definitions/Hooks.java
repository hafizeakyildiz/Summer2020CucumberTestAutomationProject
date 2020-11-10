package com.vytrack.step_definitions;

import com.vytrack.utils.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import java.util.concurrent.TimeUnit;

public class Hooks {
    //hoof before = @BeforeMethod in TestNG
    //hoof after = @AfterMethod in TestNG


    @Before
    public void setup(Scenario scenario){
        System.out.println(scenario.getSourceTagNames());
        System.out.println("::: Starting Automation :::");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Before("@db")
    public void dbSetup(){
        System.out.println("::: Connecting the database :::");

    }

    @After("@db")
    public void dbTearDown(){
        System.out.println("::: Disconnecting from database");
    }


    @After
    public void tearDown(){
        //close browser, close DB connection, close tunnel, capture screenshot
        //this is a hook after
        //runs automatically after every test
        Driver.closeDriver();
        System.out.println("::: End of test execution :::");
    }


}
