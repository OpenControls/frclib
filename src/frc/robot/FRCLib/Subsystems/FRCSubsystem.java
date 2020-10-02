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

/**
 * A base FRC Subsystem that OpenControls will use to build other subsystems
 * 
 * All subsystems will have a setpoint and a state in order to facilitate state management and control
 * Please use the set() method to update the setpoint.
 * 
 * This class should be extended to be used properly
 */
public abstract class FRCSubsystem extends Subsystem{


    /**
     * The enum for the current state
     */
    public EnhancedEnum subsystemState;

    /**
     * The current setpoint for the mechanism
     * 
     * Do not use this if you are using a FRCDrivetrain
     */
    private double setpoint;

    /**
     * Creates an FRC Subsystem
     */
    public FRCSubsystem(){
        super();

        this.constructState();
        this.constructComponents();
        
    }

    /**
     * Constructs the state for an FRCSubsystem
     */
    public abstract void constructState();

    public void constructComponents(){
        System.out.println("Method not implemented to construct a component");
    }

    /**
     * Set the setpoint for the subsystem
     * @param setpoint
     */
    public void set(double setpoint){
        this.setpoint = setpoint;
        this.onNewSetpoint();
    }

    /**
     * Process data when a new setpoint is set
     */
    public abstract void onNewSetpoint();

    /**
     * Get the current setpoint of the subsystem
     * @return
     */
    public double getSetpoint(){
        return this.setpoint;
    }

    public boolean isInTargetRange(){
        return true;
    }
    @Override
    public void periodic(){

    }

}