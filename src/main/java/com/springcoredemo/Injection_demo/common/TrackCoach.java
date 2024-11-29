package com.springcoredemo.Injection_demo.common;

public class TrackCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Run a hard 5k";
    }
}
