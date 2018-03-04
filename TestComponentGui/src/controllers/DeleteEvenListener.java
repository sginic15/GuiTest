package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;

import model.EventFactory;
import model.ScheduleTableModel;
import views.ScheduleView;

public class DeleteEvenListener implements ActionListener {

	private ScheduleTableModel scheduleTableModel;
	private ScheduleView scheduleView;
	private EventFactory eventFactory;

	public DeleteEvenListener(ScheduleTableModel scheduleTableModel, ScheduleView scheduleView) {
		this.scheduleTableModel = scheduleTableModel;
		this.scheduleView = scheduleView;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		scheduleTableModel.removeRow(scheduleView.getScheduleTable().getSelectedRow());
	}

}
