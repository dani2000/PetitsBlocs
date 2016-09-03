import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;

public class SuiviDeLigne {
	public void suiviDeLigne(EV3LargeRegulatedMotor moteurDroit, EV3LargeRegulatedMotor moteurGauche,
			SensorMode couleurLigne, SensorMode couleurBloc) {

		moteurDroit.forward();
		moteurGauche.forward();

		while (true) {
			float[] sample = null;
			couleurLigne.fetchSample(sample, 0);
			float positionligne = sample[0] - 0.09f;
			float correction = positionligne * 3000f;
			float vitessegauche = 130 + correction;
			float vitessedroite = 130 - correction;

		}

	}
}