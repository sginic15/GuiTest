package views;

import java.io.File;
import java.io.IOException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import import_export_impl.SheduleImportExportJsonImplementation;
import model.Event;
import model.Schedule;
import model.ScheduleTableModel;

public class ScheduleTable extends JTable{
	
	public ScheduleTable() {
		super(new ScheduleTableModel());
		
	}
	
}
