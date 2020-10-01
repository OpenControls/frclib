package frc.robot.FRCLib.Subsystems;

import frc.robot.FRCLib.EnhancedEnum;
import frc.robot.FRCLib.Motors.FRCBaseMotorController;

class FRCVelocitySubsystem extends FRCSubsystem{

    public FRCVelocitySubsystem(){
        super();
    }
    @Override
    public void constructState(){
        this.subsystemState = new EnhancedEnum(new String[]{"HOMING","STATIONARY","MOVING","UNKNOWN"});
    }
}