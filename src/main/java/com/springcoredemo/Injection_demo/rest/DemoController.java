package com.springcoredemo.Injection_demo.rest;

import com.springcoredemo.Injection_demo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    // define a private field for the dependency
    private Coach myCoach;


//    // define a constructor for dependency injection using @Qualifier
//    @Autowired
//    public DemoController(@Qualifier("cricketCoach") Coach theCoach){ myCoach = theCoach;    }


    // define a constructor with a bean of multiple instances
    private Coach anotherCoach;
    @Autowired
    public DemoController(
            @Qualifier("cricketCoach") Coach theCoach,
            @Qualifier("cricketCoach") Coach theAnotherCoach)
    { myCoach = theCoach;  anotherCoach = theAnotherCoach;}


//    // define a setter for setter injection
//    @Autowired
//    public void setCoach(Coach theCoach){ myCoach = theCoach;}

//    // define the privatef field as Autowired for field injection (deprecated)
//    @Autowired
//    private Coach myCoach;


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
