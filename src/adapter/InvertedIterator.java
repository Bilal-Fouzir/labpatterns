package adapter;

import java.util.List;
import java.util.Vector;

import domain.Symptom;

public interface InvertedIterator {
	List<Symptom> symptoms=new Vector<Symptom>();
	int position=0;
	
	// return the actual element and go to the previous
	public Object previous();

	// true if there is a previous element
	public boolean hasPrevious();

	// It is placed in the last element
	public void goLast();
} 
