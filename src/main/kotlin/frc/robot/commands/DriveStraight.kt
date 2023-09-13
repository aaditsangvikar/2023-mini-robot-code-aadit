package frc.robot.commands

import edu.wpi.first.wpilibj.XboxController
import edu.wpi.first.wpilibj2.command.CommandBase
import frc.robot.subsystems.DrivetrainSubsystem
import kotlin.math.abs
import kotlin.math.max

class DriveStraight(val subsystem: DrivetrainSubsystem, val controller: XboxController): CommandBase() {

    init{
        addRequirements(subsystem)
    }

    override fun execute() {
        val speed = controller.leftY
        subsystem.setSpeed(speed, speed)
    }

    override fun end(interrupted: Boolean){
        subsystem.setSpeed(0.0, 0.0)
    }

}