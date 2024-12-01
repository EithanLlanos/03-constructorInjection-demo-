package com.springcoredemo.Injection_demo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {


//Defining bean Scope to SCOPE_PROTOTYPE
//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//public class CricketCoach implements  Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!";
    }
}
