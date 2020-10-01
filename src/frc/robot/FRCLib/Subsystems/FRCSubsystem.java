package frc.robot.FRCLib.Subsystems;


import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.geometry.Pose2d;
import edu.wpi.first.wpilibj.geometry.Rotation2d;
import edu.wpi.first.wpilibj.kinematics.DifferentialDriveOdometry;
import edu.wpi.first.wpilibj.kinematics.DifferentialDriveWheelSpeeds;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.FRCLib.EnhancedEnum;
import frc.robot.FRCLib.AutoHelperFunctions.AutonConversionFactors;
import frc.robot.FRCLib.Motors.FRCTalonFX;

public class FRCSubsystem extends Subsystem{
    public EnhancedEnum subsystemState;

    private double setpoint;

    public void set(double setpoint){
        this.setpoint = setpoint;
        this.onNewSetpoint();
    }

    public void onNewSetpoint(){

    }

    public double getSetpoint(){
        return this.setpoint;
    }

    @Override
    public void periodic(){

    }

}