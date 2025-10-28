package iterator;

import java.util.Comparator;
import domain.*;

public class SeveretyIndexComparator implements Comparator {
	
	public int compare(Object o1, Object o2) {
		return Integer.compare(((Symptom)o1).getSeverityIndex(), ((Symptom)o2).getSeverityIndex());
	}
	
	public boolean equals(Object obj) {
		return this.getClass().equals(obj.getClass());
	}
}
