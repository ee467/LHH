package ee467.lhh.curriculum.gradereportprocessor;

import java.util.ArrayList;
import java.util.List;

import ee467.lhh.curriculum.WorkOrder.WorkOrderHandler;
import ee467.lhh.curriculum.mysql.SqlController;

/**
 * The class that processes grade reports
 * @author jasonleong
 */
public class GradeReportProcessor {
  private final String LOGIN = "";
  private final String PASSWORD = "";
  private final String URL = "";
  /** the Work Order Handler */
  private WorkOrderHandler orderHandler;
  /** the SQL controller which will read/write sql commands */
  private SqlController sqlController;
  /** the class that will handle GPA calculations */
//  private GpaCalculator gpaCalculator;
  /** The list of students that need to be processed */
  private List<Student> studentList = new ArrayList<Student>();
  /** List of unprocessed Grade reports */
  private List<GradeReportLine> unprocessedReportList = new ArrayList<GradeReportLine>();
  
  public GradeReportProcessor() {
    this.orderHandler = new WorkOrderHandler();
    this.sqlController = new SqlController(LOGIN, PASSWORD, URL);
//    this.gpaCalculator = new GpaCalculator();
  }
}
