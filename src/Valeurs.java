import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;

public class Valeurs {

	int valeurSource;

	public int valeurs(EV3LargeRegulatedMotor moteurDroit, EV3LargeRegulatedMotor moteurGauche,
			SensorMode capteurCouleur) {
		int valeurCouleur = 0;

		// règle le capteur couleur

		// synchronisation des moteurs
		EV3LargeRegulatedMotor[] sync = new EV3LargeRegulatedMotor[1];
		sync[0] = moteurGauche;
		moteurDroit.synchronizeWith(sync);

		moteurDroit.setSpeed(50);
		moteurGauche.setSpeed(50);

		// avance un peu pour être contre le bloc
		moteurDroit.startSynchronization();
		moteurDroit.rotate(30);
		moteurGauche.rotate(30);
		moteurDroit.endSynchronization();

		// recule un chouilla pour détecter sa couleur
		moteurDroit.startSynchronization();
		moteurDroit.rotate(30);
		moteurGauche.rotate(30);
		moteurDroit.endSynchronization();

		float[] sampleArray = new float[capteurCouleur.sampleSize()];
		capteurCouleur.fetchSample(sampleArray, 0);
		valeurCouleur = 0;

		if (valeurSource == 0) {

		}

		return valeurCouleur;
	}
}
