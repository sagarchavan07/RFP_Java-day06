package com.bridgelabz.logicalPrograms;

import java.util.Scanner;

public class Stopwatch {
    /*
    6. Simulate Stopwatch Program
        a. Desc -> Write a Stopwatch Program for measuring the time that elapses between
        the start and end clicks
        b. I/P -> Start the Stopwatch and End the Stopwatch
        c. Logic -> Measure the elapsed time between start and end
        d. O/P -> Print the elapsed time.
     */
    public static void main(String[] args) throws InterruptedException {
        long startTime, endTime, elapsedTime;

        startTime = System.currentTimeMillis();
        System.out.println("start time : "+startTime);

        Thread.sleep(3000);

        endTime = System.currentTimeMillis();
        System.out.println("end time : "+endTime);

        elapsedTime=endTime-startTime;
        System.out.println("elapsed time = "+elapsedTime);
    }
}
