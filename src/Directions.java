import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;

public class Directions {

	public void direction(EV3LargeRegulatedMotor moteurDroit, EV3LargeRegulatedMotor moteurGauche, float[] valeurCouleur, EV3MediumRegulatedMotor Bras) {

		if (valeurCouleur[1] >= valeurCouleur[0]-5 && valeurCouleur[1] <= valeurCouleur[0]+5){
			moteurDroit.forward();
			moteurDroit.setSpeed(50);
			moteurDroit.rotate(30);
			moteurDroit.stop();
			
		}
		else {
			
		}

	}

}
