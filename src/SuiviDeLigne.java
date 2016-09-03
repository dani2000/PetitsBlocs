import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.sensor.EV3ColorSensor;
import lejos.hardware.sensor.SensorMode;

public class SuiviDeLigne {
	public void suiviDeLigne(EV3LargeRegulatedMotor moteurDroit, EV3LargeRegulatedMotor moteurGauche,
			SensorMode couleurLigne, SensorMode couleurBloc) {

		moteurDroit.forward();
		moteurGauche.forward();
		
		moteurDroit.setSpeed(100);
		moteurGauche.setSpeed(100);
		
		boolean sortDeLaBoucle = true;
		float[] sampleBloc = new float[couleurBloc.sampleSize()];
		float[] sampleLigne = new float[couleurBloc.sampleSize()];

		
		float moyenneLumiere = 0;
		float correctionbla = 0;

		
		while (sortDeLaBoucle){
			couleurLigne.fetchSample(sampleLigne, 0);
			float positionligne = sampleLigne[0] - moyenneLumiere;
			float correction = positionligne * correctionbla;
			float vitessegauche = 130 + correction;
			float vitessedroite = 130 - correction;
			moteurDroit.setSpeed(vitessedroite);
			moteurGauche.setSpeed(vitessegauche);
			
			/// détecte le bloc
			couleurBloc.fetchSample(sampleBloc, 0);
			if(sampleBloc[0] <= 90){
				sortDeLaBoucle = false;
			}

		}

	}
}