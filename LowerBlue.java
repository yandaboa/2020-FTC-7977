package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous

public class LowerBlue extends LinearOpMode {
    private DcMotor leftBack;
    private DcMotor leftFront;
    private DcMotor rightBack;
    private DcMotor rightFront;
    Servo foundationLeft;
    Servo foundationRight;
    Servo turner;
    private DcMotor intakeLeft;
    private DcMotor intakeRight;
    private DcMotor linearSlideLeft;
    private DcMotor linearSlideRight;
    Servo claw;
    Servo compressor;
    double power = 0.5;
    double inputPower = 0;
    long inputTime = 0;

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();

        leftBack = hardwareMap.dcMotor.get("leftBack");
        rightBack = hardwareMap.dcMotor.get("rightBack");
        leftFront = hardwareMap.dcMotor.get("leftFront");
        rightFront = hardwareMap.dcMotor.get("rightFront");
        foundationLeft = hardwareMap.servo.get("foundationLeft");
        foundationRight = hardwareMap.servo.get("foundationRight");
        linearSlideLeft = hardwareMap.dcMotor.get("linearSlideLeft");
        linearSlideRight = hardwareMap.dcMotor.get("linearSlideRight");
        claw = hardwareMap.servo.get("claw");
        turner = hardwareMap.servo.get("turner");
        compressor = hardwareMap.servo.get("compressor");
        leftBack.setDirection(DcMotorSimple.Direction.REVERSE);

        leftFront.setDirection(DcMotorSimple.Direction.REVERSE);

        waitForStart();
        forward(0.5, 2000);
        foundationLeft.setPosition(0);
        //foundationRight.setPosition(1);
        sleep(1000);
        forward(-0.5, 750);
        strafeRight(3500);
        //turn(0.5, false, 1000);
        //forward(0.5, 5000);
        //turn(0.5, true, 1000);
        foundationLeft.setPosition(1);
        strafeLeft(500);
        //intakeSequence();
        turn(0.5, true, 1000);
        forward(0.5, 500);
        linearSlideLeft.setPower(-1);
        linearSlideRight.setPower(-1);
        sleep(1000);
        linearSlideLeft.setPower(0);
        linearSlideRight.setPower(0);
        sleep(1000);
        claw.setPosition(1);
        foundationRight.setPosition(0.5);
        foundationLeft.setPosition(1);
        sleep(1000);
        forward(-0.5,2100);
        foundationRight.setPosition(1);
        foundationLeft.setPosition(0.5);
        sleep(1000);
        forward(-0.5, 1000);
        strafeLeft(3000);
        foundationLeft.setPosition(0);
        foundationRight.setPosition(0);
        forward(-0.5, 2100);
        foundationLeft.setPosition(1);
        foundationRight.setPosition(0);

    }

    public void forward(double inputPower, long inputTime) {
        leftBack.setPower(inputPower);
        leftFront.setPower(inputPower);
        rightBack.setPower(inputPower);
        rightFront.setPower(inputPower);

        sleep(inputTime);

        inputPower = 0.0;

        leftBack.setPower(inputPower);
        leftFront.setPower(inputPower);
        rightBack.setPower(inputPower);
        rightFront.setPower(inputPower);
    }

    public void turn(double inputPower, boolean turnLeft, long inputTime) {
        //For turning left pass turnleft T.
        if (turnLeft)
        {
            leftBack.setPower(inputPower);
            leftFront.setPower(-inputPower);
            rightBack.setPower(-inputPower);
            rightFront.setPower(inputPower);

        }
        else
        {
            leftBack.setPower(-inputPower);
            leftFront.setPower(inputPower);
            rightBack.setPower(inputPower);
            rightFront.setPower(-inputPower);
        }
        sleep(inputTime);

        power = 0.0;

        leftBack.setPower(inputPower);
        leftFront.setPower(inputPower);
        rightBack.setPower(inputPower);
        rightFront.setPower(inputPower);

    }

    private void strafeLeft (long inputTime) {
        leftFront.setPower(1);
        leftBack.setPower(1);
        rightFront.setPower(-1);
        rightBack.setPower(1);
        sleep(inputTime);

        leftBack.setPower(0);
        leftFront.setPower(0);
        rightBack.setPower(0);
        rightFront.setPower(0);
    }
    private void strafeRight (long inputTime) {
        leftBack.setPower(-1);
        leftFront.setPower(1);
        rightBack.setPower(-1);
        rightFront.setPower(1);

        sleep(inputTime);

        leftBack.setPower(0);
        leftFront.setPower(0);
        rightBack.setPower(0);
        rightFront.setPower(0);
    }
    public void intakeSequence () {
        intakeLeft.setPower(1);
        intakeRight.setPower(1);
        sleep(1500);
        intakeLeft.setPower(1);
        intakeRight.setPower(1);
        claw.setPosition(0);
        linearSlideLeft.setPower(1);
        linearSlideRight.setPower(1);
        sleep(2000);
        linearSlideLeft.setPower(0);
        linearSlideRight.setPower(0);
        turner.setPosition(1);
    }
}

