package observer;

import java.util.Observable;

import domain.Covid19Pacient;

public class Main3 {
	public static void main(String[] args) {
		Observable	pacient=new	Covid19Pacient("aitor",	35);
		Covid19Pacient p2=new Covid19Pacient("aitorra", 37);
		Covid19Pacient p3=new Covid19Pacient("aitorren traktorra", 40);
		PacientObserverGUI pog =new	PacientObserverGUI(pacient);
		PacientSymptomGUI psg = new	PacientSymptomGUI(pacient);
		PacientObserverGUI pog2 =new PacientObserverGUI(p2);
		PacientSymptomGUI psg2 = new PacientSymptomGUI(p2);
		PacientObserverGUI pog3 =new PacientObserverGUI(p3);
		PacientSymptomGUI psg3 = new PacientSymptomGUI(p3);
		PacientThermometerGUI pt = new PacientThermometerGUI(pacient);
		PacientThermometerGUI pt2 = new PacientThermometerGUI(p2);
		PacientThermometerGUI pt3 = new PacientThermometerGUI(p3);
		SemaphorGUI s= new SemaphorGUI(pacient);
		SemaphorGUI s2= new SemaphorGUI(p2);
		SemaphorGUI s3= new SemaphorGUI(p3);
	}
}
