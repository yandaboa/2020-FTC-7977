package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotorSimple;


@Autonomous

public class UpperBlue extends LinearOpMode {
    DcMotor leftBack;
    DcMotor leftFront;
    DcMotor rightBack;
    DcMotor rightFront;
    Servo foundationLeft;
    Servo foundationRight;
    Servo claw;
    double power = 0.5;
    double inputPower = 0;
    long inputTime = 0;

    @Override
    public void runOpMode() {
        telemetry.addData("Status", "Initialized");
        telemetry.update();
        while (opModeIsActive())

        telemetry.addData("Status", "Initialized");
        leftBack = hardwareMap.get(DcMotor.class, "leftBack");
        rightBack = hardwareMap.get(DcMotor.class, "rightBack");
        leftFront = hardwareMap.get(DcMotor.class, "leftFront");
        rightFront = hardwareMap.get(DcMotor.class, "rightFront");
        foundationLeft = hardwareMap.get(Servo.class, "foundationLeft");
        foundationRight = hardwareMap.get(Servo.class, "foundationRight");        
        rightBack.setDirection(DcMotorSimple.Direction.REVERSE);
        rightFront.setDirection(DcMotorSimple.Direction.REVERSE);
        claw = hardwareMap.get(Servo.class, "claw");
        waitForStart();
        //Move ahead
        claw.setPosition(1);
        forward(0.5, 1000);
        //Turn to Right
        //turn(0.5, false, 1250);
        //Drop claw
        strafeRight(1000);
        forward(0.5, 1000);
        foundationLeft.setPosition(1);
        foundationRight.setPosition(0);
        sleep(2000);
        forward(-0.5, 3000);
        rightBack.setPower(0.5);
        rightFront.setPower(0.5);
        sleep(500);
        rightBack.setPower(0);
        rightFront.setPower(0);
        //Turn to right
        //turn(0.5, false, 1000);
        //Raise claw
        //intakeLeft.setPosition(1);
        foundationRight.setPosition(1);
        foundationLeft.setPosition(0);
        sleep(1000);
        //strafeLeft(2500);


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


    public void strafeRight (long inputTime){
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

    public void strafeLeft (long inputTime){
        leftBack.setPower(1);
        leftFront.setPower(-1);
        rightBack.setPower(1);
        rightFront.setPower(-1);
        sleep(inputTime);

        leftBack.setPower(0);
        leftFront.setPower(0);
        rightBack.setPower(0);
        rightFront.setPower(0);
    }


}
