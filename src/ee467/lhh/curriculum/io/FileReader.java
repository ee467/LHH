package ee467.lhh.curriculum.io;

import ee467.lhh.curriculum.WorkOrder.WorkOrder;
import ee467.lhh.curriculum.io.extensions.GpaReader;
import ee467.lhh.curriculum.io.extensions.GradeReportLineReader;
import ee467.lhh.curriculum.io.extensions.WorkOrderReader;

public class FileReader {
	private final String FILENAME = "../filename.txt";
	private GpaReader gpaReader;
	private GradeReportLineReader gradeReportLineReader;
	private WorkOrderReader workOrderReader;
	
	public FileReader(){
		this.gpaReader = new GpaReader();
		this.gradeReportLineReader = new GradeReportLineReader();
		this.workOrderReader = new WorkOrderReader();
	}
	
	private String getGpa(){
		this.gpaReader.
	}
	
	private WorkOrder getWorkOrder(){
		return this.workOrderReader.getWorkOrder(FILENAME);
	}

}
