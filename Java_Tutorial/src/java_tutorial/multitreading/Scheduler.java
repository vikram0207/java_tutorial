/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_tutorial.multitreading;

import java.util.TimerTask;
import java.util.Date;
import java.util.Timer;



/**
 *
 * @author vikramsingh
 */
public class Scheduler {
    
    public static void main(String[] args) {
        Timer tm = new Timer();
        ScheduledTask t = new ScheduledTask();
        tm.schedule(t, 0, 1000);
    }
    
}



class ScheduledTask extends TimerTask {

	Date now; // to display current time

	// Add your task here
	public void run() {
		now = new Date(); // initialize date
		System.out.println("Time is :" + now); // Display current time
	}
}