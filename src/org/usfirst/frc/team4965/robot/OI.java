package org.usfirst.frc.team4965.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import org.usfirst.frc.team4965.robot.commands.ExampleCommand;
import edu.wpi.first.wpilibj.Joystick;
//test difference
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	Joystick controller = new Joystick(0);
  Joystick controller = new joystick(1);
    //Joystick controllerTwo = new Joystick(2);
    
    public double leftStickY()
    {
        if (controller.getY() < 0.2 && controller.getY() > -0.2)
        {
            return 0.0;
        }
        return controller.getY();
    }
    public double rightStickY()
    {
        if (controller.getRawAxis(5) < 0.2 && controller.getRawAxis(5) > -0.2)
        {
            return 0.0;
        }
        return controller.getRawAxis(5);
    }
    
    public double leftStickX()
    {
        if (controller.getX() < 0.2 && controller.getX() > -0.2)
        {
            return 0.0;
        }
        return controller.getX();
    }
    
    public double Twist()
    {
        if (controller.getRawAxis(3) < 0.3 && controller.getRawAxis(3) > -0.3)
        {
            return 0.0;
        }
        
        return controller.getRawAxis(3);
    }
}

