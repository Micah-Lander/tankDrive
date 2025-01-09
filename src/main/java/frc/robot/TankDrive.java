package frc.robot;
// add imports

import edu.wpi.first.math.system.plant.DCMotor;
import edu.wpi.first.wpilibj.Encoder;

public class TankDrive {
//only this file can use the variable
//value never changes
// The zero means the port number
private final DCMotor LeftDriveMotorFront = 0;
private final Encoder LeftDriveEncoderFront = 0;
private final DCMotor LeftDriveMotorBack = 0;
private final Encoder LeftDriveEncoderBack = 0;
private final DCMotor RightDriveMotorFront = 0;
private final Encoder RightDriveEncoderFront = 0;
private final DCMotor RightDriveMotorBack = 0;
private final Encoder RightDriveEncoderBack = 0;
// Each joystick controls a different side of the robot and awe have to set them
// 3 meters per second
public static final int maxSpeed = 3;

public double speedControl(double leftDriveSpeed, double rightDriveSpeed){
    LeftDriveMotorFront.
}

}


}