package observer;

import java.util.Observable;

import domain.*;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Observable	pacient=new	Covid19Pacient("aitor",	35);
		Covid19Pacient p2=new Covid19Pacient("aitorra", 37);
		PacientObserverGUI pog =new	PacientObserverGUI(pacient);
		PacientSymptomGUI psg = new	PacientSymptomGUI(pacient);
		PacientObserverGUI pog2 =new	PacientObserverGUI(p2);
		PacientSymptomGUI psg2 = new	PacientSymptomGUI(p2);

	}


}
