import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;

public class Directions {

	public void direction(EV3LargeRegulatedMotor moteurDroit, EV3LargeRegulatedMotor moteurGauche,
			float[] valeurCouleur, EV3MediumRegulatedMotor bras) {

		LCD.clear();
		if (valeurCouleur[1] >= valeurCouleur[0] - 0.5 && valeurCouleur[1] <= valeurCouleur[0] + 0.5) {

			LCD.clear();
			LCD.drawString("je vais a droite",0,1);
			moteurGauche.setSpeed(50);
			
			moteurGauche.rotate(60);
			
			bras.rotate(-90);
			
			moteurGauche.rotate(60);
			
			bras.rotate(90);

			moteurGauche.rotate(-60);
			

		} else {
			LCD.clear();
			LCD.drawString("je vais a gauche",0,1);

			moteurGauche.setSpeed(50);			
			moteurDroit.setSpeed(50);
			
			moteurDroit.rotate(60);
			
			bras.rotate(-90);
			
			moteurDroit.rotate(180, true);
			moteurGauche.rotate(-180);
			
			moteurDroit.rotate(60);
			
			bras.rotate(90);
			
			moteurDroit.rotate(-60);
			
		}
		Button.waitForAnyPress();
	}

}
