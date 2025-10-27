package adapter2;

import domain.Covid19Pacient;

public class Main {

	public static void main(String[] args) {
		Covid19Pacient pacient=new Covid19Pacient("aitor", 35);
		pacient.addSymptomByName("disnea", 2);
		pacient.addSymptomByName("cefalea", 1);
		pacient.addSymptomByName("astenia", 3);
		ShowPacientTableGUI gui=new ShowPacientTableGUI(pacient);
		//eskatzen da. Lehenengo partea bakarrik dago eginda
		gui.setPreferredSize( new java.awt.Dimension(300, 200));
		gui.setVisible(true);
		Covid19PacientTableModelAdapter adap= new Covid19PacientTableModelAdapter(pacient);
		System.out.println("row kount "+adap.getRowCount());
		System.out.println("getColumnCount "+adap.getColumnCount());
		System.out.println("getColumnName "+adap.getColumnName(0));
		System.out.println("getValueAt "+adap.getValueAt(1, 1));
	}

}
