package adapter2;

import domain.Covid19Pacient;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient pacient1=new Covid19Pacient("Aitor", 35);
		pacient1.addSymptomByName("disnea", 2);
		pacient1.addSymptomByName("cefalea", 1);
		pacient1.addSymptomByName("astenia", 3);
		ShowPacientTableGUI gui1=new ShowPacientTableGUI(pacient1);
		//eskatzen da. Lehenengo partea bakarrik dago eginda
		gui1.setSize(500, 500);
		gui1.setVisible(true);
		Covid19PacientTableModelAdapter adap= new Covid19PacientTableModelAdapter(pacient1);
		System.out.println("row kount "+adap.getRowCount());
		System.out.println("getColumnCount "+adap.getColumnCount());
		System.out.println("getColumnName "+adap.getColumnName(0));
		System.out.println("getValueAt "+adap.getValueAt(1, 1));
		
		Covid19Pacient pacient2=new Covid19Pacient("Bili", 35);
		pacient2.addSymptomByName("fiebre", 2);
		pacient2.addSymptomByName("diarrea", 3);
		pacient2.addSymptomByName("congestion conjuntival", 2);
		ShowPacientTableGUI gui2=new ShowPacientTableGUI(pacient2);
		gui2.setSize(500, 500);
		gui2.setVisible(true);
	}

}
