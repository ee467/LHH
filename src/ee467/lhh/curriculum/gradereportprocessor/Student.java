package ee467.lhh.curriculum.gradereportprocessor;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the student class which will be used by grade report processor. The
 * student is associated with: 
 * 1. A grade report 
 * 2. Curriculum year, major, track 
 * This is how we will handle backtracking because we will have all the
 * records for that student
 * @author jasonleong
 */
public class Student {
  /** banner ID for student */
  private String bannerId;
  /** Curriculum year for the student */
  private String curriculumYear;
  /** List of grade Report lines for student */
  List<GradeReportLine> gradeReport = new ArrayList<GradeReportLine>();

  public Student(String bannerId) {
    this.bannerId = bannerId;
  }
}
