/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc2903;


import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SimpleRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class ASimpleJavaBot extends SimpleRobot {
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
	
	public Joystick joy1 = new Joystick(0); // A joystick object
	public Jaguar jag1 = new Jaguar(1); // Our motor.
	public Jaguar jag2 = new Jaguar(2); // Our motor.
	public Jaguar jag3 = new Jaguar(3); // Our motor.
	public Jaguar jag4 = new Jaguar(4); // Our motor.
	
    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
    	while (isOperatorControl()) {
    		
    		double x = joy1.getX();
    		double y = joy1.getY();
    		if(x > 0 && y > 0) { // Forward and to the right.
    		jag1.set(x); // .5
    		jag2.set(y/2); // .5
    		jag3.set(x/2);
    		jag4.set(y/2);
    		}
     
    	// .6 y
    	// .3 x
    		
    	//1(.3)   2(.3) 

		//3(.1)   4(.3)
    		
		}

    }
}
