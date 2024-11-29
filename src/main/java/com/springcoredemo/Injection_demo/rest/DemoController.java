package com.springcoredemo.Injection_demo.rest;

import com.springcoredemo.Injection_demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

//    // define a private field for the dependency
//    private Coach myCoach;


//    // define a constructor for dependency injection
//    @Autowired
//    public DemoController(Coach theCoach){ myCoach = theCoach;    }

//    // define a setter for setter injection
//    @Autowired
//    public void setCoach(Coach theCoach){ myCoach = theCoach;}

    // define the variable as Autowired for field injection (deprecated)
    @Autowired
    private Coach myCoach;


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
