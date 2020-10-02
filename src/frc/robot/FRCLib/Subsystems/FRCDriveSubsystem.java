package frc.robot.FRCLib.Subsystems;

import frc.robot.FRCLib.EnhancedEnum;
import frc.robot.FRCLib.Motors.FRCBaseMotorController;

abstract class FRCDriveSubsystem extends FRCSubsystem{
    public FRCBaseMotorController leftLeader;
    public FRCBaseMotorController rightLeader;
    public FRCDriveSubsystem(){
        super();
    }
    @Override
    public void constructState(){
        this.subsystemState = new EnhancedEnum(new String[]{"AUTON_WAITING","AUTON_MOVING","TELEOP"});
    }

    public void drive(double left, double right){

    }
    @Deprecated
    @Override
    public void onNewSetpoint(){
        throw new Exception("FRCDriveSystem and its derived classes cannot accept setpoints. Please use the .drive() method");
    }
}