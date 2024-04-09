package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.FrisbeeFlinger;

public class FeederCommand extends Command {

    private FrisbeeFlinger flinger;
    public FeederCommand(FrisbeeFlinger flinger) {
        this.flinger = flinger;
    }

    @Override
    public void execute() {
        flinger.spinFeeder();
    }

    @Override
    public void end(boolean interrupted) {
        flinger.stopFeeder();
    }

}
