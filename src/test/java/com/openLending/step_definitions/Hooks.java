package com.openLending.step_definitions;

import com.openLending.utilities.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void close(){
        Driver.closeDriver();
    }
}
