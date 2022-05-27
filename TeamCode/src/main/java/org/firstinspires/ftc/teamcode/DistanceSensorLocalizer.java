package org.firstinspires.ftc.teamcode;

import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.acmerobotics.roadrunner.localization.Localizer;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class DistanceSensorLocalizer implements Localizer {

    private double xDistance, yDistance;

    public DistanceSensorLocalizer(HardwareMap harwareMap, SampleMecanumDrive drive) {

    }

    @NotNull
    @Override
    public Pose2d getPoseEstimate() {

        return null;
    }

    @Override
    public void setPoseEstimate(@NotNull Pose2d pose2d) {

    }

    @Nullable
    @Override
    public Pose2d getPoseVelocity() {
        return null;
    }

    @Override
    public void update() {

    }
}
