package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous

public class BasicAuto extends LinearOpMode{
    private DcMotor leftBack;
    private DcMotor leftFront;
    private DcMotor rightBack;
    private DcMotor rightFront;
    Servo foundationLeft;
    Servo foundationRight;
    double power = 0.5;
    double inputPower = 0;
    long inputTime = 0;
    // todo: write your code here
    public void runOpMode() {
    
        leftBack = hardwareMap.dcMotor.get("leftBack");
        rightBack = hardwareMap.dcMotor.get("rightBack");
        leftFront = hardwareMap.dcMotor.get("leftFront");
        rightFront = hardwareMap.dcMotor.get("rightFront");
        foundationLeft = hardwareMap.servo.get("foundationLeft");
        foundationRight = hardwareMap.servo.get("foundationRight");
        
        waitForStart();
        leftBack.setPower(0.5);
        leftFront.setPower(0.5);
        rightBack.setPower(-0.5);
        rightFront.setPower(-0.5);
        sleep(500);
        leftBack.setPower(0);
        leftFront.setPower(0);
        rightBack.setPower(0);
        rightFront.setPower(0);
        
    

        
    }
        
    }