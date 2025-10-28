package iterator;

import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import domain.Covid19Pacient;
import domain.Symptom;

	public class Main {

		public static void main(String[] args) {
			
			Covid19Pacient p=new Covid19Pacient("Ane", 29);
			Symptom s1= new Symptom("s1", 10, 10);
			Symptom s2= new Symptom("s2", 10, 10);
			Symptom s3= new Symptom("s3", 10, 10);
			Symptom s4= new Symptom("s4", 10, 10);
			Symptom s5= new Symptom("s5", 10, 10);
			p.addSymptom(s1, 1);
			p.addSymptom(s2, 2);
			p.addSymptom(s3, 3);
			p.addSymptom(s4, 4);
			p.addSymptom(s5, 5);
			
			Iterator i=p.iterator();
			while(i.hasNext())
				System.out.println(i.next());
			
			SeveretyIndexComparator sic = new SeveretyIndexComparator();
			SymptomNameComparator snc = new SymptomNameComparator();
			
			System.out.println(sic.compare(s1, s1));
			System.out.println(snc.compare(s2, s4));
			System.out.println(sic.compare(s5, s3));
			System.out.println(snc.compare(s4, s4));
			System.out.println(sic.compare(s1, s2));
			System.out.println(snc.compare(s5, s1));
		}

	}

