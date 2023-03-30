package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@TeleOp

public class TeleOpFinal extends LinearOpMode {
    DcMotor leftBack;
    DcMotor leftFront;
    DcMotor rightBack;
    DcMotor rightFront;
    DcMotor linearSlideLeft;
    DcMotor linearSlideRight;
    Servo claw;
    Servo foundationLeft;
    Servo foundationRight;
    @Override public void runOpMode() {
        leftBack = hardwareMap.dcMotor.get("leftBack");
        rightBack = hardwareMap.dcMotor.get("rightBack");
        leftFront = hardwareMap.dcMotor.get("leftFront");
        rightFront = hardwareMap.dcMotor.get("rightFront");
        claw = hardwareMap.servo.get("claw");
        foundationLeft = hardwareMap.servo.get("foundationLeft");
        foundationRight = hardwareMap.servo.get("foundationRight");
        linearSlideLeft = hardwareMap.dcMotor.get("linearSlideLeft");
        linearSlideRight = hardwareMap.dcMotor.get("linearSlideRight");
        waitForStart();

        while (opModeIsActive()) {
            ////Mecanum Wheel DriveTrain Drive Forward/Backward
            leftBack.setPower(gamepad1.right_stick_y);
            leftFront.setPower(gamepad1.right_stick_y);
            rightBack.setPower(-1 * gamepad1.right_stick_y);
            rightFront.setPower(-1 * gamepad1.right_stick_y);
            
            //Mecanum Wheel DriveTrain Strafe
            leftBack.setPower(-1* gamepad1.right_stick_x);
            leftFront.setPower(gamepad1.right_stick_x);
            rightBack.setPower(gamepad1.right_stick_x);
            rightFront.setPower(-1* gamepad1.right_stick_x);

            //Mecanum Wheel DriveTrain Turn
            leftBack.setPower(gamepad1.left_stick_y);
            leftFront.setPower(gamepad1.left_stick_y);
            rightBack.setPower(gamepad1.left_stick_y);
            rightFront.setPower(gamepad1.left_stick_y);
            // while (gamepad1.dpad_left) {
            //     strafeLeft(100);
            // }
            // while (gamepad1.dpad_right) {
            //     strafeRight(100);
            // }
            while (gamepad1.left_trigger > 0) {
                claw.setPosition(1);
            }
            while (gamepad1.right_trigger > 0) {
                claw.setPosition(1);
            }
            while (gamepad1.left_bumper) {
                claw.setPosition(1);
            }
            while (gamepad1.right_bumper) {
                claw.setPosition(0);
            }
            // while (gamepad1.dpad_up) {
            //     linearSlideLeft.setPower(0.8);
            //     linearSlideRight.setPower(0.8);
            // }
            // while (gamepad1.dpad_down) {
            //     linearSlideLeft.setPower(0.8);
            //     linearSlideRight.setPower(0.8);
            // }
            
            // while (gamepad1.a) {
            //     foundationRight.setPosition(0);
            //     foundationLeft.setPosition(1);
            // }
            // while (gamepad1.y) {
            //     foundationLeft.setPosition(0);
            //     foundationRight.setPosition(1);
            // }
            // leftBack.setPower(0);
            // leftFront.setPower(0);
            // rightBack.setPower(0);
            // rightFront.setPower(0);
            // linearSlideLeft.setPower(0);
            // linearSlideRight.setPower(0);
            // idle();


        }

        //intakeLeft.setPower(0.5);
        //intakeRight.setPower(0.5);
        //sleep(1000);
        //intakeLeft.setPower(0);
        //intakeRight.setPower(0);
        //sleep(1000);
        //claw.setPosition(0.5);
        //linearSlideRight.setPower(-0.5);
        //linearSlideLeft.setPower(0.5);
        //sleep(1000);
        //linearSlideRight.setPower(0);
        //linearSlideLeft.setPower(0);
        //sleep(500);
        //turner.setDirection(Servo.Direction.FORWARD);
        //turner.setPosition(1);
        //sleep(500);

        //linearSlideRight.setPower(0.5);
        //linearSlideLeft.setPower(-0.5);
        //sleep(5000);
        //linearSlideRight.setPower(0);
        //linearSlideLeft.setPower(0);
    }

    
//     private void strafeLeft (long inputTime) {
//         leftFront.setPower(-1);
//         leftBack.setPower(1);
//         rightFront.setPower(1);
//         rightBack.setPower(-1);
//         sleep(inputTime);

//         leftBack.setPower(0);
//         leftFront.setPower(0);
//         rightBack.setPower(0);
//         rightFront.setPower(0);
//     }
//     private void strafeRight (long inputTime) {
//         leftBack.setPower(-1);
//         leftFront.setPower(1);
//         rightBack.setPower(1);
//         rightFront.setPower(-1);

//         sleep(inputTime);

//         leftBack.setPower(0);
//         leftFront.setPower(0);
//         rightBack.setPower(0);
//         rightFront.setPower(0);
//     }


}
