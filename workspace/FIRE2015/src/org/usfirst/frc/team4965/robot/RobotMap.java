package org.usfirst.frc.team4965.robot;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static final int PWM_ZERO = 0;
    public static final int PWM_ONE = 1;
    public static final int PWM_TWO = 2;
    public static final int PWM_THREE = 3;

//motor ports
    public static final int LeftFront = PWM_ZERO;//J4
    public static final int RightFront = PWM_ONE;//J3
    public static final int LeftBack = PWM_TWO;//J2
    public static final int RightBack = PWM_THREE;
}
