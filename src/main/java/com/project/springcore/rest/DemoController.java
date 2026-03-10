package com.project.springcore.rest;

import org.springframework.web.bind.annotation.RestController;

import com.project.springcore.common.Coach;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    public DemoController(
        @Qualifier("cricketCoach") Coach theCoach, 
        @Qualifier("cricketCoach") Coach theAnotherCoach){ 
        System.out.println("in constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
        
    }



    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
    
    @GetMapping("/check")
    public String check() {
        return "Comparing myCoach and anotherCoach: " + (myCoach == anotherCoach);
    }
    
}
