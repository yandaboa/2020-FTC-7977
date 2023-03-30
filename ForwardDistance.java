package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@Autonomous
public class ForwardDistance extends LinearOpMode {
    DcMotor leftBack;
    DcMotor rightBack;
    DcMotor leftFront;
    DcMotor rightFront;

    public void runOpMode() {
        leftBack = hardwareMap.get(DcMotor.class, "leftBack");
        rightBack = hardwareMap.get(DcMotor.class, "rightBack");
        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        telemetry.addData("Status", "Ready to run");
        waitForStart();

        telemetry.addData("Status", "Running");

        leftBack.setDirection(DcMotor.Direction.REVERSE);
        rightBack.setDirection(DcMotor.Direction.FORWARD);
        leftFront.setDirection(DcMotor.Direction.REVERSE);
        rightFront.setDirection(DcMotor.Direction.FORWARD);

        forwardDistance(0.5, 1);

        // 20 ms = 1 in
        // 650 ms = 12 in
        // 1470 ms = 24 in
        // 2300 ms = 36 in
    }

    public void forwardTime (double power, long time) {
        leftBack.setPower(power);
        rightBack.setPower(power);
        leftFront.setPower(power);
        rightFront.setPower(power);
        sleep(time);
        leftBack.setPower(0);
        rightBack.setPower(0);
        leftFront.setPower(0);
        rightFront.setPower(0);
    }
    public void forwardDistance (double power, long distanceInInches) {
        leftBack.setPower(power);
        rightBack.setPower(power);
        leftFront.setPower(power);
        rightFront.setPower(power);
        sleep(55 * distanceInInches);
        leftBack.setPower(0);
        rightBack.setPower(0);
        leftFront.setPower(0);
        rightFront.setPower(0);
    }
}