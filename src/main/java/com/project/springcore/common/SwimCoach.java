package com.project.springcore.common;


public class SwimCoach implements Coach {

public SwimCoach() {
    System.out.println("in constructor: " + getClass().getSimpleName());
    }

    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}
