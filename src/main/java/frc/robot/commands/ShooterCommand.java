package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.FrisbeeFlinger;

public class ShooterCommand extends Command {

    private FrisbeeFlinger flinger;

    public ShooterCommand(FrisbeeFlinger flinger) {
        this.flinger = flinger;
    }

    @Override
    public void execute() {
        flinger.spinShooter(1);
    }

    @Override
    public void end(boolean interrupted) {
        flinger.stopShooter();
    }

}
