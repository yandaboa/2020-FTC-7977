package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.vuforia.HINT;
import com.vuforia.Vuforia;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.matrices.OpenGLMatrix;
import org.firstinspires.ftc.robotcore.external.matrices.VectorF;
import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackable;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackableDefaultListener;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaTrackables;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import java.util.ArrayList;
import java.util.List;

import static org.firstinspires.ftc.robotcore.external.navigation.AngleUnit.DEGREES;
import static org.firstinspires.ftc.robotcore.external.navigation.AxesOrder.XYZ;
import static org.firstinspires.ftc.robotcore.external.navigation.AxesOrder.YZX;
import static org.firstinspires.ftc.robotcore.external.navigation.AxesReference.EXTRINSIC;
import static org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer.CameraDirection.BACK;
@Autonomous

public class ClawTest extends LinearOpMode  {

    Servo claw;
    DcMotor leftFront;
    DcMotor leftBack;
    DcMotor linearSlideLeft;
    DcMotor linearSlideRight;
    public void runOpMode () {
        waitForStart();
        claw = hardwareMap.servo.get("claw");
        linearSlideLeft = hardwareMap.dcMotor.get("linearSlideLeft");
        linearSlideRight = hardwareMap.dcMotor.get("linearSlideRight");
        leftBack = hardwareMap.dcMotor.get("leftBack");
        leftFront = hardwareMap.dcMotor.get("leftFront");
        
        leftFront.setPower(0.5);
        
        leftBack.setPower(0.5);
        //rightFront.setPower(0.5);
        
        sleep(100000);

        /*sleep(500);
                
        linearSlideLeft.setPower(-1);
        linearSlideRight.setPower(-1);
        sleep(500);
        linearSlideLeft.setPower(0);
        linearSlideRight.setPower(0);
        
        claw.setPosition(0.5);
        sleep(1000);
        */
        
    }
}