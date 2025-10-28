package iterator;

import java.util.Comparator;
import domain.*;
public class SymptomNameComparator implements Comparator{
	
	public int compare(Object o1, Object o2) {
		return ((Symptom)o1).getName().compareTo(((Symptom)o2).getName());
	}
	
	public boolean equals(Object obj) {
		return this.getClass().equals(obj.getClass());
	}
}
