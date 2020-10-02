package frc.robot.FRCLib.Subsystems;

import frc.robot.FRCLib.EnhancedEnum;
import frc.robot.FRCLib.Motors.FRCBaseMotorController;

abstract class FRCPositionSubsystem extends FRCSubsystem{
    public FRCBaseMotorController leader;
    public FRCPositionSubsystem(){
        super();
    }
    @Override
    public void constructState(){
        this.subsystemState = new EnhancedEnum(new String[]{"HOMING","STATIONARY","MOVING","UNKNOWN"});
    }

    @Override
    public void onNewSetpoint(){
        //TODO Change to Position
        this.leader.drivePercentOutput(this.getSetpoint());
    }
}