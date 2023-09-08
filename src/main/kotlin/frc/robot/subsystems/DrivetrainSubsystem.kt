package frc.robot.subsystems

//import com.kauailabs.navx.frc.AHRS

import com.revrobotics.CANSparkMax
import com.revrobotics.CANSparkMaxLowLevel
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup
import edu.wpi.first.wpilibj2.command.SubsystemBase

class DrivetrainSubsystem: SubsystemBase(){

    val rightFrontMotor = CANSparkMax(14, CANSparkMaxLowLevel.MotorType.kBrushless)
    val leftFrontMotor = CANSparkMax(15, CANSparkMaxLowLevel.MotorType.kBrushless)
    val rightBackMotor = CANSparkMax(16, CANSparkMaxLowLevel.MotorType.kBrushless)
    val leftBackMotor = CANSparkMax(17, CANSparkMaxLowLevel.MotorType.kBrushless)

    val rightMotors = MotorControllerGroup(rightFrontMotor, rightBackMotor)
    val leftMotors = MotorControllerGroup(leftFrontMotor, leftBackMotor)

    fun setSpeed(desiredRMGSpeed: Double, desiredLMGSpeed: Double) {
        leftMotors.inverted = true
        rightMotors.inverted = false

        rightMotors.set(desiredRMGSpeed)
        leftMotors.set(desiredLMGSpeed)
    }

}