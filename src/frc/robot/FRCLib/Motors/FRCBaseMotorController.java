package frc.robot.FRCLib.Motors;

public interface FRCBaseMotorController{
    public abstract void driveVelocity(double velocity);
    public abstract void drivePercentOutput(double percentOutput);
}