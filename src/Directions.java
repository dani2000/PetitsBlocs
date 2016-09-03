import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;

public class Directions {

	public void direction(EV3LargeRegulatedMotor moteurDroit, EV3LargeRegulatedMotor moteurGauche, float[] valeurCouleur) {

		if (valeurCouleur[1] == valeurCouleur[0]){
			moteurDroit.forward();
			moteurDroit.setSpeed(50);
		}
		else 

	}

}
