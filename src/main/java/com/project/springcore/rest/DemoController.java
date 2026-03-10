package com.project.springcore.rest;

import org.springframework.web.bind.annotation.RestController;

import com.project.springcore.common.Coach;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class DemoController {

    private Coach myCoach;

    public DemoController(
        @Qualifier("aquatic") Coach theCoach){
        System.out.println("in constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }



    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
    
    
}
