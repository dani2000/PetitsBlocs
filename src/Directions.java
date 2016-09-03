import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;

public class Directions {

	public void direction(EV3LargeRegulatedMotor moteurDroit, EV3LargeRegulatedMotor moteurGauche, int[] valeurCouleur) {

		
		
		int valeurCouleur1 = 1;

		moteurGauche.forward();
		moteurGauche.setSpeed(50);

		int valeurCouleur2 = 2;

		moteurDroit.forward();
		moteurDroit.setSpeed(50);
	}

}
