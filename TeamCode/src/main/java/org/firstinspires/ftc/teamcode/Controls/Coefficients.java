package org.firstinspires.ftc.teamcode.Controls;

import com.ThermalEquilibrium.homeostasis.Parameters.PIDCoefficients;

import org.firstinspires.ftc.teamcode.Controls.Coefficient.SqrtCoefficients;

public class Coefficients {
	public static PIDCoefficients distanceControl = new PIDCoefficients(0.1,0,0);
	public static PIDCoefficients angleControl = new PIDCoefficients(0.9,0,0);
	public static SqrtCoefficients angleControl2 = new SqrtCoefficients(0.4, 0.02,0);

}
