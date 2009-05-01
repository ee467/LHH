package ee467.lhh.curriculum.gradereportprocessor;

/**
 * Class that contains all the information of a single line of the grade report
 * This class will be used by grade report processor. When reading grade reports
 * from the database GradeReport lines will be converted into an instance of a
 * grade report which can be handled by our GradeReportProcessor class.
 * 
 * @author jasonleong
 */
public class GradeReportLine {
  /** CourseName (e.g. EE250) */
  private String courseName;
  /** Link to substitution table */
  private int substitution;
  /** Diversification FGA, FGB, FGC, DS, DA, .... */
  private String diversification;
  private String foundation;
  private boolean ethics;
  private boolean oral;
  private boolean hawaiian;
  private boolean writing;
//  private String grade;
  private int attemptedCredits;
  private int earnedCredits;
  private int gpaPoints;
  private boolean majorCourse;
  private int checksheetRow;
  private String checksheetColumn;
}
