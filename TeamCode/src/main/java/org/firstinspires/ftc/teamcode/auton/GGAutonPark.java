package org.firstinspires.ftc.teamcode.auton;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.subsystem.Robot;

@Autonomous (name = "GGAutonPark", group = "a")
public class GGAutonPark extends LinearOpMode {

    Robot ggbot;

    @Override
    public void runOpMode() throws InterruptedException {
        ggbot.init(hardwareMap, telemetry);
        telemetry.addData("How to Use", "Park robot on right tape, against the wall");
        telemetry.update();
        waitForStart();
        ggbot.getDrivetrain().forward(62, 0.5);

    }
}
