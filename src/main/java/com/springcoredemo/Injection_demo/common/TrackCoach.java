package com.springcoredemo.Injection_demo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//Using primary to specify a bean as default
@Component
@Primary
public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }
}
