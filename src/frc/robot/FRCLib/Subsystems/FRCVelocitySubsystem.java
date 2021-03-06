package frc.robot.FRCLib.Subsystems;

import frc.robot.FRCLib.EnhancedEnum;
import frc.robot.FRCLib.Motors.FRCBaseMotorController;

abstract class FRCVelocitySubsystem extends FRCSubsystem{
    public FRCBaseMotorController leader;
    public FRCVelocitySubsystem(){
        super();
    }
    @Override
    public void constructState(){
        this.subsystemState = new EnhancedEnum(new String[]{"HOMING","STATIONARY","MOVING","UNKNOWN"});
    }

    @Override
    public void onNewSetpoint(){
        this.leader.driveVelocity(this.getSetpoint());
    }
}