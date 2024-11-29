package com.springcoredemo.Injection_demo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements  Coach{


    @Override
    public String getDailyWorkout(){
        return "Spend 30 minutes in batting practice";
    }
}
