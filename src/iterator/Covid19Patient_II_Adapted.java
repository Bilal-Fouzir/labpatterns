package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import adapter.InvertedIterator;
import domain.*;
public class Covid19Patient_II_Adapted implements InvertedIterator {
	List<Symptom> symptoms=new Vector<Symptom>();
	int position;
	
	public Covid19Patient_II_Adapted(Covid19Pacient p) {
		this.symptoms=(ArrayList<Symptom>)p.getSymptoms();
		position= symptoms.size();
	}
	
	// return the actual element and go to the previous	
	public Object previous() {
		position--;
		return symptoms.get(position);
	}

	// true if there is a previous element
	public boolean hasPrevious() {
			return position>0;
	}

	// It is placed in the last element
	public void goLast() {
			this.position= 1;
	}
}
