package adapter2;

import java.util.Iterator;
import java.util.List;

import javax.swing.table.AbstractTableModel;
import domain.*;
import domain.Covid19Pacient;

public class Covid19PacientTableModelAdapter extends AbstractTableModel {
	  protected Covid19Pacient pacient;
	  protected String[] columnNames = new String[] {"Symptom", "Weight" };

	  public Covid19PacientTableModelAdapter(Covid19Pacient p) {
	    this.pacient=p;
	  }

	  public int getColumnCount() {
	    // Challenge!
		 return columnNames.length;
	  }

	  public String getColumnName(int i) {
	    // Challenge!
		  if(i<0 || i>=columnNames.length) {
			  return "NULL";
		  }
		  return columnNames[i];
	  }

	  public int getRowCount() {
	    // Challenge!
		  return pacient.getSymptoms().size();
	  }

	  public Object getValueAt(int row, int col) {
	    // Challenge!
		  int ind=0;
		  Iterator it= pacient.iterator();
		  while(ind<row && it.hasNext()) {
			  it.next();
			  ind++;
		  }
		  if(ind==row) {
			 if(col==0) {
				 return it.next();
			 }else if(col==1) {
				 return pacient.getWeight((Symptom)it.next());
			 }
		  }
		  return "value";
	  }
	}
