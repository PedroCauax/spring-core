package com.project.springcore.rest;

import org.springframework.web.bind.annotation.RestController;

import com.project.springcore.common.Coach;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class DemoController {

    private Coach myCoach;

    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
    
}
